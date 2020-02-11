package com.sndo.dmp.leisu.basketball;

import com.sndo.dmp.Constants;
import com.sndo.dmp.doc.BasketballTeam;
import com.sndo.dmp.util.BasketballUrlBuilder;
import org.apache.commons.collections.CollectionUtils;
import org.bson.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BasketballBasicDataProcessor implements PageProcessor {

    private Site site = Site.me().setSleepTime(1000);

    @Override
    public void process(Page page) {
        ResultItems resultItems = getResultItems(page);
        if (resultItems != null) {
            for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
                page.putField(entry.getKey(), entry.getValue());
            }
        } else {
            page.setSkip(true);
        }

        List<Request> requests = getTargetRequest(page, resultItems);
        if (CollectionUtils.isNotEmpty(requests)) {
            for (Request request : requests) {
                page.addTargetRequest(request);
            }
        }
    }

    // TODO
    private ResultItems getResultItems(Page page) {
        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            return getBasketballTeamResultItems(page);
        } else if (pageIndex == 1) {

        } else if (pageIndex == 2) {

        }

        return null;
    }

    private ResultItems getBasketballTeamResultItems(Page page) {
        ResultItems resultItems = initDefaultResultItems(page);

        String htmlRawText = page.getHtml().get();
        List<BasketballTeam> basketballTeams = BasketballListPageParser.parseBasketballTeams(htmlRawText);
        resultItems.put(Constants.PAGE_HTML_ELEMENT, basketballTeams);

        return resultItems;
    }

    private ResultItems initDefaultResultItems(Page page) {
        ResultItems resultItems = new ResultItems();
        resultItems.put(Constants.PAGE_INDEX, page.getRequest().getExtra(Constants.PAGE_INDEX));

        Document htmlDoc = toTargetHtmlDoc(page);
        resultItems.put(Constants.PAGE_HTML_CONTENT, htmlDoc);

        return resultItems;
    }

    private org.bson.Document toTargetHtmlDoc(Page page) {
        org.bson.Document targetDoc = new org.bson.Document();
        targetDoc.put("url", page.getUrl().get());
        targetDoc.put("html", page.getRawText());

        return targetDoc;
    }

    private List<Request> getTargetRequest(Page page, ResultItems resultItems) {
        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            return getBasketballTargetRequest(page, resultItems);
        } else if (pageIndex == 1) {
            // do nothings
        } else if (pageIndex == 2) {

        }

        return null;
    }

    private List<Request> getBasketballTargetRequest(Page page, ResultItems resultItems) {
        List<Request> requests = new ArrayList<Request>();

        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);

        List<BasketballTeam> basketballTeams = resultItems.get(Constants.PAGE_HTML_ELEMENT);
        for (BasketballTeam basketballTeam : basketballTeams) {
            Request targetRequest = initRequest(
                    BasketballUrlBuilder.buildMatchUrl(basketballTeam.getId()),
                    page.getUrl().get(), pageIndex + 1);
            requests.add(targetRequest);
        }

        return requests;
    }

    private Request initRequest(String url, String referer, int pageIndex) {
        Request request = new Request();
        request.setUrl(url);
        request.putExtra(Constants.PAGE_REFERER, referer);
        request.putExtra(Constants.PAGE_INDEX, pageIndex);

        return request;
    }

    @Override
    public Site getSite() {
        return this.site;
    }
}
