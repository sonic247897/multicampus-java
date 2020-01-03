package chap04;

import java.util.Random;
// Random 클래스와 if문 연습
public class ifTest01 {
	public static void main(String[] args) {
		//Random의 nextInt를 이용해서 1부터 100까지의 값을 발생시킨 후 작업
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		System.out.println(num);
		if(num >= 90) {
			System.out.println("만족");
			System.out.println("두 번째 문장입니다.");
		}
		System.out.println("종료");
		
		
		
		
	}

}
