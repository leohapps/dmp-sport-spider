package com.sndo.dmp.util;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;

public class FootballUrlUtils {

    public static String createSeasonUrl(int seasonId) {
        return "https://data.leisu.com/zuqiu-" + seasonId;
    }

    private static MongoCollection<Document> collection = MongoServer.getCollection("football", "html");

    public static String getHtml(String url) {
        Document htmlDoc = collection.find(new Document("url", url)).first();
        if (htmlDoc == null || htmlDoc.isEmpty()) {
            return null;
        } else {
            return  htmlDoc.getString("html");
        }
    }

    public static void insertHtml(String url, String html) {
        Document doc = new Document();
        doc.put("url", url);
        doc.put("html", html);

        collection.insertOne(doc);
    }

}
