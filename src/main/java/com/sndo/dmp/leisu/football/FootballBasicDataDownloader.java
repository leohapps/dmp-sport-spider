package com.sndo.dmp.leisu.football;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.selector.PlainText;

public class FootballBasicDataDownloader extends HttpClientDownloader {

    private final MongoCollection<Document> collection;

    public FootballBasicDataDownloader() {
        collection = MongoServer.getCollection("leisu-football", "html");
    }

    @Override
    public Page download(Request request, Task task) {
        String url = request.getUrl();

        boolean exist = isExist(url);
        if (exist) {
            String html = getHtml(url);
            return initPage(html, request);
        } else {
            System.out.println("download: " + request.getUrl());
            return super.download(request, task);
        }
    }

    private Page initPage(String html, Request request) {
        Page page = new Page();
        page.setBytes(html.getBytes());
        page.setRawText(html);
        page.setStatusCode(200);
        page.setUrl(new PlainText(request.getUrl()));
        page.setRequest(request);
        page.setDownloadSuccess(true);

        return page;
    }

    private boolean isExist(String url) {
        Document htmlDoc = collection.find(new Document("url", url)).first();
        if (htmlDoc == null || htmlDoc.isEmpty()) {
            return false;
        } else {
            return  true;
        }
    }

    private String getHtml(String url) {
        Document htmlDoc = collection.find(new Document("url", url)).first();
        return  htmlDoc.getString("html");
    }

}
