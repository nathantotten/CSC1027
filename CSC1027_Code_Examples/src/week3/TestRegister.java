package week3;

import java.util.Scanner;

public class TestRegister {

	private static SalesRegister till = new SalesRegister();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String options[] = { "Cash Sale", "Card Sale", "Display Transactions", "Quit" };
		Menu register = new Menu("Sales Register", options);

		int choice = register.getUserChoice();
		while (choice != options.length) {
			processChoice(choice);
			choice = register.getUserChoice();
		}
		System.out.println("Finished - Goodbye!");
		input.close();
	}

	private static double readAmount(String message) {
		System.out.print(message);
		double res = input.nextDouble();
		input.nextLine();
		return res;
	}

	private static String readName(String message) {
		System.out.print(message);
		return input.nextLine();
	}

	private static void displayDetails() {
		System.out.println("Sales Register Details\n");
		System.out.println("Total Sales Value: " + String.format("£%.2f", till.getTotalValue()));
		System.out.println("Total Cash Sales: " + till.getNumCashSales());
		System.out.println("Total Card Sales: " + till.getNumCardSales());
		System.out.println("Transactions:");
		System.out.println(till.listTransactions());
	}

	private static void processChoice(int number) {
		double amount = 0.0;
		String itemName;
		switch (number) {
		case 1:
			itemName = readName("Enter item name: ");
			amount = readAmount("Enter amount in £: ");
			till.cashSale(itemName, amount);
			break;
		case 2:
			itemName = readName("Enter item name: ");
			amount = readAmount("Enter amount in £: ");
			till.cardSale(itemName, amount);
			break;
		case 3:
			displayDetails();
			break;
		default:
			System.out.println("Unknown choice: " + number);
		}
	}

}
