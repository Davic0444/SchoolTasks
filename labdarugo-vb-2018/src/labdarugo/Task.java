package labdarugo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {

    FileManager fmObj = new FileManager();
    List<Entity> soccerWold = new ArrayList<Entity>();

    public void fileRead(String fileName){
        soccerWold = fmObj.fileRead(fileName);
    }

    public int howManyStadionsWerePlayed(){
        return soccerWold.size();
    }

    public void lowestSpace(){
        int space = soccerWold.get(0).getSpace();
        for (int i = 0; i < soccerWold.size(); i++) {
            if (soccerWold.get(i).getSpace() < space){
                space = soccerWold.get(i).getSpace();
            }
        }
        for (Entity entity : soccerWold) {
            if (entity.getSpace().equals(space)){
                System.out.println(entity.getCity());
                System.out.println(entity.getStadion());
                System.out.println(entity.getStadionAltName());
                System.out.println(entity.getSpace());
            }
        }
    }

    public Double avarageSpace(){
        Double spaces = 0.0;
        for (int i = 0; i < soccerWold.size(); i++) {
            spaces += soccerWold.get(i).getSpace();
        }
        return (double) Math.round(spaces/soccerWold.size()*10)/10;
    }

    public void twoNameStadium(){
        int twoName = 0;
        for (int i = 0; i < soccerWold.size(); i++) {
            if (!soccerWold.get(i).getStadionAltName().contains("n.a.")){
                twoName++;
            }
        }
        System.out.println("Két néven is ismert stadionok száma: "+twoName);
    }

    public void askCity(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Boolean isCityAvailable = false;
            String askedCity = "";
            while(isCityAvailable == false){
                System.out.println("Adjon meg egy város nevet: ");
                askedCity = br.readLine();
                if (Pattern.matches("\\w{3}", askedCity)){
                    isCityAvailable = true;
                }
            }

            // 8. feladat rész
            boolean isMatch = false;
            for (int i = 0; i < soccerWold.size(); i++) {
                if (soccerWold.get(i).getCity().equalsIgnoreCase(askedCity)){
                    isMatch = true;
                }
            }
            if (isMatch == true){
                System.out.println("A megadott város VB helyszín!");
            } else {
                System.out.println("A magadott város nem VB helyszín");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void differentCity(){
        List<String> differentCities = new ArrayList<String>();
        for (int i = 0; i < soccerWold.size(); i++) {
            boolean isIn = false;
            for (int j = 0; j < differentCities.size(); j++) {
                if (soccerWold.get(i).getCity().equals(differentCities.get(j))){
                    isIn = true;
                }
            }
            if (isIn == false){
                differentCities.add(soccerWold.get(i).getCity());
            }
        }
        System.out.println(differentCities.size() + " külömböző városban voltak mérközések.");
    }

}
