package Kosar;

import java.time.LocalDate;

public class Entity {

    private String home;
    private String foreign;
    private Integer homePoint;
    private Integer foreignPoint;
    private String location;
    private LocalDate date;

    public Entity(String home, String foreign, Integer homePoint, Integer foreignPoint, String location, LocalDate date) {
        this.home = home;
        this.foreign = foreign;
        this.homePoint = homePoint;
        this.foreignPoint = foreignPoint;
        this.location = location;
        this.date = date;
    }

    public String getHome() {
        return home;
    }

    public String getForeign() {
        return foreign;
    }

    public Integer getHomePoint() {
        return homePoint;
    }

    public Integer getForeignPoint() {
        return foreignPoint;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }
}
