package workbook2;

public class Test03 {
	public static void main(String[] args) {
		if(args.length != 6) {
			System.out.println("�ٽ� �Է� �ϼ���");
			return;
		}
		
		int[] num = new int[5];
		for(int i=0; i<num.length; ++i) {
			num[i] = Integer.parseInt(args[i+1]);
			if(num[i]<10 || num[i]>100) {
				System.out.println("�ٽ� �Է� �ϼ���");
				return;
			}
		}
		Department depart = new Department(args[0], 
				num[0], num[1], num[2], num[3], num[4]);
		System.out.println("��������� ������: "+depart.evaluationNumber());
		
	}

}
