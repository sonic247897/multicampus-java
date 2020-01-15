package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	// framework�� �𸣴� ��Ȳ���� try~catch ó�� ������ �� ������ �׽�Ʈ �ϱ�� 
	// main�� ȣ���ϴ� java ���������Ϳ��� �˾Ƽ� ���ܸ� ó���Ѵ�.
	// (������ ����� ���� try~catch~finally�� ����Ѵ�.)
	public static void main(String[] args) throws IOException {
		// 1. ���� open (F5�ϸ� ����)
		// write�޼ҵ尡 ȣ��� ������ ������ ������ �߰� - append mode�� true (log����)
		FileWriter fw = new FileWriter("src/data/output.txt", true);
		//FileWriter fw = new FileWriter("src/data/output.txt"); //���� �����
		// FileNotFoundException�� �ƴ϶� IOException�� ����?
		// - File����� �Ű������� ���޵� ������ ������ �ش� ������ ���� �۾�������
		//	���� ��� ���� ������ �����Ͽ� �۾��Ѵ�.
		
		//2. ���� �׼���
		fw.write(97); // int������->acii�� �ش��ϴ� ���ڰ� ���
		fw.write("���ڿ� ����\n");
		fw.write("test");
		
		//3. ���� close
		fw.close();
		
	}
}