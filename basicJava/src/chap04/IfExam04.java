package chap04;

import java.util.Scanner;

public class IfExam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별: ");
		int gender = sc.nextInt();
		System.out.print("나이: ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.print("성인");
			if(gender == 1 | gender == 3) {
				System.out.println("남자");
			}
			else
				System.out.println("여자");
		}
		else {
			System.out.print("청소년");
			if(gender == 1 | gender == 3) {
				System.out.println("남자");
			}
			else
				System.out.println("여자");
		}
		
	}

}
