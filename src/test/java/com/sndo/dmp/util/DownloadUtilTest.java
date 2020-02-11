package com.sndo.dmp.util;

import org.junit.Test;

public class DownloadUtilTest {

    @Test
    public void testDownload() {
        String url = "https://data.leisu.com/zuqiu-8814";
        String html = DownloadUtils.defaultDownload(url);
        System.out.println(html);
    }
}
