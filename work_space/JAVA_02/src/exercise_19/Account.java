package exercise_19;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < 0 || balance>1000000) {
			
		}
		else this.balance = balance;
		
	}
	
}
