package chap04;

import java.util.Scanner;
// ��ø if�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		// 90 �̸��̸� "�����"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("��������:");
		int score = sc.nextInt();
		
		System.out.print("����Ƚ��:");
		int count = sc.nextInt();
		if(score >= 90) {
			System.out.println("���");
		}
		else {
			if(count>=3)
				System.out.println("ó������ �ٽ� ����");
			else
				System.out.println("�� ���� �����");
		}
	}

}
