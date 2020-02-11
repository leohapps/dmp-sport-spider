package com.sndo.dmp;

import com.sndo.dmp.util.Zlib;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class ClientTest {

    @Test
    public void testPost() throws IOException {
        Connection connect = Jsoup.connect("http://192.168.110.129:8080/p");

        connect.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        connect.header("accept-encoding", "gzip, deflate");
        connect.header("accept-language", "en-US,en;q=0.8");
        connect.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36");

        connect.ignoreContentType(true);
        connect.method(Connection.Method.POST);

        connect.data("project", "test");
        connect.requestBody(getData());

        connect.execute();
    }

    @Test
    public void testGet() throws IOException {
        Connection connect = Jsoup.connect("http://192.168.110.129:8080/g");

        connect.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        connect.header("accept-encoding", "gzip, deflate");
        connect.header("accept-language", "en-US,en;q=0.8");
        connect.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36");

        connect.data("project", "test");
        connect.data("data", getData());

        connect.ignoreContentType(true);
        connect.method(Connection.Method.GET);

        connect.execute();
    }

    private String getData() {
        String data = "{\"data\" : \"hello China\"}";
        byte[] compress = Zlib.compress(data.getBytes());
        final BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(compress);

        return encode;
    }

}
