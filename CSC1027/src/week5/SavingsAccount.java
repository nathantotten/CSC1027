package week5;

public class SavingsAccount extends BankAccount{
	private double interestRate;	// as a %
	
	public SavingsAccount(String name) {
		super(name);
		this.interestRate = 0.0;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double rate) {
		if ( rate > 0.0 ) {
			this.interestRate = rate;
		}
	}
	
	public void payInterest() {
		if ( interestRate > 0.0 ) {
			double amt = (getBalance()*interestRate)/100.0;
			deposit(amt);
		}
	}
	
	@Override
	public String statement() {
		String res = "Savings Account Statement\n";
		res +=       "+++++++++++++++++++++++++\n";
		res += super.statement();
		res += "Interest Rate: " + interestRate;
		return res;
	}
	
}
