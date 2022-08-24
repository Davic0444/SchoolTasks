package jackie;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    FileManager fmObj = new FileManager();
    List<Entity> jackie = new ArrayList<Entity>();

    public void fileRead(String fileName) {
        jackie = fmObj.fileRead(fileName);
    }

    public int listSize() {
        return jackie.size();
    }

    public int mostRaceYear() {
        int mostRaceYear = jackie.stream().mapToInt(k -> k.getRaces()).max().getAsInt();
        int year = 0;
        for (int i = 0; i < jackie.size(); i++) {
            if (jackie.get(i).getRaces() == mostRaceYear) {
                year += jackie.get(i).getYear();
            }
        }
        return year;
    }

    public void yearDecades() {
        int decade70Wins = 0;
        int dacede60Wins = 0;
        for (Entity entity : jackie) {
            if (entity.getYear() >= 1970 && entity.getYear() < 1980) {
                decade70Wins+= entity.getWins();
            } else if (entity.getYear() >= 1960 && entity.getYear() < 1970) {
                dacede60Wins += entity.getWins();
            }
        }
        System.out.println("1970 évek győlemei: " + decade70Wins);
        System.out.println("1960 évek győzelmek: " + dacede60Wins);
    }

    public void fileWrite(){
        List<Entity> ordered = jackie.stream().sorted(Comparator.comparingInt(Entity::getYear).reversed()).collect(Collectors.toList());
        try {
            PrintWriter pw = new PrintWriter("jackie.html");
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head><head/>");
            pw.println("<style> td{border:1px solid black;}</style>");
            pw.println("<body>");
            pw.println("<h1>Jackie Stewart</h1>");
            pw.println("<table>");
            for (int i = 0; i < ordered.size(); i++) {
                pw.println("<tr><td>"+ordered.get(i).getYear()+"</td><td>"+ordered.get(i).getRaces()+"</td><td>"+ordered.get(i).getWins()+"</td></tr>");
            }
            pw.println("</table>");
            pw.println("</body>");
            pw.println("</html>");
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
