package oop.chap06;
// Person Ŭ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p1 =new Person("�嵿��","�����",45);
		/*p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45); //age������ private���� ����Ǿ� �����Ƿ� 
					//���� ��Ű���� Ŭ���������� ������ �� ����.
*/		System.out.println("����:"+p1.getName());
		System.out.println("�ּ�:"+p1.getAddr());
		System.out.println("����:"+p1.getAge());
		
		Person p2 =new Person("������","���ν�",26);
		/*p2.setName("������");
		p2.setAddr("���ν�");
		p2.setAge(26);*/
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());
		
	}
}