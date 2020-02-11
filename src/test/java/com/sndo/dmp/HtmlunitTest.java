package com.sndo.dmp;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;

import java.io.IOException;

public class HtmlunitTest {

    @Test
    public void testLoadJs() throws IOException {
        WebClient wc = new WebClient(BrowserVersion.CHROME);
        wc.setJavaScriptTimeout(10 * 1000);
        wc.getOptions().setUseInsecureSSL(true);//接受任何主机连接 无论是否有有效证书
        wc.getOptions().setJavaScriptEnabled(true);//设置支持javascript脚本
        wc.getOptions().setCssEnabled(false);//禁用css支持
        wc.getOptions().setThrowExceptionOnScriptError(false);//js运行错误时不抛出异常
        wc.getOptions().setTimeout(100000);//设置连接超时时间
        wc.getOptions().setDoNotTrackEnabled(false);

        HtmlPage page = wc.getPage("https://data.leisu.com/zuqiu-9026");

        // 让球:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.concedePoints.select(this,2)");
        // 进球数:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.size.select(this,2)");
        // 半全场:主场
        page.executeJavaScript("javascript:dataBaseCommon.doubleResult.select(this,2)");

        String html = page.asXml();

//        insert2mongo("https://data.leisu.com/zuqiu-9026?a=2&b=2&c=2", html);

        // 让球:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.concedePoints.select(this,3)");
        // 进球数:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.size.select(this,3)");
        // 半全场:主场
        page.executeJavaScript("javascript:dataBaseCommon.doubleResult.select(this,3)");

        html = page.asXml();

//        insert2mongo("https://data.leisu.com/zuqiu-9026?a=3&b=3&c=3", html);

        // 让球:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.concedePoints.select(this,4)");
        // 进球数:主场盘路
        page.executeJavaScript("javascript:dataBaseCommon.size.select(this,4)");
        // 半全场:主场
        page.executeJavaScript("javascript:dataBaseCommon.doubleResult.select(this,3)");

//        insert2mongo("https://data.leisu.com/zuqiu-9026?a=4&b=4&c=3", html);
    }

}
