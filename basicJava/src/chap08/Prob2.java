package chap08;

public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("È«±æµ¿", 100);
			System.out.println("ÇöÀç ÀÜ¾× : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("ÇöÀç ÀÜ¾× : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("ÇöÀç ÀÜ¾× : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

