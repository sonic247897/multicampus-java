package chap08;

public class BankCustomer{
	String name;
	int currentMoney;
	
	public BankCustomer() {
		
	}

	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	
	public int getCurrentMoney() {
		return currentMoney;
	}
	
	public void withdraw(int money) throws IllegalArgumentException{
		if(money>currentMoney) {
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
		}
		currentMoney -= money;
	}
}
