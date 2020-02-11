package com.sndo.dmp.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class DownloadUtils {

    public static String defaultDownload(String url) {
        Connection connection = Jsoup.connect(url);

        connection.timeout(20000)
                .header("Accept", "*/*")
                .followRedirects(true)
                .ignoreHttpErrors(true)
                .ignoreContentType(true)
                .header("Accept-Language", "zh-CN")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        try {
            Connection.Response response = connection.execute();
            if (response == null) {
                return null;
            }

            int status = response.statusCode();
            byte[] content = response.bodyAsBytes();
            if (!isValid(status)) {
                return null;
            }

            if (content == null) {
                return null;
            }

            return new String(content, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static boolean isValid(int status) {
        return status != 404 && status != 403 && status < 500;
    }
}
