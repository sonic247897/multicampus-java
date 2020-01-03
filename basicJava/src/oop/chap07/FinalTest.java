package oop.chap07;

final class FinalSuper{
	public final void display() {
		System.out.println("super display");
	}
	
}
class FinalSub extends FinalSuper{ //final 클래스는 상속이 불가능
//	static final int NUM = 100;

	@Override
	public void display() { // final 메소드는 오버라이딩 할 수 없다.
		System.out.println("display");
	}
	
}

public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000; //상수이므로 값을 수정할 수 없다.
		System.out.println(FinalSub.NUM);
		obj.display();
	}

}
