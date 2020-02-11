package com.sndo.dmp.leisu.football;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.sndo.dmp.doc.FootballMatch;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FootballLeagueMatchParser {

    public static List<FootballMatch> parse(String html, String url) {
        org.jsoup.nodes.Document document = Jsoup.parse(html);

        List<FootballMatch> footballMatchs = new ArrayList<>();

        int seasonId = parseSeasonId(url);
//        int leagueId = parseLeagueId(document, seasonId);
        String seasonYear = parseSeasonYear(document);

        Elements matchElements = document.select("table.table-tow.matches > tbody > tr[class^=data]");
        for (Element matchElement : matchElements) {
            FootballMatch footballMatch = parseMatch(matchElement);
//            footballMatch.setLeagueId(leagueId);
            footballMatch.setSeasonId(seasonId);
            footballMatch.setSeasonYear(seasonYear);

            footballMatchs.add(footballMatch);
        }

        return footballMatchs;
    }

    private static int parseSeasonId(String url) {
        return Integer.valueOf(url.replace("https://data.leisu.com/zuqiu-", ""));
    }

    private static String parseSeasonYear(Element document) {
        Element selectBorderElement = document.select("div.select-border > div.down").first();
        Element element = selectBorderElement.select("ul > li[class=active]").first();
        return element.text();
    }

//    private static int parseLeagueId(Element document, int seasonId) {
//        return Integer.valueOf(document.select("li[data-season-id=" + seasonId + "]").first().attr("data-id"));
//    }

    private static Gson gson = null;

    static {
        gson = new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy() {

            @Override
            public boolean shouldSkipField(FieldAttributes arg0) {
                Expose expose = arg0.getAnnotation(Expose.class);
                if (expose != null && !expose.serialize()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public boolean shouldSkipClass(Class<?> arg0) {
                return false;
            }

        }).create();
    }

    private static FootballMatch parseMatch(Element document) {
        Map<String, String> attributeMap = new HashMap<>();
        FootballMatch footballMatch = new FootballMatch();

        List<Attribute> attributes = document.attributes().asList();

        for (Attribute attribute : attributes) {
            
            String key = attribute.getKey();
            String value = attribute.getValue().trim();

            if (!"class".equals(key) && StringUtils.isNotBlank(value)) {
                attributeMap.put(key, value);
            }
        }

        Elements elements = document.select("tr > td");
        if (elements.size() != 8) {
            return null;
        }

        String matchOrder = parseOrder(elements);
        if (StringUtils.isNotBlank(matchOrder)) {
            attributeMap.put("match-order", matchOrder);
        }

        String matchDate = parseDate(elements);
        if (StringUtils.isNotBlank(matchDate)) {
            attributeMap.put("match-date", matchDate);
        }

        String homeName = parseHomeName(elements);
        if (StringUtils.isNotBlank(homeName)) {
            attributeMap.put("home-name", homeName);
        }

        String awayName = parseAwayName(elements);
        if (StringUtils.isNotBlank(awayName)) {
            attributeMap.put("away-name", awayName);
        }

        String handicapWithFull = parseHandicapWithFull(elements);
        if (StringUtils.isNotBlank(handicapWithFull)) {
            attributeMap.put("handicap-full", handicapWithFull);
        }

        String handicapWithHalf = parseHandicapWithHalf(elements);
        if (StringUtils.isNotBlank(handicapWithHalf)) {
            attributeMap.put("handicap-half", handicapWithHalf);
        }

        String linemanWithFull = parseLinemanWithFull(elements);
        if (StringUtils.isNotBlank(linemanWithFull)) {
            attributeMap.put("lineman-full", linemanWithFull);
        }

        String linemanWithHalf = parseLinemanWithHalf(elements);
        if (StringUtils.isNotBlank(linemanWithHalf)) {
            attributeMap.put("lineman-half", linemanWithHalf);
        }

        footballMatch = gson.fromJson(gson.toJson(attributeMap), FootballMatch.class);

        return footballMatch;
    }

    private static String parseOrder(Elements elements) {
        return elements.first().text();
    }

    private static String parseDate(Elements elements) {
        return elements.get(1).text();
    }

    private static String parseHomeName(Elements elements) {
        return elements.get(2).text();
    }

    private static String parseAwayName(Elements elements) {
        return elements.get(4).text();
    }

    private static String parseHandicapWithFull(Elements elements) {
        return elements.get(5).select("div").first().text();
    }

    private static String parseHandicapWithHalf(Elements elements) {
        return elements.get(5).select("div").get(1).text();
    }

    private static String parseLinemanWithFull(Elements elements) {
        return elements.get(6).select("div").first().text();
    }

    private static String parseLinemanWithHalf(Elements elements) {
        return elements.get(6).select("div").get(1).text();
    }


}
