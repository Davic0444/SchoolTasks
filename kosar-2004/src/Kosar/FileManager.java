package Kosar;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static String header = "";
    List<Entity> basketball = new ArrayList<Entity>();

    public List<Entity> fileRead(String fileName){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            header = br.readLine();
            while (br.ready()){
                String row = br.readLine();
                String[] rowData = row.split(";");

                Entity newEntityObj = new Entity(
                        rowData[0],
                        rowData[1],
                        Integer.parseInt(rowData[2]),
                        Integer.parseInt(rowData[3]),
                        rowData[4],
                        LocalDate.parse(rowData[5], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                basketball.add(newEntityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return basketball;
    }

}
