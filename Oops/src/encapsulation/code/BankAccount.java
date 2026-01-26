package encapsulation.code;

public class BankAccount {
	
	// Attributes/fields - hidden from outside cannot directly access
	private double balance;
	private String accNum;
	
	// method which declares the behaviour
	// Controlled access through methods
	
	public double deposit(double amt) {
		if(amt > 0) {
			this.balance += amt;
		}
		return this.balance;
	}
	
	public boolean withdraw(double amt) {
		
		if(amt > 0 && balance >= amt) {
			balance -= amt;
			return true;
		}
		
		return false;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
}
