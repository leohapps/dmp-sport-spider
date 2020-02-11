package com.sndo.dmp.leisu.football;

import com.sndo.dmp.Constants;
import com.sndo.dmp.doc.FootballLeague;
import com.sndo.dmp.doc.FootballLeagueSeason;
import com.sndo.dmp.doc.FootballMatch;
import com.sndo.dmp.util.FootballUrlBuilder;
import org.apache.commons.collections.CollectionUtils;
import org.assertj.core.util.Collections;
import org.bson.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FootballBasicDataProcessor implements PageProcessor {

    private Site site = Site.me().setSleepTime(0);

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
    private List<Request> getTargetRequest(Page page, ResultItems resultItems) {
        String url = page.getUrl().get();
        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            return getActiveLeagueSeasonTargetRequest(page, resultItems);
        } else if (pageIndex == 1) {
            return getLeagueSeasonTargetRequest(page, resultItems);
        } else if (pageIndex == 2) {
            List<FootballMatch> footballMatches = resultItems.get(Constants.PAGE_HTML_ELEMENT);

            List<Request> targetRequests = new ArrayList<>();

            List<Request> teamRequests = getTeamRequest(url, pageIndex, footballMatches);
            if (!Collections.isNullOrEmpty(teamRequests)) {
                targetRequests.addAll(teamRequests);
            }

            List<Request> oupeiRequests = getOupeiRequest(url, pageIndex, footballMatches);
            if (!Collections.isNullOrEmpty(oupeiRequests)) {
                targetRequests.addAll(oupeiRequests);
            }

            List<Request> handicap3in1Requests = get3in1Request(url, pageIndex, footballMatches);
            if (!Collections.isNullOrEmpty(handicap3in1Requests)) {
                targetRequests.addAll(handicap3in1Requests);
            }

            List<Request> detailRequests = getDetailRequest(url, pageIndex, footballMatches);
            if (!Collections.isNullOrEmpty(detailRequests)) {
                targetRequests.addAll(detailRequests);
            }

            return targetRequests;
        }

        return null;
    }

    private Map<String, Boolean> teamMap = new HashMap<>();

    private List<Request> getTeamRequest(String url, int pageIndex, List<FootballMatch> footballMatches) {
        List<Request> requests = new ArrayList<>();
        for (FootballMatch footballMatch : footballMatches) {
            String homeId = footballMatch.getDataHomeId();
            Request homeTeamRequest = initTeamRequest(homeId, url, pageIndex);
            if (homeTeamRequest != null) {
                requests.add(homeTeamRequest);
            }

            String awayId = footballMatch.getDataAwayId();
            Request awayTeamRequest = initTeamRequest(awayId, url, pageIndex);
            if (awayTeamRequest != null) {
                requests.add(awayTeamRequest);
            }
        }

        return requests;
    }

    private Request initTeamRequest(String teamId, String url, int pageIndex) {
        if (!teamMap.containsKey(teamId)) {
            teamMap.put(teamId, true);

            String teamUrl = FootballUrlBuilder.buildTeamUrl(teamId);
            Request teamRequest = initRequest(teamUrl, url, pageIndex + 1);

            return teamRequest;
        } else {
            return null;
        }
    }

    private List<Request> getOupeiRequest(String url, int pageIndex, List<FootballMatch> footballMatches) {
        List<Request> requests = new ArrayList<>();
        for (FootballMatch footballMatch : footballMatches) {
            String dataId = footballMatch.getDataId();
            Request oupeiRequest = initOupeiRequest(dataId, url, pageIndex);
            requests.add(oupeiRequest);
        }

        return requests;
    }

    private Request initOupeiRequest(String dataId, String url, int pageIndex) {
        String oupeiUrl = FootballUrlBuilder.buildOupeiUrl(dataId);
        Request oupeiRequest = initRequest(oupeiUrl, url, pageIndex + 1);
        return oupeiRequest;
    }

    private List<Request> get3in1Request(String url, int pageIndex, List<FootballMatch> footballMatches) {
        List<Request> requests = new ArrayList<>();
        for (FootballMatch footballMatch : footballMatches) {
            String dataId = footballMatch.getDataId();
            Request request = init3in1Request(dataId, url, pageIndex);
            requests.add(request);
        }

        return requests;
    }

    private Request init3in1Request(String dataId, String url, int pageIndex) {
        String handicap3in1Url = FootballUrlBuilder.build3in1Url(dataId);
        Request handicap3in1Request = initRequest(handicap3in1Url, url, pageIndex + 1);
        return handicap3in1Request;
    }

    private List<Request> getDetailRequest(String url, int pageIndex, List<FootballMatch> footballMatches) {
        List<Request> requests = new ArrayList<>();
        for (FootballMatch footballMatch : footballMatches) {
            String dataId = footballMatch.getDataId();
            Request detailRequest = initDetailRequest(dataId, url, pageIndex);
            requests.add(detailRequest);
        }

        return requests;
    }

    private Request initDetailRequest(String dataId, String url, int pageIndex) {
        String detailUrl = FootballUrlBuilder.buildDetailUrl(dataId);
        Request detailRequest = initRequest(detailUrl, url, pageIndex + 1);
        return detailRequest;
    }

    private Request initRequest(String url, String referer, int pageIndex) {
        Request request = new Request();
        request.setUrl(url);
        request.putExtra(Constants.PAGE_REFERER, referer);
        request.putExtra(Constants.PAGE_INDEX, pageIndex);

        return request;
    }

    private List<Request> getLeagueSeasonTargetRequest(Page page, ResultItems resultItems) {
        List<Request> requests = new ArrayList<Request>();

        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);

        FootballLeague league = resultItems.get(Constants.PAGE_HTML_ELEMENT);
        for (FootballLeagueSeason leagueSeason : league.getSeasons()) {
            Request targetRequest = initRequest(
                    FootballUrlBuilder.buildSeasonUrl(leagueSeason.getId()),
                    page.getUrl().get(), pageIndex + 1);
            requests.add(targetRequest);
        }

        return requests;
    }

    private List<Request> getActiveLeagueSeasonTargetRequest(Page page, ResultItems resultItems) {
        List<Request> requests = new ArrayList<Request>();

        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);

        List<FootballLeague> leagueActiveSeasons = resultItems.get(Constants.PAGE_HTML_ELEMENT);
        for (FootballLeague activeLeagueSeason : leagueActiveSeasons) {
            Request targetRequest = initRequest(
                    FootballUrlBuilder.buildSeasonUrl(activeLeagueSeason.getActiveSeasonId()),
                    page.getUrl().get(), pageIndex + 1);
            
            requests.add(targetRequest);
        }

        return requests;
    }

    // TODO
    private ResultItems getResultItems(Page page) {
        int pageIndex = (Integer) page.getRequest().getExtra(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            return getActiveLeagueSeasonResultItems(page);
        } else if (pageIndex == 1) {
            return getLeagueSeasonResultItems(page);
        } else if (pageIndex == 2) {
            return getLeagueMatchResultItems(page);
        }

        return null;
    }

    private ResultItems getLeagueMatchResultItems(Page page) {
        ResultItems resultItems = initDefaultResultItems(page);

        String htmlRawText = page.getHtml().get();
        List<FootballMatch> footballMatches = FootballLeagueMatchParser.parse(htmlRawText, page.getUrl().get());
        resultItems.put(Constants.PAGE_HTML_ELEMENT, footballMatches);

        return resultItems;
    }

    private ResultItems getLeagueSeasonResultItems(Page page) {
        ResultItems resultItems = initDefaultResultItems(page);

        String htmlRawText = page.getHtml().get();
        FootballLeague league = FootballLeagueSeasonParser.parse(htmlRawText, page.getUrl().get());
        resultItems.put(Constants.PAGE_HTML_ELEMENT, league);

        return resultItems;
    }

    private ResultItems getActiveLeagueSeasonResultItems(Page page) {
        ResultItems resultItems = initDefaultResultItems(page);

        String htmlRawText = page.getHtml().get();
        List<FootballLeague> leagueActiveSeasons = FootballActiveLeagueSeasonParser.parse(htmlRawText);
        resultItems.put(Constants.PAGE_HTML_ELEMENT, leagueActiveSeasons);

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

    @Override
    public Site getSite() {
        return this.site;
    }
}
