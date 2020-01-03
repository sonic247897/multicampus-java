package oop.chap06;
// 클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형은 0, 실수형 0.0, boolean은 false
// - 멤버 변수를 정의할때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//   public
//	 default
//   protected
//   private
// 클래스를 정의할때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
// public 메소드를 통해서 접근할 수 있도록 구현한다.
public class Person {
	private String name; // 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드
	private String addr;
	private int age;
	
	public Person() {
	
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	// 모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와
	// 값을 가져올 수 있는 메소드가 필요하다.
	// 이런 역할을 하는 메소드를 정의하는 경우 
	
	// name변수에 값을 설정하는 메소드 
	// <약속> 메소드명: set + 멤버변수명(첫글자를 대문자로 바꾼) => setName
	// 같은 종류 data는 변수이름 통일
	public void setName(String name) { //setter 메소드
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	// 메소드명: get + 멤버변수명(첫 글자를 대문자 바꾼) => getName
	public String getName() { // getter 메소드
		return this.name;
		// 혹은 return name; (가장 가까운 변수 찾음 -> 클래스에 선언된 멤버변수)
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
}

