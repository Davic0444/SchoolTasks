package versenyzok;

import java.time.LocalDate;

public class Entity {

    private String name;
    private LocalDate birth;
    private String nationality;
    private Integer startNumber;

    public Entity(String name, LocalDate birth, String nationality, Integer startNumber) {
        this.name = name;
        this.birth = birth;
        this.nationality = nationality;
        this.startNumber = startNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getStartNumber() {
        return startNumber;
    }
}
