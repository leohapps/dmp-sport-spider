package com.sndo.dmp.leisu.basketball;

import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;

import java.util.ArrayList;
import java.util.List;

public class BasketballBasicDataTask {

    public static void main(String[] args) throws Exception {
        Request request = new Request();
        request.setUrl("https://data.leisu.com/lanqiu");
        request.putExtra(Constants.PAGE_INDEX, 0);

        List<SpiderListener> spiderListeners = new ArrayList<>();
        spiderListeners.add(new BasketballBasicDataListener());

        Spider.create(new BasketballBasicDataProcessor())
                .setScheduler(new BasketballBasicDataScheduler())
                .setDownloader(new BasketballBasicDataDownloader())
                .addPipeline(new BasketballBasicDataPipeline())
                .addRequest(request)
                .setSpiderListeners(spiderListeners)
                .thread(1)
                .setExitWhenComplete(false)
                .run();

        MongoServer.close();
    }

}
