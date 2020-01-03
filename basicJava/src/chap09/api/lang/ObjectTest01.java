package chap09.api.lang;

import java.util.Date;
import java.util.Random;

// Object Ŭ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����

public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //Ŭ������ ������ ����
		System.out.println(obj1.hashCode()); //��ü�� ������ ����(�ؽ��ڵ�)
		System.out.println(obj1.toString()); //��ü�� �ּҸ� ���� - �⺻�޼ҵ�
		System.out.println(obj1); // obj1.toString()ȣ��� ����
								// �⺻ �޼ҵ��̹Ƿ� ���� ����
		
		Person p1 = new Person("�嵿��", 50, "����"); 
		//�ƹ��͵� ��� ���ϸ� �����Ϸ��� extends Object �ٿ���
		/*System.out.println(p1.getName()+","+p1.getAddr()+","
				+p1.getAge());*/
		System.out.println(p1.toString());
		//�����ڰ� �ۼ��ϴ� ��� Ŭ�������� �������̵� �ؾ� �Ѵ�.
		System.out.println(p1);
		
		//API�� Ŭ������...
		Random rand = new Random();
		System.out.println(rand);
		// random�� Object�� ���� �ؽ��ڵ尡 ���
		Date d = new Date(); // util�� DB�� ���� ���� �� ���
		System.out.println(d);
		// ��¥�ð� ������ ���(toString �������̵� ��)
		String str = new String("java");
		System.out.println(str);
		// ���ڿ� ���(toString �������̵� ��)
	}

}
