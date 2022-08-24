package jackie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static String header = "";
    List<Entity> jackie = new ArrayList<Entity>();

    public List<Entity> fileRead(String fileName){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            header = br.readLine();
            while (br.ready()){
                String row = br.readLine();
                String[] rowData = row.split("\t");
                Entity entityObj = new Entity(
                        Integer.parseInt(rowData[0]),
                        Integer.parseInt(rowData[1]),
                        Integer.parseInt(rowData[2]),
                        Integer.parseInt(rowData[3]),
                        Integer.parseInt(rowData[4]),
                        Integer.parseInt(rowData[5]));
                jackie.add(entityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jackie;
    }

}
