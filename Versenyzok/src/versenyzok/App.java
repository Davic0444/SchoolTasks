package versenyzok;

public class App {
    public static void main(String[] args) {

        Task taskObj = new Task();

        // Fájl beolvasás
        taskObj.fileRead("pilotak.csv");

        // 3. feladat
        System.out.println(taskObj.dataNumber());
        System.out.println();

        // 4. feladat
        taskObj.dataLastRow();
        System.out.println();

        // 5. feladat
        taskObj.birthBeforeXIX();
        System.out.println();

        // 6. feladat
        taskObj.smallestStartNumberNationality();
        System.out.println();

        // 7. feladat
        taskObj.sameStartNumber();
    }
}
