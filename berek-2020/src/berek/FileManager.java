package berek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	private static String header = "";
	List<berek.Entity> salaries = new ArrayList<berek.Entity>();
	
	public List<Entity> fileReader(String fileName){
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fileName), "UTF-8"));	
			header = br.readLine();
			
			while (br.ready()) {
				String row = br.readLine();
				String[] rowData = row.split(";");
				
				Entity newEntityObj = new Entity(
						rowData[0],
						rowData[1],
						rowData[2],
						Integer.parseInt(rowData[3]),
						Integer.parseInt(rowData[4]));
				salaries.add(newEntityObj);
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
		return salaries;
	}
	
}
