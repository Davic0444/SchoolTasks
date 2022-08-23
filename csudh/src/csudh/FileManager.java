package csudh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static csudh.Task.Domain;

public class FileManager {

    private static String header = "";
    List<Entity> csudh = new ArrayList<Entity>();

    public List<Entity> fileRead(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            header = br.readLine();
            while (br.ready()) {
                String row = br.readLine();
                String[] rowData = row.split(";");
                Entity newEntityObj = new Entity(
                        rowData[0],
                        rowData[1]);
                csudh.add(newEntityObj);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csudh;

    }

    public void writeOutHtml() {
        try {
            FileOutputStream fs = new FileOutputStream("table.html");
            OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");

            out.write("<table>" +
                    "<tr>" +
                    "<th style='text-align: left'>Ssz</th>" +
                    "<th style='text-align: left'>Host Domainneve</th>" +
                    "<th style='text-align: left'>Host IP címe</th>" +
                    "<th style='text-align: left'>1. szint</th>" +
                    "<th style='text-align: left'>2. szint</th>" +
                    "<th style='text-align: left'>3. szint</th>" +
                    "<th style='text-align: left'>4. szint</th>" +
                    "<th style='text-align: left'>5. szint</th>" +
                    "</tr>");

            for (int i = 0; i < csudh.size(); i++) {
                try {
                    out.write("<tr>" +
                            "<th style='text-align: left'>" + ((i + 1) + ".") + "</th>" +
                            "<td>" + csudh.get(i).getDomainName() + "</td>" +
                            "<td>" + csudh.get(i).getIpAddress() + "</td>" +
                            "<td>" + Domain(csudh.get(i).getDomainName(), 1) + "</td>" +
                            "<td>" + Domain(csudh.get(i).getDomainName(), 2) + "</td>" +
                            "<td>" + Domain(csudh.get(i).getDomainName(), 3) + "</td>" +
                            "<td>" + Domain(csudh.get(i).getDomainName(), 4) + "</td>" +
                            "<td>" + Domain(csudh.get(i).getDomainName(), 5) + "</td>" +
                            "</tr>"
                    );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}