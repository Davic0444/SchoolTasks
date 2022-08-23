package snooker;

import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		
		Tasks tasksObj = new Tasks();
		tasksObj.fileReader("snooker.txt");
		
		System.out.println("3. feladat:");
		System.out.println("A világranglistán "+tasksObj.howManyRacer()+" versenyző szerepel.");
		System.out.println("4. feladat:");
		System.out.printf("A versenyzők átlagosan %.2f fontot keresnek",tasksObj.avarageReward());
		System.out.println();
		System.out.println("5. feladat:");
		tasksObj.mostRewardChina();
		System.out.println("6. feladat");
		tasksObj.isThereNorwayPlayer();
		System.out.println("7. feladat: Statisztika");
		tasksObj.statistics();

	}

}
