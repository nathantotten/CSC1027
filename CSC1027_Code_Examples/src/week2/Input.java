package week2;

import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // create a Scanner
		
		System.out.print("Enter first name: "); // output message 
		String fName = input.nextLine(); // read from console 
		System.out.print("Enter last name: "); // output message 
		String lName = input.nextLine(); // read from console 
		System.out.println("Full name is: " + lName + ", " + fName); 

		input.close();
	}
}
