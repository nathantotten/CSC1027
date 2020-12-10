package week4;

public class TestBank {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount("Homer", 1234);
		BankAccount acct2 = new BankAccount("Marge", 1235);
		acct1.deposit(20);
		acct2.deposit(30);
		
		System.out.println(acct1.statement());
		System.out.println(acct2.statement());
		
		BankAccountV2 acct3 = new BankAccountV2("Bart");
		BankAccountV2 acct4 = new BankAccountV2("Lisa");
		acct3.deposit(40);
		acct4.deposit(50);
		System.out.println(acct3.statement());
		System.out.println(acct4.statement());
		
		BankAccountV3 acct5 = new BankAccountV3("Barney");
		BankAccountV3 acct6 = new BankAccountV3("Wiggum");
		acct5.deposit(60);
		acct6.deposit(70);
		System.out.println(acct5.statement());
		System.out.println(acct6.statement());
		System.out.println(BankAccountV3.audit());
	}

}
