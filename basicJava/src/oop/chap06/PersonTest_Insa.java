package oop.chap06;

import java.util.Scanner;

class PersonTest_Insa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********�λ�����ý���********");
		System.out.println("1. �λ���");
		System.out.println("2. ��������");
		System.out.println("3. ����������ȸ");
		System.out.println("4. ��������ȸ");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = sc.nextInt();
		switch(work) {
			case 1:
				System.out.println("====�λ���====");
				System.out.print("����:");
				String name = sc.next();
				System.out.print("�ּ�:");
				String addr = sc.next();
				System.out.print("����:");
				int age = sc.nextInt();
				Person p = new Person(name,addr,age);
				System.out.println(p.getName()+","+p.getAddr()+","
							+p.getAge());
				break;
			case 2:
				System.out.println("====���������ϱ�====");
		}
	}

}