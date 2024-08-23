package entities;

public class Bank {

	private int accountNumber;
	private String name;
	private double deposit;
	
	public Bank(int accoutNumber, String name) {
		this.accountNumber = accoutNumber;
		this.name = name;
	}
	
	public Bank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public void deposit(double amount) {
		deposit = getDeposit() + amount; 
	}
	
	public void withdraw(double amount) {
		deposit = getDeposit() - amount - 5;
	}
	
	public String toString() {
		return "Account " + getAccountNumber() + ", Holder: " + getName() + ", Balance: $ " + getDeposit() ;
	}
	
}
