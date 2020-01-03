package oop.chap07.poly;
import java.util.Scanner;

public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender시스템********");
		System.out.println("1. Email로 전송");
		System.out.println("2. SMS로 전송");
		System.out.println("3. MMS로 전송");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		// Sender 선언 안하면 변수 2개 ~ 선언해줘야 함.
		Sender sender = null;
		switch(work){
			case 1:
				sender = new EmailSender("메일로전송",100);
				break;
			case 2:
				sender = new SMSSender("단문자",80);
				break;
			case 3:
				sender = new SMSSender("MMS", 1180);
				
		}
		// Sender 클래스 기능 이용
		SenderLogic s = new SenderLogic();
		s.run(sender);

	}

}
