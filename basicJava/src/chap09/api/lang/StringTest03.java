package chap09.api.lang;
// String Ŭ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
// => ���ڿ�ó�� �޼ҵ带 ���� ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ���
// 	  String�� ������� �ʰ� StringBuffer or StringBuilder�� �̿��Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		//������ȯ
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("����������: "+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		// begin index���� ���
		System.out.println("str1.substring(2)=>"+str1.substring(2));
		// end index�� �������� ����
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));
		// old char, new char
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println("����������:"+str1);
		//���� �����ʹ� ������ �ʴ´�.
		
	}

}
