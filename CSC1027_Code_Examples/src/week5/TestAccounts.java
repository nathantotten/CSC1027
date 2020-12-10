package week5;

public class TestAccounts {
	public static void main(String args[]) {
		//testSavingsAcct();
		testCurrentAcct();
	}
	
	private static void testSavingsAcct() {
		// a savings account
		SavingsAccount sa1 =  new SavingsAccount("Bart");
		// set interest rate
		sa1.setInterestRate(4.0);	// 4% interest
		// deposit some money
		sa1.deposit(20.0);
		// call inherited statement() method
		System.out.println(sa1.statement());
		// payment of interest
		sa1.payInterest();
		System.out.println("\nAfter interest payment....\n");
		// another statement ...
		System.out.println(sa1.statement());
	}
	
	private static void testCurrentAcct() {
		// a current account
		CurrentAccount ca1 = new CurrentAccount("Homer");
		// set overdraft limit
		ca1.setOverdraftLimit(50.0);	// can go £50 into the red
		// deposit some money
		ca1.deposit(25.0);
		// call inherited statement() method
		System.out.println(ca1.statement());
		// withdraw £40 - should go £15 into the red
		ca1.withdraw(40.0);	// could also test result of this
		System.out.println("\nAfter withdrawing £40....\n");
		// get another statement
		System.out.println(ca1.statement());
	}
}
