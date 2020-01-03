package chap09.api.lang;

import java.util.Date;
import java.util.Random;

// Object 클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스

public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //클래스의 정보를 리턴
		System.out.println(obj1.hashCode()); //객체의 정보가 리턴(해시코드)
		System.out.println(obj1.toString()); //객체의 주소를 리턴 - 기본메소드
		System.out.println(obj1); // obj1.toString()호출과 동일
								// 기본 메소드이므로 생략 가능
		
		Person p1 = new Person("장동건", 50, "서울"); 
		//아무것도 상속 안하면 컴파일러가 extends Object 붙여줌
		/*System.out.println(p1.getName()+","+p1.getAddr()+","
				+p1.getAge());*/
		System.out.println(p1.toString());
		//개발자가 작성하는 모든 클래스에서 오버라이딩 해야 한다.
		System.out.println(p1);
		
		//API의 클래스들...
		Random rand = new Random();
		System.out.println(rand);
		// random은 Object와 같은 해시코드가 출력
		Date d = new Date(); // util은 DB랑 연동 안할 때 사용
		System.out.println(d);
		// 날짜시간 정보가 출력(toString 오버라이딩 됨)
		String str = new String("java");
		System.out.println(str);
		// 문자열 출력(toString 오버라이딩 됨)
	}

}
