package balkezesek;

import java.time.LocalDate;

public class Entity {

    private String name;
    private LocalDate first;
    private LocalDate last;
    private Integer weight;
    private Integer height;

    public Entity(String name, LocalDate first, LocalDate last, Integer weight, Integer height) {
        this.name = name;
        this.first = first;
        this.last = last;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFirst() {
        return first;
    }

    public LocalDate getLast() {
        return last;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
