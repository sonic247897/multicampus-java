package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	public CheckingAccount(String account, String ownerName,
			int balance, String cardNo) {
		super(account, balance, ownerName);
		this.cardNo = cardNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	// ���ڿ��񱳴� ������ equals�� �̿��ؼ� ���Ѵ�.
	// == ���X
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo)) {
			if(amount<= getBalance()) {
				withdraw(amount);
			}
			else {
				System.out.println("������ �Ұ����մϴ�.");
			}
		}
		else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
		
	

}
