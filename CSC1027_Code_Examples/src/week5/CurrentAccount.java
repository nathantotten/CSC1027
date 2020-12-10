package week5;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;
	
	public CurrentAccount(String name) {
		super(name);
		this.overdraftLimit = 0.0;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double amt) {
		if ( amt > 0.0 ) {
			overdraftLimit = amt;
		}
	}
	
	@Override
	public boolean withdraw(double amt) {
		if ( amt > 0.0 && (getBalance()-amt) >= -overdraftLimit) {
			setBalance( getBalance() - amt);
			return true;
		}
		return false;
	}
	
	
	@Override
	public String statement() {
		String res = "Current Account Statement\n";
		res +=       "+++++++++++++++++++++++++\n";
		res += super.statement();
		res += "Overdraft Limit: " + overdraftLimit;
		return res;
	}
}
