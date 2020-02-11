package com.sndo.dmp.util;

public class BasketballUrlBuilder {

    public static String buildTeamUrl(int teamId) {
        return "https://data.leisu.com/lanqiu/team-" + teamId;
    }

    public static String buildMatchUrl(int teamId) {
        return "https://data.leisu.com/lanqiu/team-" + teamId + "/match";
    }

}
