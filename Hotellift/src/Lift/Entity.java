package Lift;

import java.time.LocalDate;

public class Entity {

    private LocalDate date;
    private Integer cardNumber;
    private Integer startLevel;
    private Integer endLevel;

    public Entity(LocalDate date, Integer cardNumber, Integer startLevel, Integer endLevel) {
        this.date = date;
        this.cardNumber = cardNumber;
        this.startLevel = startLevel;
        this.endLevel = endLevel;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Integer getStartLevel() {
        return startLevel;
    }

    public Integer getEndLevel() {
        return endLevel;
    }
}
