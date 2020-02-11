package com.sndo.dmp.leisu.basketball;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import org.bson.Document;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.scheduler.Scheduler;

public class BasketballBasicDataScheduler implements Scheduler {

    private final MongoCollection<Document> collection;

    public BasketballBasicDataScheduler() {
        collection = MongoServer.getCollection("leisu-basketball", "urls");
    }

    @Override
    public void push(Request request, Task task) {
        int pageIndex = (Integer) request.getExtra(Constants.PAGE_INDEX);
        String referer = (String) request.getExtra(Constants.PAGE_REFERER);
        String url = request.getUrl();

        if (!isExist(url, pageIndex)) {
            doInsert(url, referer, pageIndex);
        }
    }

    private boolean isExist(String url, int pageIndex) {
        Document doc = new Document();
        doc.put("url", url);
        doc.put("index", pageIndex);

        Document result = collection.find(doc).first();

        return result != null;
    }

    private void doInsert(String url, String referer, int pageIndex) {
        Document doc = new Document();
        doc.put("url", url);
        doc.put("referer", referer);
        doc.put("index", pageIndex);
        doc.put("num", 0);

        doc.put("status", 0);
        collection.insertOne(doc);
    }

    @Override
    public Request poll(Task task) {
        Document filter = new Document();
        filter.put("status", 0);
        filter.put("num", new Document("$lte", 1));

        Document update = new Document();
        update.put("$set", new Document("status", 2));
        update.put("$inc", new Document("num", 1));

        Document result = collection.findOneAndUpdate(filter, update);
        if (result != null) {
            Request request = new Request();
            request.setUrl(result.getString("url"));

            request.putExtra(Constants.PAGE_REFERER,
                    result.getString("referer"));

            request.putExtra(Constants.PAGE_INDEX,
                    result.getInteger("index"));

            return request;
        } else {
            return null;
        }
    }
}