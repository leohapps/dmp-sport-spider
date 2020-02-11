package com.sndo.dmp.leisu;

import com.sndo.dmp.Constants;
import com.sndo.dmp.doc.FootballLeague;
import com.sndo.dmp.leisu.football.*;
import org.junit.Test;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.ProxyProvider;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

import java.util.ArrayList;
import java.util.List;

public class HttpClientDownloaderTest {

    private Task initTask() {
        List<SpiderListener> spiderListeners = new ArrayList<>();
        spiderListeners.add(new FootballBasicDataListener());

        FootballBasicDataScheduler footballBasicDataScheduler = new FootballBasicDataScheduler();
        Spider task = Spider.create(new FootballBasicDataProcessor())
                .setScheduler(footballBasicDataScheduler)
                .setDownloader(new FootballBasicDataDownloader())
                .addPipeline(new FootballBasicDataPipeline())
                .setSpiderListeners(spiderListeners)
                .thread(1);

        return task;
    }

    private Request initRequest() {
        Request request = new Request();
        request.setUrl("https://data.leisu.com/lanqiu/team-10273/match?season_id=1032");
        request.putExtra(Constants.PAGE_INDEX, 0);

        return request;
    }

    private ProxyProvider initProxyProvider() {
        List<Proxy> proxies = new ArrayList<>();
        proxies.add(new Proxy("116.196.90.181", 3128));

        return new SimpleProxyProvider(proxies);
    }

    @Test
    public void testProxyDownload() {
        HttpClientDownloader downloader = new HttpClientDownloader();

//        ProxyProvider proxyProvider = initProxyProvider();
//        downloader.setProxyProvider(proxyProvider);

        Page page = downloader.download(initRequest(), initTask());

        String htmlRawText = page.getRawText();
        System.out.println(htmlRawText);
//        List<FootballLeague> leagueActiveSeasons = FootballActiveLeagueSeasonParser.parse(htmlRawText);
//        for (FootballLeague footballLeague : leagueActiveSeasons) {
//            System.out.println(footballLeague.toString());
//        }
    }

}
