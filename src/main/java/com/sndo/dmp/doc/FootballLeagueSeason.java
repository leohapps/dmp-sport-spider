package com.sndo.dmp.doc;

public class FootballLeagueSeason {

    private String id;
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LeagueSeason{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
