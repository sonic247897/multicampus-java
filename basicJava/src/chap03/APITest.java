package chap03; // chap03 ������ �����ϰ� �� �ȿ� APITest.class�� �����Ѵ�.

import java.io.File;
import java.util.Random;
// ctrl+shift+o�� ���� �ڵ�  import
//import java.io.*; // java.lang ��Ű���� �⺻ �ν��ϹǷ� �ٸ� ��Ű���� 
//import java.util.*;
	// �����ϴ� Ŭ������ ����ϴ� ��� � ��Ű���� �ִ��� �νĽ�Ű�� �۾��� �ؾ��Ѵ�.

// API ����ϱ� - ������ ���� ����
public class APITest {
	public static void main(String[] args) {
		// 1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿� 
		//   �ø��� �۾� - JVM�� �ν��ϴ� �۾� ������ �Ҵ�
		// ����� Ŭ������ ���� = new ����� Ŭ������()
		// -------------
		// Ÿ������ ���ȴ�.
		String str = new String();
		StringBuffer sb = new StringBuffer();
		File file = new File("test.txt");
		Random rand = new Random();
		//ArrayList list  = new ArrayList();
		
		//2. ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷����� ��)�� �޼ҵ� ����ϱ�
		// ->�ν��Ͻ���� ��
		//  charAt�� ���� ����� charŸ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����
		String str2 = new String("java programming");
		char returnVal = str2.charAt(0);
		System.out.println("������=>"+returnVal);
				
		String str3 = new String("i love you");
		
		System.out.println("���ڿ��� ���� => " + str3.length());
				
	}

}
