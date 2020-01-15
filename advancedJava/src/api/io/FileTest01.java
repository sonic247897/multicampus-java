package api.io;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		// �׼����ϰ� ���� �����̳� ������ ��ġ�� File��ü ���� �� �Ű������� ����
		// 1. c:\iot\iotest ����
		// \�� ���ڷ� �� ����.(escape sequene�� ���ǹǷ�)
		// \���� ����Ϸ��� \\�� �����(escape sequence��)
		//File file1 = new File("c:\\iot\\iotest");
		// 	<������> �� �� ����.
		File file1 = new File("c:/iot/iotest"); // \��� /����ϴ� ����� ����
		
		// 2. ������Ʈ ������ ������ test.txt ����
		//	=> ��θ� �������� �ʴ� ���(���ϸ��� ��) �⺻���� �ν��ϴ� ��ġ�� ������Ʈ ����
		File file2 = new File("test.txt");
		
		// 3. src/data������ ����� test.txt����
		//	<�����>
		File file3 = new File("src/data/test.txt");
		
		// ���� �νĵ��� Ȯ��
		System.out.println(file1);
		System.out.println(file2);
		System.out.println(file3);
		
		System.out.println("file3.canRead() => " + file3.canRead());
		System.out.println("file3.canWrite() => " + file3.canWrite());
		System.out.println("file3.getName() => " + file3.getName());
		System.out.println("file3.getAbsolutePath() => " + file3.getAbsolutePath());
		System.out.println("file3.getParent() => " + file3.getParent());
		System.out.println("file3.getPath() => " + file3.getPath());
		System.out.println("file3.isDirectory() => " + file3.isDirectory());
		System.out.println("file1.isDirectory() => " + file1.isDirectory());
		System.out.println("file3.isFile() => " + file3.isFile());
		System.out.println("file1.isFile() => " + file1.isFile());
		System.out.println("file3.isHidden() => " + file3.isHidden());
		// 1970.01.01���� ���� ��¥������ �ϼ�
		System.out.println("file3.lastModified() => " + file3.lastModified());
		System.out.println("file3.length() => " + file3.length());
		file3.setReadOnly(); //�б�����
		
	}

}