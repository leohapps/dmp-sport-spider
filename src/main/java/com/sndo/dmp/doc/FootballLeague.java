package com.sndo.dmp.doc;

import java.util.List;

public class FootballLeague {

    private int id = -1; // 联赛ID
    private String name;   // 联赛简称
    private String fullName; // 联赛全称
    private String continent;   // 洲
    private String zone;    // 国家, 地域
    private int activeSeasonId = -1; // 当前赛季ID
    private List<FootballLeagueSeason> seasons;    // 所有赛季

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getActiveSeasonId() {
        return activeSeasonId;
    }

    public void setActiveSeasonId(int activeSeasonId) {
        this.activeSeasonId = activeSeasonId;
    }

    public List<FootballLeagueSeason> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<FootballLeagueSeason> seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "FootballLeague{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", continent='" + continent + '\'' +
                ", zone='" + zone + '\'' +
                ", activeSeasonId=" + activeSeasonId +
                ", seasons=" + seasons +
                '}';
    }
}
