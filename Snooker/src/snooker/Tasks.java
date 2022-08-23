package snooker;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
	
	List<Entity> snooker = new ArrayList<Entity>();
	FileManager fmObj = new FileManager();
	
	public void fileReader(String fileName) {
		snooker = fmObj.fileReader(fileName);
	}
	
	public Integer howManyRacer() {
		return snooker.size();
	}
	
	public Double avarageReward() {
		Integer piece = 0;
		Integer total = 0;
		for (Entity entity : snooker) {
			piece++;
			total += entity.getAward();
		}
		return (double) total/piece;
	}
	
	public void mostRewardChina() {
		Integer maxReward = -1;
		for (Entity entity : snooker) {
			if (entity.getAward()>maxReward && entity.getCountry().equalsIgnoreCase("kína")) {
				maxReward = entity.getAward();
			}
		}
		for (Entity entity : snooker) {
			if (entity.getAward().equals(maxReward)) {
				System.out.println("A legjobban kereső kínai versenyző:");
				System.out.println("Helyezés: "+entity.getPosition());
				System.out.println("Név: "+entity.getName());
				System.out.println("Ország: "+entity.getCountry());
				System.out.println("Nyeremény összege: "+entity.getAward()*380+" forint");
			}

		}
	}
	
	public void isThereNorwayPlayer() {
		Boolean isThereNorway = false;
		for (Entity entity : snooker) {
			if (entity.getCountry().equalsIgnoreCase("Norvégia")) {
				isThereNorway = true;
			}
		}
		if (isThereNorway==true) {
			System.out.println("Van norvég játékos.");
		}else {
			System.out.println("Nincs norvég játékos.");
		}
	}

	public void statistics() {
		List<String> nationList = new ArrayList<String>();
		for (int i = 0; i < snooker.size(); i++) {
			boolean isIn = false;
			for (int j = 0; j < nationList.size(); j++) {
				if (snooker.get(i).getCountry().equalsIgnoreCase(nationList.get(j))){
					isIn = true;
				}
			}
			if (isIn == false){
				nationList.add(snooker.get(i).getCountry());
			}
		}

		int[] listHelp = new int[nationList.size()];
		for (int i = 0; i < snooker.size(); i++) {
			for (int j = 0; j < nationList.size(); j++) {
				if (snooker.get(i).getCountry().equalsIgnoreCase(nationList.get(j))) {
					listHelp[j]++;
				}
			}
		}
		for (int i = 0; i < listHelp.length; i++) {
			if (listHelp[i] > 4){
				System.out.println(nationList.get(i)+" - "+ listHelp[i]);
			}
		}
	}
	
}
