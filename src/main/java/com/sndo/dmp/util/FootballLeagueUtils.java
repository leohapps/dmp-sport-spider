package com.sndo.dmp.util;

import com.sndo.dmp.doc.FootballLeague;
import com.sndo.dmp.doc.FootballLeagueSeason;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Collections;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class FootballLeagueUtils {

    public static List<Document> toDoc(List<FootballLeague> leagues) {
        List<Document> docs = new ArrayList<>();
        for (FootballLeague league : leagues) {
            Document doc = toDoc(league);
            docs.add(doc);
        }

        return docs;
    }

    public static Document toDoc(FootballLeague league) {
        Document doc = new Document();
        doc.put("id", league.getId());

        int activeSeasonId = league.getActiveSeasonId();
        if (activeSeasonId != -1) {
            doc.put("active-season-id", activeSeasonId);
        }

        String name = league.getName();
        if (StringUtils.isNotBlank(name)) {
            doc.put("name", league.getName());
        }

        String fullName = league.getFullName();
        if (StringUtils.isNotBlank(fullName)) {
            doc.put("full-name", league.getFullName());
        }

        String continent = league.getContinent();
        if (StringUtils.isNotBlank(continent)) {
            doc.put("continent", league.getContinent());
        }

        String zone = league.getZone();
        if (StringUtils.isNotBlank(zone)) {
            doc.put("zone", league.getZone());
        }

        List<FootballLeagueSeason> seasons = league.getSeasons();
        if (!Collections.isNullOrEmpty(seasons)) {
            List<Document> seasonDocuments = FootballLeagueSeasonUtils.toDoc(seasons);
            doc.put("seasons", seasonDocuments);
        }

        return doc;
    }
}
