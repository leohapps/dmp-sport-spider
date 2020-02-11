package com.sndo.dmp.leisu.basketball;

import com.mongodb.client.MongoCollection;
import com.sndo.dmp.Constants;
import com.sndo.dmp.db.MongoServer;
import com.sndo.dmp.doc.BasketballTeam;
import com.sndo.dmp.util.BasketballTeamUtils;
import org.bson.Document;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

public class BasketballBasicDataPipeline implements Pipeline {

    private final MongoCollection<Document> htmlContentCollection;

    public BasketballBasicDataPipeline() {
        htmlContentCollection = MongoServer.getCollection("leisu-basketball", "html");
    }

    @Override
    public void process(ResultItems resultItems, Task task) {
        Document htmlDoc = resultItems.get(Constants.PAGE_HTML_CONTENT);
        insertHtmlRawText(htmlDoc);

        int pageIndex = resultItems.get(Constants.PAGE_INDEX);
        if (pageIndex == 0) {
            List<BasketballTeam> basketballTeams = resultItems.get(Constants.PAGE_HTML_ELEMENT);
            insertBasketballTeam(basketballTeams);
        }
    }

    private void insertBasketballTeam(List<BasketballTeam> basketballTeams) {
        List<Document> leagueActiveSeasonDocs = BasketballTeamUtils.toDoc(basketballTeams);
        MongoServer.getCollection("leisu-basketball", "team").insertMany(leagueActiveSeasonDocs);
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
