package com.sndo.dmp.util;

import com.sndo.dmp.doc.BasketballTeam;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class BasketballTeamUtils {

    public static Document toDoc(BasketballTeam basketballTeam) {
        Document doc = new Document();
        doc.put("id", basketballTeam.getId());
        doc.put("name", basketballTeam.getName());
        doc.put("area", basketballTeam.getArea());

        return doc;
    }

    public static List<Document> toDoc(List<BasketballTeam> basketballTeams) {
        List<Document> docs = new ArrayList<>();
        for (BasketballTeam team : basketballTeams) {
            Document doc = toDoc(team);
            docs.add(doc);
        }

        return docs;
    }

}
