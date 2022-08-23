package berek;

public class App {

	public static void main(String[] args) {
		
		Tasks tasksObj = new Tasks();
		
		System.out.println("2. feladat:");
		tasksObj.fileRead("berek2020.txt");
		System.out.println("Beolvasás sikeres volt");
		System.out.println();
		
		System.out.println("3, feladat:");
		System.out.println(tasksObj.howManyData()+" dolgozó adat van!");
		System.out.println();
		
		System.out.println("4. feladat");
		System.out.println(tasksObj.avarageSalaries()+" eFt!");
		System.out.println();
		
		System.out.println("5. feladat");
		tasksObj.askDepartment();
		System.out.println();
		
		System.out.println("7. feladat: Statisztika");
		tasksObj.statistic();
		
	}

}
