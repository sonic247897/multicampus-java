package workbook;

public class Test02 {
	public static void main(String[] args) {
		// Company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ�
		// �ڵ� casting�� �ȴ�.
		Company c = new Company(Integer.parseInt(args[0]));
		System.out.print("�� �⺻�� ��: " + c.getIncome() + " "
				+ "����: " +c.getAfterTaxIncome());
		System.out.println();
		System.out.println("�� ���ʽ� ��: " +c.getBonus() + " "
				+ "����: "+c.getAfterTaxBonus());
		System.out.println();
		double ans = c.getAfterTaxBonus()+c.getAfterTaxIncome();
		System.out.println("�� ���޾� ��: " +ans);
	}
}
