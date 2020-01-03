package workbook;

public class AccountTest {
	public static void main(String[] args) {
		Account arr[] = new Account[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Account("221-0101-211"+(i+1),
							100000, 4.5);
			arr[i].accountInfo();
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arr[i].setInterestRate(3.7);
			arr[i].accountInfo();
			System.out.println("\tÀÌÀÚ: " 
			+ arr[i].getBalance()*arr[i].getInterestRate()/100 + "¿ø");
		}
	}

}
