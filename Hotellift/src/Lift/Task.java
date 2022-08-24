package Lift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task {

    FileManager fmObj = new FileManager();
    List<Entity> lift = new ArrayList<Entity>();

    public void fileRead(String fileName){
        lift = fmObj.fileRead(fileName);
    }

    public int howManyTimeLiftUsed(){
        return lift.size();
    }

    public void liftFirstAndLastUse(){
        System.out.println("Időszak: "+lift.get(0).getDate() +" - "+ lift.get(lift.size()-1).getDate());
    }

    public int maxLevel(){
        int maxLevel = lift.stream().mapToInt(k -> k.getEndLevel()).max().getAsInt();
        return  maxLevel;
    }

    public void task6and7(){
        int card = 0;
        int targetLevel = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Kártya száma: ");
            String firstInput = br.readLine();
            System.out.println("Célszint max: ");
            String secondInput = br.readLine();
            card = Integer.parseInt(firstInput);
            targetLevel = Integer.parseInt(secondInput);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException n){
            card = 5;
            targetLevel = 5;
        }
        boolean traveled = false;
        for (Entity entity : lift) {
            if (entity.getCardNumber() == card && entity.getEndLevel() == targetLevel){
                traveled = true;
                break;
            }
        }
        System.out.println("A(z) "+ card + ". kártyával "+ (traveled ? "" : "nem ") + "utaztak a(z) "+ targetLevel+ ". emeletre!");
    }

    public void statistic(){
        Map<LocalDate, Integer> statistic = new TreeMap<>();
        for (Entity entity : lift) {
            statistic.put(entity.getDate(), statistic.getOrDefault(entity.getDate(), 0)+1);
        }
        for (Map.Entry<LocalDate, Integer> localDateIntegerEntry : statistic.entrySet()) {
            System.out.println(fmObj.timeWrite(localDateIntegerEntry.getKey()) + " - "+ localDateIntegerEntry.getValue()+ "x");
        }
    }

}
