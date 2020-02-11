package com.sndo.dmp.util;

public class FootballUrlBuilder {

    // 赛季
    public static String buildSeasonUrl(String seasonId) {
        return "https://data.leisu.com/zuqiu-" + seasonId;
    }

    public static String buildSeasonUrl(int seasonId) {
        return buildSeasonUrl(String.valueOf(seasonId));
    }

    // 球队
    public static String buildTeamUrl(String teamId) {
        return "https://data.leisu.com/team-" + teamId;
    }

    // 数据分析
    public static String buildShuJuFenXiUrl(String dataId) {
        return "https://live.leisu.com/shujufenxi-" + dataId;
    }

    // 欧洲指数
    public static String buildOupeiUrl(String dataId) {
        return "https://live.leisu.com/oupei-" + dataId;
    }

    // 三合一
    public static String build3in1Url(String dataId) {
        return "https://live.leisu.com/3in1-" + dataId;
    }

    // 技术统计
    public static String buildDetailUrl(String dataId) {
        return "http://live.leisu.com/detail-" + dataId;
    }
}
