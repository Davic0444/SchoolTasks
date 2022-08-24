package balkezesek;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static String header = "";
    List<Entity> lefthand = new ArrayList<>();

    public List<Entity> fileRead(String fileName){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            header = br.readLine();
            while (br.ready()){
                String row = br.readLine();
                String[] rowData = row.split(";");
                Entity entityObj = new Entity(
                        rowData[0],
                        LocalDate.parse(rowData[1], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                        LocalDate.parse(rowData[2], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                        Integer.parseInt(rowData[3]),
                        Integer.parseInt(rowData[4])
                );
                lefthand.add(entityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lefthand;
    }

}
