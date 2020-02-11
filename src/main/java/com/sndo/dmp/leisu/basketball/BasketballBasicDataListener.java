package com.sndo.dmp.leisu.basketball;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.SpiderListener;

public class BasketballBasicDataListener implements SpiderListener {

    private final MongoCollection<Document> collection;

    public BasketballBasicDataListener() {
        collection = MongoServer.getCollection("leisu-basketball", "urls");
    }

    @Override
    public void onSuccess(Request request) {
        Document filter = new Document();
        filter.put("url", request.getUrl());
        filter.put("index", ((Integer) request.getExtra(Constants.PAGE_INDEX)));

        Document update = new Document("$set", new Document("status", 1));

        collection.findOneAndUpdate(filter, update);
    }

    @Override
    public void onError(Request request) {
        // nothing
    }

}
