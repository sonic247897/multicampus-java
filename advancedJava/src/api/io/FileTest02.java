package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

// ������ ���θ� Ž��
public class FileTest02 {
	public static void main(String[] args) {
		// c:\iot\iotest ������ ���� ���� �� ������ ���
		//[�������]
		// a -----------[����]
		// b -----------[����]
		// ArrayTest01.java ----------- [����: (������ ������ ���)]
		// . 
		// .
		// ������ ������ ��¥�� �� �� ���� �������� ��� (����: ��ȣ�� �����ؼ� ���� ���ڿ�)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		File file1 = new File("c:/iot/iotest");
		File[] fileArr = file1.listFiles();
		for (File file : fileArr) {
			if(file.isDirectory()) {
				System.out.println(file.getName()+ "\t" +"--------------[����]");
			}else {
				System.out.println(file.getName() +"\t" + "--------------[����: (" + file.length() + ")]:"
														+sdf.format(file.lastModified()));
			}
		}
		
	}

}