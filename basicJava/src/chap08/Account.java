package chap08;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account(){
		
	}
	
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	public void deposit(double money) throws Exception {
		if(money<0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
		}
		balance = balance+money;
	}
	public void withdraw(double money) throws Exception {
		if(balance<0) {
			throw new Exception();
		}
		if(money>balance) {
			throw new Exception();
		}
		balance = balance-money;
	}
}


