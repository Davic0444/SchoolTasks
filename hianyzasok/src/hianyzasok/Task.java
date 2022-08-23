package hianyzasok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task {

    List<Entity> students = new ArrayList<Entity>();
    FileManager fmObj = new FileManager();

    public void fileRead(String fileName) {
        students = fmObj.fileRead(fileName);
    }

    public Integer missingHours() {
        int hours = 0;
        for (int i = 0; i < students.size(); i++) {
            hours += students.get(i).getMissedHours();
        }
        return hours;
    }

    public void askAStudent() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Kérem adjon meg egy napot: ");
            Integer day = Integer.parseInt(br.readLine());
            System.out.print("Tanuló neve: ");
            String studentName = br.readLine();
            boolean wasMissing = false;
            for (Entity student : students) {
                if (student.getName().equalsIgnoreCase(studentName)) {
                    wasMissing = true;
                }
            }
            if (wasMissing == true) {
                System.out.println("A tanuló hiányzott szeptemberben!");
            } else {
                System.out.println("A tanuló nem hiányzott szemptemberben!");
            }

            for (Entity student : students) {
                if (student.getLastDay().equals(day) || student.getLastDay().equals(day)) {
                    System.out.println(student.getName() + " " + student.getInClass());
                } else {
                    System.out.println("Nem volt hiányzó.");
                    break;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void studentMissingHoursByClass(){
        fmObj.missingHours(students);
    }

}
