package com.sndo.dmp;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.db.MongoServer;
import com.sndo.dmp.util.ProxyUtils;
import org.bson.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.ProxyProvider;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ValidProxyProvider implements ProxyProvider {

    private ConcurrentHashMap<Proxy, Boolean> proxyStatusMap;
    private List<Proxy> proxies;

    // 15
    public ValidProxyProvider(int num) {
        this.proxies = Collections.synchronizedList(new ArrayList<Proxy>());
        this.proxyStatusMap = new ConcurrentHashMap<>();
        for (int i = 0; i < num; i++) {
            Proxy validProxy = getValidProxy();
            this.proxies.add(validProxy);
            this.proxyStatusMap.put(validProxy, true);    // true: 有效, false: 无效
        }

        initProxyManager();
    }

    public void setInvalid(Proxy proxy) {
        proxyStatusMap.put(proxy, false);
    }

    private void initProxyManager() {
        Thread managerThread = new Thread(new ProxyManager());
        managerThread.setDaemon(true);
        managerThread.start();
    }

    // TODO TEST
    public ConcurrentHashMap<Proxy, Boolean> getProxyStatusMap() {
        return this.proxyStatusMap;
    }

    // TODO TEST
    public List<Proxy> getProxies() {
        return this.proxies;
    }

    @Override
    public void returnProxy(Proxy proxy, Page page, Task task) {
        proxies.add(proxy);
    }

    @Override
    public Proxy getProxy(Task task) {
        return proxies.remove(0);
    }

    class ProxyManager implements Runnable {

        @Override
        public void run() {
            while (true) {
                Set<Map.Entry<Proxy, Boolean>> entries = proxyStatusMap.entrySet();
                for (Map.Entry<Proxy, Boolean> entry : entries) {
                    Proxy proxy = entry.getKey();
                    Boolean status = entry.getValue();
                    if (!status) {
                        proxyStatusMap.remove(proxy);
                        setStatus2Invalid(proxy);

                        Proxy validProxy = getValidProxy();

                        proxyStatusMap.put(validProxy, true);
                        proxies.add(validProxy);

                        print();
                    }
                }
            }
        }

        // TODO 测试
        private void print() {
            List<Proxy> proxies1 = getProxies();
            int i = 0;
            for (Proxy proxy1 : proxies1) {
                System.out.println((i++) + "proxy: " + proxy1.toString());
            }

            ConcurrentHashMap<Proxy, Boolean> proxyStatusMap = getProxyStatusMap();
            Set<Map.Entry<Proxy, Boolean>> entries = proxyStatusMap.entrySet();
            int x = 0;
            for (Map.Entry<Proxy, Boolean> entry : entries) {
                System.out.println((x++) + "key:" + entry.getKey() + "; value: " + entry.getValue());
            }
        }

    }

    public Proxy getValidProxy() {
        Proxy proxy = null;
        while (true) {
            proxy = findOne();
            boolean valid = isValid(proxy);
            if (valid) {
                break;
            } else {
                setStatus2Invalid(proxy);
            }
        }

        return proxy;
    }

    private Proxy findOne() {
        MongoCollection<Document> collection = MongoServer.getCollection("proxy", "leisu");
        Document document = collection.find(new Document("status", 0)).sort(new Document("num", 1)).first();
        collection.updateOne(document, new Document("$inc", new Document("num", 1)));

        return new Proxy(document.getString("addr"), document.getInteger("port"));
    }

    private boolean isValid(Proxy proxy) {
        return ProxyUtils.isValid(proxy);
    }

    private void setStatus2Invalid(Proxy proxy) {
        MongoCollection<Document> collection = MongoServer.getCollection("proxy", "leisu");
        Document doc = new Document();
        doc.put("addr", proxy.getHost());
        doc.put("port", proxy.getPort());

        collection.updateOne(doc, new Document("$set", new Document("status", 2)));
    }




}


