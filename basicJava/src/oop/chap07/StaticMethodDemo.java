package oop.chap07;
// static 메소드
// - static 멤버를 제어하기 위한 용도
// - 유틸리티처럼 자주 사용하는 메소드
public class StaticMethodDemo {
	public static void staticTest1() {
		// 1. static메소드에서 static메소드 접근하기 - 일반적인 방법 가능
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		// 2. non-static 메소드에서 non-static 메소드를 호출 - 일반적인 방법 가능
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		System.out.println("staticTest2()");
	}
	public void show() {
		// 3. non-static에서 static메소드 호출 - 일반적인 방법 가능
		// new에서 사용하기 전에 static은 이미 (시작 시점에) 메모리에 올라와 있으므로
		// 메모리에 꺼내와 사용할 수 있다.
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest3() {
		// 4. static메소드에서 non-static메소드 호출
		// 객체 생성하기 전에 non-static은 아직 올라오지 않으므로
		// 사용할 수 없다.
		// -> non-static 메소드가 메모리에 없기 때문에 같은 클래스에서 정의된
		// 메소드라고 하더라도 무조건 객체생성 후에 호출해야 한다.
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show();
		System.out.println("staticTest3()");
	}
	
}
