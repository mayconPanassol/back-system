package entities;

public class Client {

	private final int account;
	private double balance;
	private String name;

	public Client(int account, double balance, String name) {
		this.name = name;
		this.balance = balance;
		this.account = account;
	}

	public int getAccount() {
		return account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addBalance(double balance) {
		this.balance += balance;
	}
	
	public void removalBalance(double balance) {
		this.balance -= balance + 5.00;
	}
	
	public String toString() {
		
		return  "Account " + account + ", "
				+ "Holder: " + name + ", "
				+ "Balance: $: " + String.format("%.2f", balance);
	}
	

}
