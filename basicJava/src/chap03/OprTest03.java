package chap03;
// ���������� - &, 
public class OprTest03 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		// & ������ (and)
		System.out.println("=======&����=========");
		// true&true
		System.out.println((num1<num2) & (num1 >= 100));
		System.out.println((num1<num2) & (num1 > 100));
		System.out.println((num1>num2) & (num1 >= 100));
		System.out.println((num1>num2) & (num1 > 100));
		
		// & ������ (and)
		System.out.println("=======|����=========");
		// true&true
		System.out.println((num1<num2) | (num1 >= 100));
		System.out.println((num1<num2) | (num1 > 100));
		System.out.println((num1>num2) | (num1 >= 100));
		System.out.println((num1>num2) | (num1 > 100));
			
		System.out.println(); // EnterŰ�� ���� �Ͱ� ���� ���
		System.out.println(!true);
		System.out.println(!false);
	}

}