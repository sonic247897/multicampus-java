package oop.chap07.poly;
/*
 * �������̽� ����
 * <<�������̽�>>
 * => �߻�޼ҵ�(����� ����)�� �����ϴ� Ư���� Ŭ����
 * 
 * 1. �������̽��� interface Ű���带 �̿��ؼ� ����
 * 2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * 	  - public abstract�� ��������(������ �ܺο��� ����� �������� �������)
 * 	  - ����� ������ �ڵ����� �߰��ȴ�.
 * 3. �������̽��� �������̽��� ����� �� �ִ�. (extends �̿�)
 * 	  - ���� �������̽��� ���� �������̽��� �߻�޼ҵ带 ��ӹ޴´�.
 * 4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)
 * 	  - �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡
 * 		extends�� ���� �����ϰ� implements�� �����ؾ� �Ѵ�.
 * 5. �������̽��� �������� ����� �� �ִ�. ��, ���߻���� �����ϴ�.
 * 	  implements �ڿ��� �������̽��� ������ �� ,�� �����ؼ� ���� 
 * 6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ 
 * 	   �νĵȴ�.(��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� �ȴ�.)
 * 
 */

interface InterA{
	public abstract void test();
	void display(int num);
	
}

interface InterB extends InterA{
	void show();
}

interface InterC{
	
}

class SuperA{
	
}
// SubA�� SuperA, InterA, InterB, InterC�� ����

class SubA extends SuperA implements InterB,InterC{
	// �ڵ����� public�� �پ �������̵� �ȴ�.
	@Override
	public void test() {
		
	}

	@Override
	public void display(int num) {
		
	}

	@Override
	public void show() {
		
	}
	
}

public class InterfaceTest01 {
	public static void main(String[] args) {
		// 4���� ������ ���� �� �ִ�.
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();
	}

}
