package oop.chap07.poly;
// 객체의 형변환 - 상속관계에 있는 경우에만 가능하다.
class Parent{
	String name = "장동건";
	public void display() {
		System.out.println("부모의 display");
	}
}

class Child extends Parent{
	String name = "이민호";
	public void display() {
		System.out.println("자식 클래스의 display");
	}
	public void test() {
		System.out.println("하위클래스에만 정의된 메소드");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 Super객체를 참조");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("**********************************");
		System.out.println("2. sub타입의 참조변수로 sub객체를 참조");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * 객체의 형변환
		 * - 변수는 참조변수타입에 따라서 결정, 메소드는 생성되는 객체가 기준
		 */
		System.out.println("**********************************");
		System.out.println("3. Super타입의 참조변수로 sub객체를 참조");
		// parent 객체도 생성되므로 형변환 가능
		Parent obj3 = new Child(); // 자동 형변환
		obj3.display(); //메소드: 오버라이딩된 메소드라면 오버라이딩된 메소드가 호출
		System.out.println(obj3.name);// 변수: 참조변수 타입에 해당하는
									// 클래스의 멤버변수가 실행
		((Child)obj3).test(); //타입이 Parent 타입이지만 실제로 생성된 객체가 Child타입이기
					//때문에 Child타입으로 형변환이 가능하다.(명시적으로 해야함)
		/** ->상속된 여러 개체마다 명시적 형변환 해야 하므로 다형성 X
		**/
		
		System.out.println("**********************************");
		System.out.println("4. sub타입의 참조변수로 super객체를 참조 ---- X");
		//Child obj4 = new Parent(); //왼쪽에 있는게 기준(Reference)!!
		
		System.out.println("**********************************");
		System.out.println("5. sub타입의 참조변수 = " +
						"super타입의 참조변수(Super객체를 참조)----X");
		// 명시적으로 형변환을 해서 컴파일러는 속였으나 실제 실행시점에 
		// 캐스팅을 하려고 할때 obj1이 Child 정보를 갖고있지 않기 때문에 캐스팅 예외 발생
		//Child obj5 = (Child)obj1;
		
		System.out.println("**********************************");
		System.out.println("6. sub타입의 참조변수 = " +
						"super타입의 참조변수(sub객체를 참조)----O");
		// obj3은 child 정보를 가지므로 캐스팅 가능. <- 5번과 비교
		Child obj6 = (Child)obj3; 
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		Parent obj7 = obj2; //업캐스팅: 하위 클래스 타입의 참조변수가 상위 클래스
							// 참조변수에 저장
		Parent obj8 = null; // 교재의 car변수
		Child obj9 = new Child(); // fe변수
		Child obj10 = null; // fe2 변수
		
		obj8 = obj9; //super type = sub type
		// 결국 obj8은 Child(obj9)를 참조하므로 Child 정보가 있다.
		// but. obj8은 여전히 Parent type이다. 
		// 명시적 캐스팅) 타입을 맞추면 된다.
		obj10 = (Child)obj8; //원래는 컴파일러가 속지만 child객체 없음
		// but.73번 라인떄문에 됨 
		obj10.test();
		
	}

}
