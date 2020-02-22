import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("database.txt");
		Scanner scanner = new Scanner(file);
		LinkedList<Patient> patients = new LinkedList<Patient>();
		LinkedList<Location> locations = new LinkedList<Location>();
		
		//order: patID, patAge, afflication, city
		while(scanner.hasNext()) {
			
			patients.add(new Patient{scanner.next(), scanner.next(), });
			
		}
		

}
