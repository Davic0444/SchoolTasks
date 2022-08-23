package hianyzasok;

import java.io.*;
import java.util.*;

public class FileManager {

    private static String header = "";
    List<Entity> student = new ArrayList<Entity>();

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
                        Integer.parseInt(rowData[4]));
                student.add(newEntityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void missingHours(List<Entity> student){
        List<String> classList = new ArrayList<String>();
        for (int i = 0; i < student.size(); i++) {
            boolean isIn = false;
            for (int j = 0; j < classList.size(); j++) {
                if (student.get(i).getInClass().equals(classList.get(j))){
                    isIn = true;
                }
            }
            if (isIn == false){
                classList.add(student.get(i).getInClass());
            }
        }

        int[] listHelp = new int[classList.size()];
        for (int i = 0; i < student.size(); i++) {
            for (int j = 0; j < classList.size(); j++) {
                if (student.get(i).getInClass().equals(classList.get(j))){
                    listHelp[j] += student.get(i).getMissedHours();
                }
            }
        }

        try {
            FileOutputStream fs = new FileOutputStream("osszesites.csv");
            OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
            for (int i = 0; i < listHelp.length; i++) {
                out.write(classList.get(i)+";"+listHelp[i]);;
                out.write("\n");
            }
            out.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
