package com.sndo.dmp.util;

import com.sndo.dmp.Constants;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.downloader.HttpClientGenerator;
import us.codecraft.webmagic.downloader.HttpClientRequestContext;
import us.codecraft.webmagic.downloader.HttpUriRequestConverter;
import us.codecraft.webmagic.proxy.Proxy;

import java.io.IOException;

public class ProxyUtils {

    private static HttpClientGenerator httpClientGenerator = new HttpClientGenerator();
    private static HttpUriRequestConverter httpUriRequestConverter = new HttpUriRequestConverter();
    private static CloseableHttpClient httpClient = httpClientGenerator.getClient(Site.me());

    public static boolean isValid(Proxy proxy) {
        CloseableHttpResponse httpResponse = null;

        try {
            HttpClientRequestContext requestContext = httpUriRequestConverter.convert(initRequest(), Site.me(), proxy);
            httpResponse = httpClient.execute(requestContext.getHttpUriRequest(), requestContext.getHttpClientContext());
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return false;
    }

    private static Request initRequest() {
        Request request = new Request();
        request.setUrl("https://data.leisu.com/zuqiu-8780");
        request.putExtra(Constants.PAGE_INDEX, 0);

        return request;
    }


}
