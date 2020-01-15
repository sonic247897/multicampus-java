package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//InputStream�� �̿��ؼ� Ű����� �Է¹޴� ���ڿ��� �б�
// - ScannerŬ������ next�޼ҵ��� ����� ���� ����
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; //in����� Ÿ�԰� ���� Ÿ������ ����
		PrintStream out = System.out;
		
		while(true) {
			// 1. ��Ʈ���� �����͸� 1byte �б�
			try {
				int data = in.read();
				// if(data==-1)
				if(data == 13) {
					break;
				}
				// 13�� - carriage return (����)
				// 10�� - Line feed (Ŀ�� ������ ����)
				//out.println(data);
				out.print((char)data); 
				//�ѱ�(2byte) ������- �� byte�� �о �����Ϸ��� �ϸ� ����
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}