package com.sndo.dmp.leisu.basketball;

import com.sndo.dmp.doc.BasketballTeam;
import org.assertj.core.util.Collections;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class BasketballListPageParser {

    public static List<BasketballTeam> parseBasketballTeams(String html) {
        List<BasketballTeam> basketballTeams = new ArrayList<>();
        org.jsoup.nodes.Document document = Jsoup.parse(html);
        Elements elements = document.select("table.race-area > tbody > tr > td[valign=top]");
        for (Element element : elements) {
            List<BasketballTeam> areaBasketballTeams = parseBasketballTeams(element);
            if (!Collections.isNullOrEmpty(areaBasketballTeams)) {
                basketballTeams.addAll(areaBasketballTeams);
            }
        }

        return basketballTeams;
    }

    private static List<BasketballTeam> parseBasketballTeams(Element document) {
        List<BasketballTeam> basketballTeams = new ArrayList<>();

        String area = parseArea(document);
        Elements dataElements = document.select("div.data-item");
        for (Element dataElement : dataElements) {
            BasketballTeam basketballTeam = parseBasketballTeam(dataElement);
            basketballTeam.setArea(area);

            basketballTeams.add(basketballTeam);
        }

        return basketballTeams;
    }

    private static BasketballTeam parseBasketballTeam(Element document) {
        BasketballTeam basketballTeam = new BasketballTeam();
        Element titleElement = document.select("div > a.title").first();
        int teamId = Integer.valueOf(titleElement.attr("href").replace("/lanqiu/team-", ""));
        basketballTeam.setId(teamId);

        String name = titleElement.text();
        basketballTeam.setName(name);

        return basketballTeam;
    }

    private static String parseArea(Element document) {
        return document.select("div.title > span.cd > span.name").text();
    }

}
