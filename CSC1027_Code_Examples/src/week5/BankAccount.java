package week5;

public class BankAccount {
	private String name;
	private int acctNum;
	private double balance;
	private static int nextNum = 1;
	private static double totalAmt = 0.0;
	
	public BankAccount(String name) {
		this.name = name;
		this.acctNum = nextAcctNum();
		this.balance = 0.0;
	}
	
	public BankAccount(String name, double amt) {
		this.name = name;
		this.acctNum = nextAcctNum();
		if ( amt > 0.0 ) {
			balance = amt;
		}
		else {
			this.balance = 0.0;
		}
	}
	
	private static int nextAcctNum() {
		int num = nextNum;
		nextNum++;
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double amt) {
		balance = amt;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean deposit(double amt) {
		if (amt>0.0) {
			balance += amt;
			totalAmt += amt;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double amt) {
		if (amt>0.0 && (balance-amt>=0.0)) {
			balance -= amt;
			totalAmt -= amt;
			return true;
		}
		return false;
	}
	
	public String statement() {
		String result = "Name: " + getName() + "\n";
		result += "Number: " + getAcctNum() + "\n";
		result += "Balance: " + String.format("�%.2f",getBalance()) + "\n";
		return result;
	}
	
	public static String audit() {
		String res = "Bank funds:" + String.format("�%.2f", totalAmt);
	    return res;
	}
}
