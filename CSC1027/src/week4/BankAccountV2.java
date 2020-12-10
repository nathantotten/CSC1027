package week4;

public class BankAccountV2 {
	private String name;
	private int acctNum;
	private double balance;
	private static int nextNum = 1;
	
	public BankAccountV2(String name) {
		this.name = name;
		this.acctNum = nextAcctNum();
		this.balance = 0.0;
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean deposit(double amt) {
		if (amt>0.0) {
			balance += amt;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double amt) {
		if (amt>0.0 && (balance-amt>=0.0)) {
			balance -= amt;
			return true;
		}
		return false;
	}
	
	public String statement() {
		String result = "Name: " + getName() + "\n";
		result += "Number: " + getAcctNum() + "\n";
		result += "Balance: " + getBalance() + "\n";
		return result;
	}
}
