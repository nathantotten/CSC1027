package week3;

import java.util.Scanner;

public class Exceptions1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a double value: ");

		double dValue = input.nextDouble();
		System.out.println("Double Value: " + dValue);

		input.close();

	}

}
