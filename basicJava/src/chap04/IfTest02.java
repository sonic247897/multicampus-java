package chap04;

import java.util.Scanner;
// if else���� Scanner Ŭ���� ����
public class IfTest02 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		// 90 �̸��̸� "�����"�� ����ϼ���.
		System.out.print("������ �Է��ϼ���=> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("���");
		}
		else {
			System.out.println("�����");
		}
	}

}
