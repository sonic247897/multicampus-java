package oop.chap07;

public class Person {
	// 상속을 위해 default로 선언
	private String name;
	private int age;
	
	Person(){
		
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.print("성명: " +getName()+
				" 나이: "+getAge());
	}
}

