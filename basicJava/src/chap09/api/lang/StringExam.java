package chap09.api.lang;

public class StringExam {
	public static void main(String[] args) {
		//str1�� AVAJ�� ��µǵ��� �����ϼ���
		//��, StringBuffer�� reverse() ������� �ʱ�
		//	 String�� toCharArray()�� ������� �ʱ�
		//	 String Ŭ������ charAt()�� toUpperCase() �̿��ϱ�
		String str1 = "java";
		String str2 = str1.toUpperCase();
		for(int i=str2.length()-1; i>=0; --i) {
			System.out.print(str2.charAt(i));
		}
		
	}

}
