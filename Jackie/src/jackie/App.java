package jackie;

public class App {
    public static void main(String[] args) {
        Task taskObj = new Task();

        // Beolvasás
        taskObj.fileRead("jackie.txt");

        // 3. feladat
        System.out.println(taskObj.listSize());

        // 4. feladat
        System.out.println(taskObj.mostRaceYear());

        // 5. feladat
        taskObj.yearDecades();

        // 6. feladat
        taskObj.fileWrite();

    }
}
