package csudh;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Entity> csudh = new ArrayList<Entity>();
        Task taskObj = new Task();
        taskObj.fileRead("csudh.txt");

        // 3. feladat
        System.out.println("Domainek száma: "+taskObj.howManyDomainIp());

        // 4, 5. feladat

        taskObj.domainWriteOut();

        // 6. feladat
        taskObj.writeOutHtml();



    }
}
