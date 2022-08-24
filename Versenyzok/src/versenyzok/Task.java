package versenyzok;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    FileManager fmObj = new FileManager();
    List<Entity> racers = new ArrayList<Entity>();

    public void fileRead(String fileName) {
        racers = fmObj.fileRead(fileName);
    }

    public int dataNumber() {
        return racers.size();
    }

    public void dataLastRow() {
        System.out.println(racers.get(racers.size() - 1).getName());
    }

    public void birthBeforeXIX(){
        for (Entity racer : racers) {
            if (racer.getBirth().getYear() < 1901){
                System.out.println(racer.getName() + "(" + racer.getBirth() + ")");
            }
        }
    }

    public void smallestStartNumberNationality(){
        int min1 = racers.stream().filter(k -> k.getStartNumber() != 15000).mapToInt(k -> k.getStartNumber()).min().getAsInt();
        racers.stream().filter(k -> k.getStartNumber() == min1).findFirst().ifPresent(k -> System.out.println(k.getNationality()));
    }

    public void sameStartNumber(){
        ArrayList<Integer> startNumber = new ArrayList<>();
        for (int i = 0; i < racers.size(); i++) {
            if (racers.get(i).getStartNumber() != 15000){
                startNumber.add(racers.get(i).getStartNumber());
            }
        }
        List<Integer> startNumberHelp = startNumber.stream().filter(k -> Collections.frequency(startNumber, k) > 1).distinct().collect(Collectors.toList());
        System.out.println(startNumberHelp);
    }
}
