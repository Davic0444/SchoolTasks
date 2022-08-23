package fifa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	private static String header="";
	List<Entity> teams = new ArrayList<Entity>();
	
	public List<Entity> fileReader(String fileName){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			header = br.readLine();
			while (br.ready()) {
				String row = br.readLine();
				String[] rowData = row.split(";");
				Entity newEntityObj = new Entity(
						rowData[0],
						Integer.parseInt(rowData[1]),
						Integer.parseInt(rowData[2]),
						Integer.parseInt(rowData[3]));
				teams.add(newEntityObj);
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teams;
	}
	
}
