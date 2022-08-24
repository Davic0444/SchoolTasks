package versenyzok;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static String header = "";
    List<Entity> racers = new ArrayList<Entity>();

    public List<Entity> fileRead(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            header = br.readLine();
            while (br.ready()) {
                String row = br.readLine();
                String[] rowData = row.split(";", -1);
                String time[] = rowData[1].split("\\.");
                if (rowData[3].isEmpty()) {
                    Entity entityObj = new Entity(
                            rowData[0],
                            LocalDate.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2])),
                            rowData[2],
                            15000);
                    racers.add(entityObj);
                } else {
                    Entity secondEntityObj = new Entity(
                            rowData[0],
                            LocalDate.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2])),
                            rowData[2],
                            Integer.parseInt(rowData[3]));
                    racers.add(secondEntityObj);
                }
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return racers;
    }

}
