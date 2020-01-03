package oop.chap07;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, String ownerName) {
		super();
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account;
	}
	public int getBalance() {
		return this.balance;
	}
	public double calculateInterest() {
		return this.balance*this.interestRate/100;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	// Ãß°¡
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
