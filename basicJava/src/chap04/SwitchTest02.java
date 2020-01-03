package chap04;

import java.util.Scanner;

// switch연습 - 기본문법
// switch 문의 특성을 활용
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		int ssn = key.nextInt(); // 7번째 숫자 입력 1,2,3,4
		switch(ssn) { 
			case 1: 
			case 3:
				System.out.println("남자");
				break; 
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default: 
				System.out.println("기타");
					
		}
		
	}

}
