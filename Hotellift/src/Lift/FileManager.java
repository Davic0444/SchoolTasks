package Lift;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    List<Entity> lift = new ArrayList<Entity>();

    public List<Entity> fileRead(String fileName){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            while(br.ready()){
                String row = br.readLine();
                String[] rowData = row.split(" ");
                Entity entityObj = new Entity(
                        LocalDate.parse(rowData[0], DateTimeFormatter.ofPattern("yyyy.MM.dd.")),
                        Integer.parseInt(rowData[1]),
                        Integer.parseInt(rowData[2]),
                        Integer.parseInt(rowData[3]));
                lift.add(entityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lift;
    }

    public String timeWrite(LocalDate date){
        return String.valueOf(date).replace("-", ".");
    }
}
