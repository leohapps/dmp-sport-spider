package com.sndo.dmp.doc;

import com.google.gson.annotations.SerializedName;

public class FootballMatch {

    @SerializedName("data-id")
    private String dataId;

    @SerializedName("data-status")
    private String dataStatus;

    @SerializedName("data-mode")
    private String dataMode;

    @SerializedName("data-group")
    private String dataGroup;

    @SerializedName("data-round")
    private String dataRound;

    @SerializedName("data-stage")
    private String dataStage;

    @SerializedName("data-home-id")
    private String dataHomeId;

    @SerializedName("data-away-id")
    private String dataAwayId;

    @SerializedName("data-home-score")
    private String dataHomeScore;

    @SerializedName("data-away-score")
    private String dataAwayScore;

    @SerializedName("data-asian")
    private String dataAsian;

    @SerializedName("data-over-under")
    private String dataOverUnder;

    @SerializedName("data-type")
    private String dataType;

    @SerializedName("data-half-asian")
    private String dataHalfAsian;

    @SerializedName("data-half-over-under")
    private String dataHalfOverUnder;

    @SerializedName("match-order")
    private String matchOrder;

    @SerializedName("match-date")
    private String matchDate;

    @SerializedName("home-name")
    private String homeName;

    @SerializedName("away-name")
    private String awayName;

    @SerializedName("handicap-full")
    private String handicapFull;

    @SerializedName("lineman-full")
    private String linemanFull;

    @SerializedName("league-id")
    private int leagueId;

    @SerializedName("season-id")
    private int seasonId;

    @SerializedName("season-year")
    private String seasonYear;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public String getDataGroup() {
        return dataGroup;
    }

    public void setDataGroup(String dataGroup) {
        this.dataGroup = dataGroup;
    }

    public String getDataRound() {
        return dataRound;
    }

    public void setDataRound(String dataRound) {
        this.dataRound = dataRound;
    }

    public String getDataStage() {
        return dataStage;
    }

    public void setDataStage(String dataStage) {
        this.dataStage = dataStage;
    }

    public String getDataHomeId() {
        return dataHomeId;
    }

    public void setDataHomeId(String dataHomeId) {
        this.dataHomeId = dataHomeId;
    }

    public String getDataAwayId() {
        return dataAwayId;
    }

    public void setDataAwayId(String dataAwayId) {
        this.dataAwayId = dataAwayId;
    }

    public String getDataHomeScore() {
        return dataHomeScore;
    }

    public void setDataHomeScore(String dataHomeScore) {
        this.dataHomeScore = dataHomeScore;
    }

    public String getDataAwayScore() {
        return dataAwayScore;
    }

    public void setDataAwayScore(String dataAwayScore) {
        this.dataAwayScore = dataAwayScore;
    }

    public String getDataAsian() {
        return dataAsian;
    }

    public void setDataAsian(String dataAsian) {
        this.dataAsian = dataAsian;
    }

    public String getDataOverUnder() {
        return dataOverUnder;
    }

    public void setDataOverUnder(String dataOverUnder) {
        this.dataOverUnder = dataOverUnder;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataHalfAsian() {
        return dataHalfAsian;
    }

    public void setDataHalfAsian(String dataHalfAsian) {
        this.dataHalfAsian = dataHalfAsian;
    }

    public String getDataHalfOverUnder() {
        return dataHalfOverUnder;
    }

    public void setDataHalfOverUnder(String dataHalfOverUnder) {
        this.dataHalfOverUnder = dataHalfOverUnder;
    }

    public String getMatchOrder() {
        return matchOrder;
    }

    public void setMatchOrder(String matchOrder) {
        this.matchOrder = matchOrder;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    public String getHandicapFull() {
        return handicapFull;
    }

    public void setHandicapFull(String handicapFull) {
        this.handicapFull = handicapFull;
    }

    public String getLinemanFull() {
        return linemanFull;
    }

    public void setLinemanFull(String linemanFull) {
        this.linemanFull = linemanFull;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }

    @Override
    public String toString() {
        return "FootballMatch{" +
                "dataId='" + dataId + '\'' +
                ", dataStatus='" + dataStatus + '\'' +
                ", dataMode='" + dataMode + '\'' +
                ", dataGroup='" + dataGroup + '\'' +
                ", dataRound='" + dataRound + '\'' +
                ", dataStage='" + dataStage + '\'' +
                ", dataHomeId='" + dataHomeId + '\'' +
                ", dataAwayId='" + dataAwayId + '\'' +
                ", dataHomeScore='" + dataHomeScore + '\'' +
                ", dataAwayScore='" + dataAwayScore + '\'' +
                ", dataAsian='" + dataAsian + '\'' +
                ", dataOverUnder='" + dataOverUnder + '\'' +
                ", dataType='" + dataType + '\'' +
                ", dataHalfAsian='" + dataHalfAsian + '\'' +
                ", dataHalfOverUnder='" + dataHalfOverUnder + '\'' +
                ", matchOrder='" + matchOrder + '\'' +
                ", matchDate='" + matchDate + '\'' +
                ", homeName='" + homeName + '\'' +
                ", awayName='" + awayName + '\'' +
                ", handicapFull='" + handicapFull + '\'' +
                ", linemanFull='" + linemanFull + '\'' +
                ", leagueId=" + leagueId +
                ", seasonId=" + seasonId +
                ", seasonYear='" + seasonYear + '\'' +
                '}';
    }
}
