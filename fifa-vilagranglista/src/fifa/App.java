package fifa;

public class App {

	public static void main(String[] args) {
		
		Tasks taskObj = new Tasks();
		taskObj.fileRead("fifa.txt");
		
		System.out.println("3. feladat:");
		System.out.println("A világranglistán"+taskObj.teamsNumber()+" csapat szerepel");
		System.out.println();
		System.out.println("4. feladat:");
		System.out.println("A csapatok átlagos pontszáma: "+taskObj.avarageScore()+" pont");
		System.out.println("5. feladat:");
		taskObj.mostChange();
		System.out.println();
		System.out.println("6. feladat:");
		taskObj.isThereHungaryTeam();
		System.out.println();
		System.out.println("7. feladat: Statisztika");
		taskObj.statistics();
		
	}

}
