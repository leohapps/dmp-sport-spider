package com.sndo.dmp.leisu.football;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import com.sndo.dmp.doc.FootballLeague;
import com.sndo.dmp.doc.FootballMatch;
import com.sndo.dmp.util.FootballLeagueUtils;
import org.bson.Document;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class FootballBasicDataPipeline implements Pipeline {

    private final MongoCollection<Document> htmlContentCollection;

    public FootballBasicDataPipeline() {
        htmlContentCollection = MongoServer.getCollection("leisu-football", "html");
    }

    private final Gson gson = new Gson();

    @Override
    public void process(ResultItems resultItems, Task task) {
        Document htmlDoc = resultItems.get(Constants.PAGE_HTML_CONTENT);
        insertHtmlRawText(htmlDoc);

        int pageIndex = resultItems.get(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            List<FootballLeague> leagueActiveSeasons = resultItems.get(Constants.PAGE_HTML_ELEMENT);
            insertLeagueActiveSeason(leagueActiveSeasons);
        } else if (pageIndex == 1) {
            FootballLeague league = resultItems.get(Constants.PAGE_HTML_ELEMENT);
            upsertLeagueSeason(league);
        } else if (pageIndex == 2) {
            List<FootballMatch> footballMatches = resultItems.get(Constants.PAGE_HTML_ELEMENT);
            insertLeagueMatch(footballMatches);
        }

    }

    private void insertLeagueMatch(List<FootballMatch> footballMatches) {
        List<Document> docs = new ArrayList<>();
        for (FootballMatch footballMatch : footballMatches) {
            Document doc = gson.fromJson(gson.toJson(footballMatch), Document.class);
            docs.add(doc);
        }

        MongoServer.getCollection("leisu-football", "match").insertMany(docs);

        // 转换
    }

    private void upsertLeagueSeason(FootballLeague league) {
        Document doc = new Document();
        doc.put("id", league.getId());

        Document updateDoc = FootballLeagueUtils.toDoc(league);

        MongoServer.getCollection("leisu-football", "league").updateOne(doc, new Document("$set", updateDoc));

        // 转换
    }

    private void insertLeagueActiveSeason(List<FootballLeague> leagueActiveSeasons) {
        List<Document> leagueActiveSeasonDocs = FootballLeagueUtils.toDoc(leagueActiveSeasons);
        MongoServer.getCollection("leisu-football", "league").insertMany(leagueActiveSeasonDocs);

        // 转换
    }

    private void insertHtmlRawText(Document htmlDoc) {
        Document queryDoc = new Document();
        queryDoc.put("url", htmlDoc.getString("url"));

        Document findDoc = htmlContentCollection.find(queryDoc).first();
        if (findDoc == null || findDoc.isEmpty()) {
            htmlContentCollection.insertOne(htmlDoc);
        }
    }


}
