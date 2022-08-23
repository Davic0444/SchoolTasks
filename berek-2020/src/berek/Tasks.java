package berek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tasks {
	
	List<Entity> salaries = new ArrayList<Entity>();
	FileManager fmObj = new berek.FileManager();
	
	public void fileRead(String fileName) {
		salaries = fmObj.fileReader(fileName);
	}
	
	public void dataWriteOut() {
		for (berek.Entity entity : salaries) {
			System.out.print(entity.getName());
			System.out.print(";");
			System.out.print(entity.getGender());
			System.out.print(";");
			System.out.print(entity.getDepartment());
			System.out.print(";");
			System.out.print(entity.getEntry());
			System.out.print(";");
			System.out.print(entity.getSalary());
			System.out.println();
		}
	}
	
	public Integer howManyData() {
		int workersNumber = 0;
		for (Entity entity : salaries) {
			workersNumber++;
		}
		return workersNumber;
	}
	
	public Double avarageSalaries() {
		Integer piece = 0;
		Integer total = 0;
		for (Entity entity : salaries) {
			piece++;
			total += entity.getSalary();
		}
		return (double) Math.round((total/piece*10)/1000)/10;
	}
	
	public void askDepartment() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Kérem egy részleg nevét: ");
			String department = br.readLine();
			Integer maxSalary = -1;
			for (Entity entity : salaries) {
				if (entity.getDepartment().equalsIgnoreCase(department) && entity.getSalary()>maxSalary) {
					maxSalary = entity.getSalary();
				}
			}
			for (Entity entity : salaries) {
				if (entity.getSalary().equals(maxSalary) && entity.getDepartment().equalsIgnoreCase(department)) {
					System.out.println("6. feladat: A legtöbbet keresõ dolgozó a megadott részlegen");
					System.out.println("Név: "+entity.getName());
					System.out.println("Neme: "+entity.getGender());
					System.out.println("Belépés: "+entity.getEntry());
					System.out.println("Bér: "+entity.getSalary());
				}

			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void statistic() {
		int beszerzes = 0;
		int penzugy = 0;
		int asztalosmuhely = 0;
		int ertekesites = 0;
		int lakatosmuhely = 0;
		int karbantartas = 0;
		int szerelomuhely = 0;
		int szemelyzeti = 0;
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("beszerzés")) {
				beszerzes++;
			}
		}
		System.out.println("beszerzés - "+beszerzes+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("pénzügy")) {
				penzugy++;
			}
		}
		System.out.println("penzügy - "+penzugy+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("asztalosmûhely")) {
				asztalosmuhely++;
			}
		}
		System.out.println("asztalosmûhely - "+asztalosmuhely+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("értékesítés")) {
				ertekesites++;
			}
		}
		System.out.println("értékesítés - "+ertekesites+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("lakatosmûhely")) {
				lakatosmuhely++;
			}
		}
		System.out.println("lakatosmûhely - "+lakatosmuhely+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("karbantartás")) {
				karbantartas++;
			}
		}
		System.out.println("karbantartás - "+karbantartas+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("szerelõmûhely")) {
				szerelomuhely++;
			}
		}
		System.out.println("szerelõmûhely - "+szerelomuhely+" fõ");
		
		for (Entity entity : salaries) {
			if (entity.getDepartment().equalsIgnoreCase("személyzeti")) {
				szemelyzeti++;
			}
		}
		System.out.println("személyzeti - "+szemelyzeti+" fõ");
	}
	
	
}
