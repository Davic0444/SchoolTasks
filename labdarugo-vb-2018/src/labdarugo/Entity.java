package labdarugo;

public class Entity {

    private String city;
    private String stadion;
    private String stadionAltName;
    private Integer space;

    public Entity(String city, String stadion, String stadionAltName, Integer space) {
        this.city = city;
        this.stadion = stadion;
        this.stadionAltName = stadionAltName;
        this.space = space;
    }

    public String getCity() {
        return city;
    }

    public String getStadion() {
        return stadion;
    }

    public String getStadionAltName() {
        return stadionAltName;
    }

    public Integer getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "city='" + city + '\'' +
                ", stadion='" + stadion + '\'' +
                ", stadionAltName='" + stadionAltName + '\'' +
                ", space=" + space +
                '}';
    }
}
