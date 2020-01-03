package oop.chap07;
/*
 * 	<<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
 *  1. Ŭ������ ��� ������ �޼ҵ��� ù ��° ���忡�� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� 
 *    ��ɹ��� �����Ǿ� �ִ�.
 *    => �θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ� 
 *    => �θ��� �����ڸ� ȣ���ϴ� ����� super(...)
 *    	super()�� �θ��� �Ű����� ���� �⺻������
 *    
 *    =>�̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡�� super()�� �� �� ����.
 *    	this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����. *�� �� �ϳ��� ȣ�� ����!
 *  2. ��� Ŭ������ �ֻ���Ŭ������ java.lang.ObjectŬ����
 * 	  => �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������
 * 		��ӹް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�.
 *  3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡��
 *    ���� Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
 *    => super(��1, ��2, ...)�� ���� �����Ѵ�.
 *    	--------------
 *    		�θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ��� 
 */
class SuperA extends java.lang.Object{
	private String name;
	private int age;
	SuperA(){
		super();
	}
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}

class SubA extends SuperA{
	String addr;
	int point;
	SubA(){
		super(); // ��� ������ �޼ҵ��� ù��° ���忡�� super() ȣ��
	}
	SubA(String addr){
		super();
		this.addr =addr;
	}
	SubA(String addr, int point){
		//super();
		this(addr); //���� ��ü�� ����Ǿ� �ִ� �̹� ���ǵǾ� �ִ� �Ǵٸ� ������ ȣ��
		this.point = point;
	}
	SubA(String name, int age, String addr, int point){
		super(name, age); //�θ��� private �Ű����� 2�� �����ڸ� ȣ��
						// super(String, int)
		this.addr =addr;
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public int getPoint() {
		return point;
	}
	
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		
		SubA obj = new SubA("�嵿��", 45, "�����", 1000);
		System.out.println(obj.getName()+","+obj.addr+","+obj.getAge()			
							+","+obj.point);
	}

}


//����Ŭ������ ������ ����Ŭ������ �� ������ �����ϱ� ������  ���� ���� �������̵� ���ϴ°�
	// ���� super�� ���� Ŭ���� ���� �ʱ�ȭ ���൵ �ȴ�.??
