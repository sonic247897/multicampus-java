package workbook2;

public class Test01 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num <5 || num>10) {
			System.out.println("다시 입력하세요");
			return;
		}
		Calc c = new Calc();
		System.out.println("결과: "+c.calculate(num));
		
	}

}
