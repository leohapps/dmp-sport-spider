package com.sndo.dmp.util;

import com.sndo.dmp.doc.FootballLeagueSeason;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class FootballLeagueSeasonUtils {

    public static Document toDoc(FootballLeagueSeason leagueSeason) {
        Document doc = new Document();
        doc.put("id", leagueSeason.getId());
        doc.put("year", leagueSeason.getYear());

        return doc;
    }

    public static List<Document> toDoc(List<FootballLeagueSeason> leagueSeasons) {
        List<Document> docs = new ArrayList<>();
        for (FootballLeagueSeason leagueSeason : leagueSeasons) {
            Document doc = toDoc(leagueSeason);
            docs.add(doc);
        }

        return docs;
    }
}
