package week5;

import java.util.ArrayList;

public class BankAccountTest {

	public static void main(String[] args) {
		ArrayList<BankAccount> theBank = new ArrayList<BankAccount>();
		CurrentAccount ca1 = new CurrentAccount("Michael");
		CurrentAccount ca2 = new CurrentAccount("Thomas");
		CurrentAccount ca3 = new CurrentAccount("Sarah");
		
		SavingsAccount sa1 = new SavingsAccount("Peter");
		SavingsAccount sa2 = new SavingsAccount("Patrick");
		
		theBank.add(ca1);
		theBank.add(ca2);
		theBank.add(ca3);
		theBank.add(sa1);
		
		theBank.add(sa2);
		
		for(BankAccount ba : theBank) {
			System.out.println(ba.statement());
			System.out.println();
		}
	}

}
