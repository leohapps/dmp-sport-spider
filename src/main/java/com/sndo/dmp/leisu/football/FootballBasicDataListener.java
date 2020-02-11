package com.sndo.dmp.leisu.football;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.SpiderListener;

public class FootballBasicDataListener implements SpiderListener {

    private final MongoCollection<Document> collection;

    public FootballBasicDataListener() {
        collection = MongoServer.getCollection("leisu-football", "urls");
    }

    @Override
    public void onSuccess(Request request) {
        int pageIndex = (Integer) request.getExtra(Constants.PAGE_INDEX);
        String url = request.getUrl();

        Document filter = new Document();
        filter.put("url", url);
        filter.put("index", pageIndex);

        Document update = new Document("$set", new Document("status", 1));

        collection.findOneAndUpdate(filter, update);
    }

    @Override
    public void onError(Request request) {
        // nothing
    }

}
