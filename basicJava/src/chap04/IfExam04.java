package chap04;

import java.util.Scanner;

public class IfExam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int gender = sc.nextInt();
		System.out.print("����: ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.print("����");
			if(gender == 1 | gender == 3) {
				System.out.println("����");
			}
			else
				System.out.println("����");
		}
		else {
			System.out.print("û�ҳ�");
			if(gender == 1 | gender == 3) {
				System.out.println("����");
			}
			else
				System.out.println("����");
		}
		
	}

}
