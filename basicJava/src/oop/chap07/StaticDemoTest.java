package oop.chap07;
// staticDemo�� �׽�Ʈ�ϴ� Ŭ����
// static���� ������ ������ �ν��Ͻ��� ������ ���� �����ϴ� �ν��Ͻ� ������ �ƴϹǷ�
// �ν��Ͻ� ������ ������ �� ����.
// ���� Ŭ���������� �����ؾ� �Ѵ�.
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		// �������� ���
		obj1.display();
		// ������ �ܺ� Ŭ�������� �����ؼ� ���
		System.out.println(obj1.num +", " +StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo("obj2");
		obj2.display();
		System.out.println(obj2.num +", " +StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo("obj3");
		obj1.display();
		System.out.println(obj3.num +", " +StaticDemo.staticNum);
		
		
		
	}

}
