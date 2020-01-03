package oop.chap07.poly;
// ��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent{
	String name = "�嵿��";
	public void display() {
		System.out.println("�θ��� display");
	}
}

class Child extends Parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ� Ŭ������ display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("**********************************");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * ��ü�� ����ȯ
		 * - ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("**********************************");
		System.out.println("3. SuperŸ���� ���������� sub��ü�� ����");
		// parent ��ü�� �����ǹǷ� ����ȯ ����
		Parent obj3 = new Child(); // �ڵ� ����ȯ
		obj3.display(); //�޼ҵ�: �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);// ����: �������� Ÿ�Կ� �ش��ϴ�
									// Ŭ������ ��������� ����
		((Child)obj3).test(); //Ÿ���� Parent Ÿ�������� ������ ������ ��ü�� ChildŸ���̱�
					//������ ChildŸ������ ����ȯ�� �����ϴ�.(��������� �ؾ���)
		/** ->��ӵ� ���� ��ü���� ����� ����ȯ �ؾ� �ϹǷ� ������ X
		**/
		
		System.out.println("**********************************");
		System.out.println("4. subŸ���� ���������� super��ü�� ���� ---- X");
		//Child obj4 = new Parent(); //���ʿ� �ִ°� ����(Reference)!!
		
		System.out.println("**********************************");
		System.out.println("5. subŸ���� �������� = " +
						"superŸ���� ��������(Super��ü�� ����)----X");
		// ��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ���� ��������� 
		// ĳ������ �Ϸ��� �Ҷ� obj1�� Child ������ �������� �ʱ� ������ ĳ���� ���� �߻�
		//Child obj5 = (Child)obj1;
		
		System.out.println("**********************************");
		System.out.println("6. subŸ���� �������� = " +
						"superŸ���� ��������(sub��ü�� ����)----O");
		// obj3�� child ������ �����Ƿ� ĳ���� ����. <- 5���� ��
		Child obj6 = (Child)obj3; 
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		Parent obj7 = obj2; //��ĳ����: ���� Ŭ���� Ÿ���� ���������� ���� Ŭ����
							// ���������� ����
		Parent obj8 = null; // ������ car����
		Child obj9 = new Child(); // fe����
		Child obj10 = null; // fe2 ����
		
		obj8 = obj9; //super type = sub type
		// �ᱹ obj8�� Child(obj9)�� �����ϹǷ� Child ������ �ִ�.
		// but. obj8�� ������ Parent type�̴�. 
		// ����� ĳ����) Ÿ���� ���߸� �ȴ�.
		obj10 = (Child)obj8; //������ �����Ϸ��� ������ child��ü ����
		// but.73�� ���΋����� �� 
		obj10.test();
		
	}

}
