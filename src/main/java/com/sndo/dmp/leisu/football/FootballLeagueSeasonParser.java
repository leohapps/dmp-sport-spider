package com.sndo.dmp.leisu.football;

import com.sndo.dmp.doc.FootballLeague;
import com.sndo.dmp.doc.FootballLeagueSeason;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Collections;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class FootballLeagueSeasonParser {

    public static FootballLeague parse(String html, String url) {
        FootballLeague league = new FootballLeague();

        List<FootballLeagueSeason> leagueSeasons = parseLeagueSeasons(html);
        if (!Collections.isNullOrEmpty(leagueSeasons)) {
            league.setSeasons(leagueSeasons);
        }

        String fullName = parseLeagueFullName(html);
        if (StringUtils.isNotBlank(fullName)) {
            league.setFullName(fullName);
        }

        int seasonId = parseSeasonId(url);
        if (seasonId != -1) {
            league.setActiveSeasonId(seasonId);
        }

        int leagueId = getLeagueId(html, seasonId);
        if (leagueId != -1) {
            league.setId(leagueId);
        }

        return league;
    }

    private static int getLeagueId(String html, int seasonId) {
        org.jsoup.nodes.Document document = Jsoup.parse(html);
        return Integer.valueOf(document.select("li[data-season-id=" + seasonId + "]").first().attr("data-id"));
    }

    private static int parseSeasonId(String url) {
        return Integer.valueOf(url.replace("https://data.leisu.com/zuqiu-", ""));
    }

    private static String parseLeagueFullName(String html) {
        org.jsoup.nodes.Document document = Jsoup.parse(html);
        Element element = document.select("div.clearfix-row.f-s-24").first();
        return element.text();
    }

    private static List<FootballLeagueSeason> parseLeagueSeasons(String html) {
        org.jsoup.nodes.Document document = Jsoup.parse(html);
        List<FootballLeagueSeason> leagueSeasons = new ArrayList<>();
        Element selectBorderElement = document.select("div.select-border > div.down").first();
        Elements elements = selectBorderElement.select("ul > li");
        for (Element element : elements) {
            FootballLeagueSeason leagueSeason = parseLeagueSeason(element);
            leagueSeasons.add(leagueSeason);
        }

        return leagueSeasons;
    }

    private static FootballLeagueSeason parseLeagueSeason(Element doc) {
        FootballLeagueSeason leagueSeason = new FootballLeagueSeason();

        Element aElement = doc.select("a").first();
        String seasonId = parseSeasonId(aElement);
        String seasonYear = parseSeasonYear(aElement);

        leagueSeason.setId(seasonId);
        leagueSeason.setYear(seasonYear);

        return leagueSeason;
    }

    private static String parseSeasonId(Element aElement) {
        String href = aElement.attr("href");
        return href.replace("../zuqiu-", "");
    }

    private static String parseSeasonYear(Element aElement) {
        return aElement.text();
    }

}
