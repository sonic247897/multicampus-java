package workbook;

public class Calc {
	public int calculate(int data) {
		int sum=0;
		System.out.print("¦��: ");
		for(int i=2; i<=data; i+=2) {
			System.out.print(i+" ");
			sum +=i;
		}
		return sum;
	}

}
