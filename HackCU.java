import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

//import Patient;

public class HackCU {
	public static void main(String[] args) {
		File file = new File("database");
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		}catch(FileNotFoundException s){
			System.out.println("File does Not Exist Please Try Again: ");
		}
		
		LinkedList<Patient> patients = new LinkedList<Patient>();
		LinkedList<Location> locations = new LinkedList<Location>();
		
		//order: patID, patAge, affliction, x, y, city
		//put all data into two linked lists, one for cities another for patients
		while(scanner.hasNext()) {
			int patID = scanner.nextInt();
			int patAge = scanner.nextInt();
			String affliction = scanner.next();
			double x_ = scanner.nextDouble();
			double y_ = scanner.nextDouble();
			String city = scanner.next();


			Patient pat = new Patient(patID, patAge, affliction);
			Location loc = new Location(x_, y_, city);
			
			patients.add(pat);
			locations.add(loc);
		}
		
		sortLocations(locations, patients, locations.size());
		//printCity(locations);
		writeToFile(locations);
		//printOutput(locations);
		
	}
	
	public static void printCity(LinkedList<Location> locations) {
		for(int i =0; i<locations.size(); i++){
			System.out.println(locations.get(i).city);
		}
	}
	
	public static void sortLocations(LinkedList<Location> locations, LinkedList<Patient> patients, int size) {
		String list[] = new String[size];
		for(int i = 0; i<size; i++) {
			if(!contains(list, locations.get(i).city)) {
				list[i] = locations.get(i).city;
				locations.get(i).setDisease(patients.get(i).affliction);
				//System.out.println(locations.get(i).diseases[0]);
			}
			else {
				int y = find(locations.get(i).city, locations);
				locations.get(y).setDisease(patients.get(i).affliction);
				locations.get(y).addCount();
				locations.remove(i);
				size--;
				i--;
			}
		}
	}
	
	public static boolean contains(String list[], String city) {
		for(int i = 0; i<list.length; i++) {
			if(list[i]==null) {
				return false;
			}
			if(list[i].equalsIgnoreCase(city)) {
				return true;
			}
		}
		return false;
	}
	
	public static int find(String city, LinkedList<Location> locations) {
		for(int i = 0; i < locations.size(); i++) {
			if(locations.get(i).city.equals(city)) {
				return i;
			}
		}
		
		return 0;
	}
	
	public static void writeToFile(LinkedList<Location> locations){
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("output.txt");
		}catch(IOException s) {
			System.out.println("Unable to write file Please Try Again: ");
		}
		PrintWriter printWriter = new PrintWriter(fileWriter);

		
		
		for(int i = 0; i < locations.size(); i++) {
			printWriter.write(locations.get(i).city);
			printWriter.write(' ');
			
			int y = 0;
			while(locations.get(i).diseases[y] != null){
				printWriter.write(locations.get(i).diseases[y]);
				printWriter.write(' ');
				y++;
			}
			
			printWriter.write(locations.get(i).pCount);
			printWriter.write('\n');
		}
		printWriter.close();
	}
	
//	public static void printOutput(LinkedList<Location> locations){
//		for(int i = 0; i <locations.size(); i++) {
//			System.out.println(locations.get(i).);
//		}
//	}

}
