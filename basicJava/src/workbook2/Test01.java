package workbook2;

public class Test01 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num <5 || num>10) {
			System.out.println("�ٽ� �Է��ϼ���");
			return;
		}
		Calc c = new Calc();
		System.out.println("���: "+c.calculate(num));
		
	}

}
