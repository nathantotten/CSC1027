package week3;

/**
 * A class to represent a shop till
 *
 */
public class SalesRegister {
	private double totalValue; // total value of transactions
	private String transactions; // list of transactions
	private int numCardSales; // number of card sales
	private int numCashSales; // number of cash sales

	public SalesRegister() {
		this.totalValue = 0.0;
		this.numCardSales = 0;
		this.numCashSales = 0;
		this.transactions = "";
	}

	public double getTotalValue() {
		return this.totalValue;
	}
	
	public int getNumCardSales() {
		return numCardSales;
	}
	
	public int getNumCashSales() {
		return numCashSales;
	}
	
	private void processSale(String item, double value, boolean isCash) {
		if (item != null && value > 0.0) {
			if ( isCash ) {
				transactions += "Cash: ";
				this.numCashSales++;
			}
			else {
				transactions += "Card: ";
				this.numCardSales++;
			}
			this.totalValue += value;
			transactions += String.format("£%.2f", value) + "\t" + item + "\n";
		}
	}

	public void cashSale(String item, double value) {
		processSale(item, value, false);
	}

	public void cardSale(String item, double value) {
		processSale(item, value, true);
	}

	public String listTransactions() {
		return this.transactions;
	}
}
