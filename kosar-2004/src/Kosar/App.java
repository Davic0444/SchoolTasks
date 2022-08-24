package Kosar;

public class App {
    public static void main(String[] args) {

        Task taskObj = new Task();
        taskObj.fileRead("eredmenyek.csv");

        // 3. feladat
        taskObj.howManyMatchRealMadrid();

        // 4. feladat
        taskObj.drawMatch();

        // 5. feladat
        taskObj.barcelonaFullName();

        // 6. feladat
        System.out.println("6. feladat");
        taskObj.taskSix();

        // 7. feladat
        System.out.println("7. feladat");
        taskObj.stadionsWithMoreThan20Match();


    }
}
