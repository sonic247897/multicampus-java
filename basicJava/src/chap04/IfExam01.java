package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) {
			System.out.println(num+"은 음수입니다.");
		}
		else {
			if(num%2 ==0) {
				System.out.println(num+"은 짝수입니다.");
			}
			else {
				System.out.println(num+"은 홀수입니다.");
			}
		}
	}
}
