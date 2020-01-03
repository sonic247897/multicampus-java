package oop.chap07.poly;
public class SenderLogic {
	/* 요구사항이 바뀜에 따라 계속 함수 여러개 만들어야 함
	public void run(EmailSender obj) {
		
	}
	public void run(SMSSender obj) {
		
	}
	*/
	public void run(Sender obj) {
		// Sender 클래스의 클래스들을 활용하는 메소드
		System.out.println("실행완료");
		obj.print();
	}
	
	
}
