package chap03;
// 논리연산자 - &, 
public class OprTest03 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		// & 연산자 (and)
		System.out.println("=======&연산=========");
		// true&true
		System.out.println((num1<num2) & (num1 >= 100));
		System.out.println((num1<num2) & (num1 > 100));
		System.out.println((num1>num2) & (num1 >= 100));
		System.out.println((num1>num2) & (num1 > 100));
		
		// & 연산자 (and)
		System.out.println("=======|연산=========");
		// true&true
		System.out.println((num1<num2) | (num1 >= 100));
		System.out.println((num1<num2) | (num1 > 100));
		System.out.println((num1>num2) | (num1 >= 100));
		System.out.println((num1>num2) | (num1 > 100));
			
		System.out.println(); // Enter키를 누른 것과 같은 결과
		System.out.println(!true);
		System.out.println(!false);
	}

}
