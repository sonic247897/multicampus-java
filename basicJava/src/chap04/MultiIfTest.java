package chap04;

import java.util.Scanner;

// if ~ else if 문 테스트
public class MultiIfTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = key.nextInt(); 
		if(score>100 | score <0) {
			System.out.println("잘못 입력");
		}
		else{
			/*if(score>=90) {
				System.out.println("A");
			}
			else if(score>=80) {
				System.out.println("B");
			}
			else if(score>=70) {
				System.out.println("C");
			}
			else if(score>=60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");*/
			
			switch(score/10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
			
			}
		}
	}

}
