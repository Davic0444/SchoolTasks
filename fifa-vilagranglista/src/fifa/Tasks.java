	package fifa;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
	
	List<Entity> teams = new ArrayList<Entity>();
	FileManager fmObj = new FileManager();
	
	public void fileRead(String fileName) {
		teams = fmObj.fileReader(fileName);
	}
	
	public Integer teamsNumber() {
		return teams.size();
	}
	
	public Double avarageScore() {
		double piece = 0;
		double total = 0;
		for (Entity entity : teams) {
			piece++;
			total += entity.getScore();
		}
		return (double) Math.round((total/piece*100)/1)/100;
	}
	
	public void mostChange() {
		int mostChanges = -10;
		for (Entity entity : teams) {
			if (entity.getChanges()>mostChanges) {
				mostChanges = entity.getChanges();
			}
		}
		for (Entity entity : teams) {
			if (entity.getChanges().equals(mostChanges)) {
				System.out.println("5. feladat: A legt�bbet jav�t� csapat:");
				System.out.println("Helyez�s: "+entity.getPosition());
				System.out.println("Csapat: "+entity.getTeam());
				System.out.println("Pontsz�m: "+entity.getScore());
			}
		}
	}
	
	public void isThereHungaryTeam() {
		boolean isThereHungary = false;
		for (Entity entity : teams) {
			if (entity.getTeam().equalsIgnoreCase("Hungary")) {
				isThereHungary = true;
			}
		}
		if (isThereHungary== true) {
			System.out.println("A csapatok k�z�l van Magyarorsz�g.");
		}
		else {
			System.out.println("A csapatok k�z�l nincs Magyarorsz�g.");
		}
	}
	
	public void statistics() {
		Integer zeroChanges = 0;
		Integer minusOneChanges = 0;
		Integer oneChanges = 0;
		for (Entity entity : teams) {
			if (entity.getChanges()==0) {
				zeroChanges++;
			}
		}
		System.out.println("0 helyet v�ltozott: "+zeroChanges);
		for (Entity entity : teams) {
			if (entity.getChanges()==-1) {
				minusOneChanges++;
			}
		}
		System.out.println("-1 helyet v�ltozott: "+minusOneChanges);
		for (Entity entity : teams) {
			if (entity.getChanges()==1) {
				oneChanges++;
			}
		}
		System.out.println("1 helyet v�ltozott csapat: "+oneChanges);
	}
	
	
}
