package workbook2;

class CalcTest {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("다시 입력 하세요");
			return;
		}
		Calculator c = new Calculator();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		switch(args[1]) {
			case "+":
				System.out.println("결과: "+c.plus(num1, num2));
				break;
			case "-":
				System.out.println("결과: "+c.minus(num1, num2));
				break;
			case "x":
				System.out.println("결과: "+c.multiplication(num1, num2));
				break;
			case "/":
				System.out.println("결과: "+c.divide(num1, num2));
				break;
		}
	}
}
