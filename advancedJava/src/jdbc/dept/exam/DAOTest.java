package jdbc.dept.exam;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�λ�����ý���******");
		System.out.println("1. �μ����");
		System.out.println("2. �μ�������ȸ");
		System.out.println("3. �μ���������");
		System.out.println("4. �μ�����");
		System.out.println("5. ��� �μ���� Ȯ���ϱ�");
		System.out.println("6. �μ��� ��� ��� Ȯ��");
		System.out.println("���ϴ� �۾��� �����ϼ���:");
		int choice = key.nextInt();
		show(choice);
		}

	public static void show(int choice) {
		switch(choice) {
			case 1: 
				MenuUI.insertMenu();
				break;
			case 2:
				MenuUI.getDeptInfoMenu();
				break;
			case 3:
				MenuUI.updateMenu();
				break;
			case 4:
				MenuUI.deleteMenu();
				break;
			case 5:
				MenuUI.getDeptInfoMenu();
				break;
			case 6:
				MenuUI.getMemberListMenu();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	
}
