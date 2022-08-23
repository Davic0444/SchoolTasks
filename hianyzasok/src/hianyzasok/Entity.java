package hianyzasok;

public class Entity {

    private String name;
    private String inClass;
    private Integer firstDay;
    private Integer lastDay;
    private Integer missedHours;

    public Entity(String name, String inClass, Integer firstDay, Integer lastDay, Integer missedHours) {
        this.name = name;
        this.inClass = inClass;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.missedHours = missedHours;
    }

    public String getName() {
        return name;
    }

    public String getInClass() {
        return inClass;
    }

    public Integer getFirstDay() {
        return firstDay;
    }

    public Integer getLastDay() {
        return lastDay;
    }

    public Integer getMissedHours() {
        return missedHours;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", inClass='" + inClass + '\'' +
                ", firstDay=" + firstDay +
                ", lastDay=" + lastDay +
                ", missedHours=" + missedHours +
                '}';
    }
}
