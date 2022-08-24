package Kosar;

import java.util.*;

public class Task {

    List<Entity> basketball = new ArrayList<>();
    FileManager fmObj = new FileManager();

    public void fileRead(String fileName) {
        basketball = fmObj.fileRead(fileName);
    }

    public void howManyMatchRealMadrid() {
        Integer homeRealMadrid = 0;
        Integer foreignRealMadrid = 0;
        for (Entity entity : basketball) {
            if (entity.getHome().equalsIgnoreCase("Real Madrid")) {
                homeRealMadrid++;
            } else if (entity.getForeign().equalsIgnoreCase("Real Madrid")) {
                foreignRealMadrid++;
            }
        }
        System.out.println("Real Madrid: " + "Hazai: " + homeRealMadrid + " Idegen: " + foreignRealMadrid);
    }

    public void drawMatch() {
        boolean drawMatch = false;
        for (Entity entity : basketball) {
            if (entity.getHomePoint() == entity.getForeignPoint()) {
                drawMatch = true;
            }
        }
        if (drawMatch == true) {
            System.out.println("Volt döntetlen mérkőzés");
        } else {
            System.out.println("Nem volt döntetlen mérkőzés");
        }
    }

    public void barcelonaFullName() {
        for (Entity entity : basketball) {
            if (entity.getHome().contains("Barcelona")) {
                System.out.println("barcelonai csapat neve: " + entity.getHome());
                break;
            }
        }
    }

    public void taskSix() {
        for (Entity entity : basketball) {
            if (entity.getDate().getMonthValue() == 11 && entity.getDate().getDayOfMonth() == 21) {
                System.out.println(entity.getHome() + " - " + entity.getForeign() + " (" + entity.getHomePoint() + ":" + entity.getForeignPoint() + ") \t");
            }
        }
    }

    public void stadionsWithMoreThan20Match() {
        Set<String> stadium = new HashSet<>();
        for (Entity entity : basketball) {
            if (!stadium.contains(entity.getLocation())) {
                stadium.add(entity.getLocation());
            }
        }
        for (String s : stadium) {
            int amount = 0;
            for (Entity entity : basketball) {
                if (entity.getLocation().equals(s)) {
                    amount++;
                }
            }
            if (amount > 20) {
                System.out.println(s + " - " + amount);
            }
        }
    }

}
