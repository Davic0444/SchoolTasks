package balkezesek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Task {

    private static double inch = 2.54;

    List<Entity> lefthand = new ArrayList<Entity>();
    FileManager fmObj = new FileManager();

    public void fileRead(String fileName) {
        lefthand = fmObj.fileRead(fileName);
    }

    public Integer dataSize() {
        return lefthand.size();
    }

    public void weightLastYear1999() {
        DecimalFormat df = new DecimalFormat("#.#");
        double temp = 0.0;
        for (Entity entity : lefthand) {
            if (entity.getLast().getYear() == 1999 && entity.getLast().getMonthValue() == 10) {
                temp = entity.getHeight() * inch;
                System.out.println(entity.getName() + " " + df.format(temp) + " cm");
            }
        }
    }

    public void askDate() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.##");
        double tempweight = 0.0;
        double avarage = 0.0;
        int amount = 0;
        int askDate = 0;
        try {
            System.out.println("Kérem adjon meg egy évszámot (1990-1999): ");
            askDate = Integer.parseInt(br.readLine());
            while (askDate > 1999 || askDate < 1990) {
                System.out.println("Hibás adat, kérek egy 1990 és 1999 közötti évszámot!: ");
                askDate = Integer.parseInt(br.readLine());
            }
            for (Entity entity : lefthand) {
                if (askDate <= entity.getFirst().getYear() && askDate >= entity.getLast().getYear()) {
                    amount++;
                    tempweight = Double.sum(tempweight, entity.getWeight());
                }
            }
            avarage = tempweight / amount;
            System.out.println("6. feladat: " + df.format(avarage) + " font");
        } catch (IOException e) {
            System.out.println("IOEXP");
        }
    }


}
