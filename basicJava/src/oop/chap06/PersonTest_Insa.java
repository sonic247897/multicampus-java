package oop.chap06;

import java.util.Scanner;

class PersonTest_Insa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********인사관리시스템********");
		System.out.println("1. 인사등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 사원목록조회");
		System.out.print("원하는 작업을 선택하세요:");
		int work = sc.nextInt();
		switch(work) {
			case 1:
				System.out.println("====인사등록====");
				System.out.print("성명:");
				String name = sc.next();
				System.out.print("주소:");
				String addr = sc.next();
				System.out.print("나이:");
				int age = sc.nextInt();
				Person p = new Person(name,addr,age);
				System.out.println(p.getName()+","+p.getAddr()+","
							+p.getAge());
				break;
			case 2:
				System.out.println("====정보수정하기====");
		}
	}

}