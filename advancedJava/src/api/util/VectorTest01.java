package api.util;

import java.util.Vector;

//Vector�� ����� ����ϴ� ���
public class VectorTest01 {
	public static void main(String[] args) {
		// int�� ���������� ǥ���� ���� ���� Integer
		// generic: �÷��� �����ӿ��� ������ ������ ǥ���س��� ��
		//			����ϴ� ������ �ۼ��ϸ� �ȴ�.
		Vector<Integer> v = new Vector<Integer>();
		//v.add("java");
		v.add(10);
		System.out.println("Vector�� �뷮:"+v.capacity()); //�� ������
		// �� �ִ� �������� ����
		System.out.println("Vector�� ����� ����� ����:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=10; ++i) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮:"+v.capacity()); //�� ������
		// �� �ִ� �������� ����
		System.out.println("Vector�� ����� ����� ����:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=10; ++i) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮:"+v.capacity()); //�� ������
		// �� �ִ� �������� ����
		System.out.println("Vector�� ����� ����� ����:"+v.size());
		
		
		System.out.println("====================================");
		for(int i=1; i<=20; ++i) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮:"+v.capacity()); //�� ������
		// �� �ִ� �������� ����
		System.out.println("Vector�� ����� ����� ����:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=40; ++i) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮:"+v.capacity()); //�� ������
		// �� �ִ� �������� ����
		System.out.println("Vector�� ����� ����� ����:"+v.size());
		// �뷮�� 2�辿 �þ��!
	}

}