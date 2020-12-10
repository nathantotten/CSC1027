package week9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StorageManager {
	private final String personDir = "C:/test/PeopleData.csv";
	
	public StorageManager() {
		
	}
	
	public void storePeople(ArrayList<Person> data) {	
		try {
		   FileWriter myFw = new FileWriter(personDir,false);
		   PrintWriter myPw = new PrintWriter(myFw);
		   for(Person p : data) {
			   myPw.println( p.getName());
		   }
		   myPw.close();
		   myFw.close();
		}
		catch(IOException ex) {
			System.out.println("Can't write Person data: " + ex);
		}

	}
	
	public ArrayList<Person> restorePeople(){
		ArrayList<Person> list = new ArrayList<Person>();
		try {
			File myFile = new File(personDir);
			Scanner input = new Scanner(myFile);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String data[] = line.split(",");
				Person p = new Person(data[1].trim(), data[0].trim());
				list.add(p);
			}
		}
		catch(IOException ioe) {
			System.out.println("Can't read Person data: " + ioe);
		}
		return list;
	}
}
