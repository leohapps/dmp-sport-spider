package com.sndo.dmp.leisu.football;

import com.sndo.dmp.doc.FootballLeague;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballActiveLeagueSeasonParser {

    public static List<FootballLeague> parse(String html) {
        List<FootballLeague> leagues = new ArrayList<>();
        org.jsoup.nodes.Document document = Jsoup.parse(html);
        Elements leagueElements = document.select("div.left-list > div");
        for (Element element : leagueElements) {
            String continent = parseContinent(element);
            if (!fiveContinents.contains(continent)) {
                continue;
            }

            Elements zoneElements = element.select("div.children");
            for (Element zoneElement : zoneElements) {
                List<FootballLeague> zoneLeagues = parseLeagues(zoneElement, continent);
                leagues.addAll(zoneLeagues);
            }
        }

        return leagues;
    }

    private static List<FootballLeague> parseLeagues(Element doc, String continent) {
        List<FootballLeague> leagues = new ArrayList<>();

        String zone = parseZone(doc);
        Elements leagueElements = doc.select("ul.fd-list > li");
        for (Element leagueElement : leagueElements) {
            FootballLeague league = parseLeague(leagueElement, continent, zone);
            leagues.add(league);
        }

        return leagues;
    }

    private static FootballLeague parseLeague(Element doc, String continent, String zone) {
        FootballLeague league = new FootballLeague();
        league.setContinent(continent);
        league.setZone(zone);

        Element liElement = doc.select("li[class^=competitions-]").first();
        String id = liElement.attr("data-id");
        String seasonId = liElement.attr("data-season-id");

        Element nameElement = doc.select("span.name").first();
        String name = nameElement.text();

        league.setId(Integer.valueOf(id));
        league.setActiveSeasonId(Integer.valueOf(seasonId));
        league.setName(name);

        return league;
    }

    private static String parseZone(Element doc) {
        Elements elements = doc.select("div.title span.txt");
        return elements.first().text();
    }

    private static List<String> fiveContinents = Arrays.asList("欧洲", "美洲", "亚洲", "大洋洲", "非洲");

    private static String parseContinent(Element doc) {
        Elements elements = doc.select("div.title > span.txt");
        return elements.first().text().trim();
    }


}
