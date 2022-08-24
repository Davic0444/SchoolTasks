package balkezesek;

public class App {
    public static void main(String[] args) {
        Task taskObj = new Task();
        taskObj.fileRead("balkezesek.csv");

        // 3. feladat
        System.out.println(taskObj.dataSize());

        // 4. feladat
        taskObj.weightLastYear1999();

        // 5, 6 feladat
        taskObj.askDate();




    }
}
