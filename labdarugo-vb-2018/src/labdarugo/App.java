package labdarugo;

public class App {
    public static void main(String[] args) {

        Task taskObj = new Task();

        taskObj.fileRead("vb2018.txt");

        // 3. feladat
        System.out.println("Stadionok száma: "+taskObj.howManyStadionsWerePlayed());
        System.out.println();

        // 4. feladat
        taskObj.lowestSpace();
        System.out.println();

        // 5. feladat
        System.out.println(taskObj.avarageSpace());
        System.out.println();

        // 6. feladat
        taskObj.twoNameStadium();
        System.out.println();

        // 7. 8 feladat
        taskObj.askCity();

        // 9. feladat
        taskObj.differentCity();





    }
}
