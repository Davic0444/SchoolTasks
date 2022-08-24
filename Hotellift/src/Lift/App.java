package Lift;

public class App {

    public static void main(String[] args) {

        Task taskObj = new Task();

        taskObj.fileRead("lift.txt");

        // 3. feladat
        System.out.println("Összes lifthasználat: "+taskObj.howManyTimeLiftUsed());

        // 4. feladat
        taskObj.liftFirstAndLastUse();

        // 5. feladat
        System.out.println("Célszint max: " + taskObj.maxLevel());

        taskObj.task6and7();

        taskObj.statistic();
    }


}
