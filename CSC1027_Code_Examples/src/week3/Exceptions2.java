package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean validInput = false;
		do {
			System.out.print("Enter a double value: ");
			try {
				double dValue = input.nextDouble();
				System.out.println("Double Value: " + dValue);
				validInput = true;
			}
			catch(InputMismatchException nfe) {
				System.out.println("That's not a double value!");
				input.nextLine();
			}
		}
		while( !validInput ); // or while( validInput == false)
		System.out.println("Input completed.");
		input.close();
	}
}
