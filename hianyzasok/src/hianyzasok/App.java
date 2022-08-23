package hianyzasok;

public class App {

    public static void main(String[] args) {

        Task taskObj = new Task();
        taskObj.fileRead("szeptember.csv");

        // 2. feladat
        System.out.println("Összesen mulasztott órák száma: "+taskObj.missingHours());

        // 3, 4, 5 feladat egyben
        taskObj.askAStudent();

        // 6. feladat
        taskObj.studentMissingHoursByClass();





    }
}
