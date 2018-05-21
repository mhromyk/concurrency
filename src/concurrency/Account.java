package concurrency;

public class Account {

	private int balance;
	
	public Account(int initialBalance) {
		balance = initialBalance;
	}
	
	public void withdraw(int amount) {
		balance -=amount;
	}
	
	public void deposit(int amount) {
		balance +=amount;
	}

	public int getBalance() {
		return balance;
	}
	
}
