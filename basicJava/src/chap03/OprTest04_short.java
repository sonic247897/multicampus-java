package chap03;
// �񱳿����� - ||, && (���� ������) - ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ� skip
public class OprTest04_short {
	public static void main(String[] args) {
		int num = 100;
		String str = null; // ���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
