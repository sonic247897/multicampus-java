package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) {
			System.out.println(num+"�� �����Դϴ�.");
		}
		else {
			if(num%2 ==0) {
				System.out.println(num+"�� ¦���Դϴ�.");
			}
			else {
				System.out.println(num+"�� Ȧ���Դϴ�.");
			}
		}
	}
}
