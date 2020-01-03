package workbook2;

public class Calculator {
	public Calculator() {
		
	}
	
	public double plus(int a, int b) {
		return a+b;
	}
	
	public double minus(int a, int b) {
		return a-b;
	}
	
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		double result=0.0;
		try {
			result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception이 발생했습니다. 다시 입력해 주세요");
		}
		return result;
	}
	
	
}
