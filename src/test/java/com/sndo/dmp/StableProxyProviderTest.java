package com.sndo.dmp;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.db.MongoServer;
import com.sndo.dmp.util.ProxyUtils;
import org.bson.Document;
import org.junit.Test;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.proxy.Proxy;

import java.io.IOException;


public class StableProxyProviderTest {

//    @Test
//    public void testProvider() {
//        List<Proxy> proxies = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            Proxy proxy = new Proxy(i + "", i);
//            proxies.add(proxy);
//        }
//
//        ValidProxyProvider proxyProvider = new ValidProxyProvider(proxies);
//        Proxy proxy = proxyProvider.getProxy(null);
//        System.out.println(proxy.toString());
//
//        proxyProvider.returnProxy(proxy, null, null);
//        proxyProvider.setInvalid(proxy);
//        System.out.println("======================");
//
//        List<Proxy> proxies1 = proxyProvider.getProxies();
//        for (Proxy proxy1 : proxies1) {
//            System.out.println(proxy1.toString());
//        }
//
//        System.out.println("======================");
//
//        ConcurrentHashMap<Proxy, Boolean> proxyStatusMap = proxyProvider.getProxyStatusMap();
//        Set<Map.Entry<Proxy, Boolean>> entries = proxyStatusMap.entrySet();
//        for (Map.Entry<Proxy, Boolean> entry : entries) {
//            System.out.println(entry.getKey() + " ==> " + entry.getValue());
//        }
//    }

    @Test
    public void testInsert() {
        MongoCollection<Document> collection = MongoServer.getCollection("proxy", "leisu");
        Document document = collection.find(new Document("status", 0)).sort(new Document("num", 1)).first();
        collection.updateOne(document, new Document("$inc", new Document("num", 1)));
        Proxy proxy = new Proxy(document.getString("addr"), document.getInteger("port"));
        System.out.println(proxy.toString());
    }

    private Request initRequest() {
        Request request = new Request();
        request.setUrl("https://data.leisu.com/zuqiu-8780");
        request.putExtra(Constants.PAGE_INDEX, 0);

        return request;
    }

    @Test
    public void testCheck() throws IOException {
//        HttpClientGenerator httpClientGenerator = new HttpClientGenerator();
//        HttpUriRequestConverter httpUriRequestConverter = new HttpUriRequestConverter();
//
//        HttpClientRequestContext requestContext = httpUriRequestConverter.convert(initRequest(), Site.me(), new Proxy("218.60.8.99", 3129));
//
//        CloseableHttpClient httpClient = httpClientGenerator.getClient(Site.me());
//
//        CloseableHttpResponse httpResponse = httpClient.execute(requestContext.getHttpUriRequest(), requestContext.getHttpClientContext());
//        int statusCode = httpResponse.getStatusLine().getStatusCode();
//        System.out.println(statusCode);
//
//        httpResponse.close();
        boolean valid = ProxyUtils.isValid(new Proxy("218.60.8.99", 3129));
        System.out.println(valid);
    }


}
