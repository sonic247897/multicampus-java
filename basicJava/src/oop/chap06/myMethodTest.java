package oop.chap06;
// myMethod Ŭ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class myMethodTest {
	public static void main(String[] args) {
		myMethod m = new myMethod();
		m.display();
		System.out.println("++++++step1++++++");
		m.display();
		System.out.println("++++++step2++++++");
		m.display();
		
		// 2. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		
		System.out.println();
		System.out.println();
		
		// 3. �Լ�
		m.display("Sss", 2);
		m.display("��", 5);
		m.display("���",3); // display(String, int)
		m.display("��", 3);
		
		
		System.out.println("========���α׷� ����========");
		
		// �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		// �޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ��� 
		// �� ���ϰ��� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		// �� �ٸ� �޼ҵ��� �Ű������� ������ ���� �ִ�.
		int result = m.add(100, 200);
		System.out.println("�޼ҵ� ȣ�� ���=>"+result);
		
		System.out.println("�޼ҵ� ȣ�� ���=>" +m.add(200, 300));
		
	}

}

