package csudh;

import java.util.ArrayList;
import java.util.List;

public class Task {

    List<Entity> csudh = new ArrayList<Entity>();
    FileManager fmObj = new FileManager();

    public void fileRead(String fileName){
        csudh = fmObj.fileRead(fileName);
    }

    public int howManyDomainIp(){
        return csudh.size();
    }
    
    public static String Domain(String domain, int level){
        String split[] = domain.split("\\.");
        int index = split.length;
        if (index < level){
            return "nincs";
        } else {
            return split[index - level];
        }
    }

    public void domainWriteOut(){
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+ ". szint: "+ Domain(csudh.get(0).getDomainName(),i+1));
        }
    }

    public void writeOutHtml(){
        fmObj.writeOutHtml();
    }
    
    
}
