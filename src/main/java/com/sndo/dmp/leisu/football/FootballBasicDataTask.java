package com.sndo.dmp.leisu.football;

import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;

import java.util.ArrayList;
import java.util.List;

public class FootballBasicDataTask {

    public static void main(String[] args) throws Exception {
        Request request = new Request();
        request.setUrl("https://data.leisu.com/zuqiu-8780");
        request.putExtra(Constants.PAGE_INDEX, 0);

        List<SpiderListener> spiderListeners = new ArrayList<>();
        spiderListeners.add(new FootballBasicDataListener());

        FootballBasicDataScheduler footballBasicDataScheduler = new FootballBasicDataScheduler();
        Spider.create(new FootballBasicDataProcessor())
                .setScheduler(footballBasicDataScheduler)
                .setDownloader(new FootballBasicDataDownloader())
                .addPipeline(new FootballBasicDataPipeline())
                .addRequest(request)
                .setSpiderListeners(spiderListeners)
                .thread(1)
                .run();

        MongoServer.close();
    }
}
