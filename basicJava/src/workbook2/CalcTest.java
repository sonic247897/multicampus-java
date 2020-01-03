package workbook2;

class CalcTest {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("�ٽ� �Է� �ϼ���");
			return;
		}
		Calculator c = new Calculator();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		switch(args[1]) {
			case "+":
				System.out.println("���: "+c.plus(num1, num2));
				break;
			case "-":
				System.out.println("���: "+c.minus(num1, num2));
				break;
			case "x":
				System.out.println("���: "+c.multiplication(num1, num2));
				break;
			case "/":
				System.out.println("���: "+c.divide(num1, num2));
				break;
		}
	}
}
