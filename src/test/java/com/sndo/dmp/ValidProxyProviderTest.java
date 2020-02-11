package com.sndo.dmp;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;
import org.junit.Test;
import us.codecraft.webmagic.proxy.Proxy;

public class ValidProxyProviderTest {

    @Test
    public void test() throws InterruptedException {
        ValidProxyProvider validProxyProvider = initProxyProvider();
        for (int i = 0; i < 50; i++) {
            Proxy proxy = validProxyProvider.getProxy(null);

            if (i % 10 == 0) {
                validProxyProvider.setInvalid(proxy);
            } else {
                validProxyProvider.returnProxy(proxy, null, null);
            }

            Thread.sleep(1 * 1000);
        }
    }

    private ValidProxyProvider initProxyProvider() {
        return new ValidProxyProvider(10);
    }
}
