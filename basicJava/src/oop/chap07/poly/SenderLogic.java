package oop.chap07.poly;
public class SenderLogic {
	/* �䱸������ �ٲ� ���� ��� �Լ� ������ ������ ��
	public void run(EmailSender obj) {
		
	}
	public void run(SMSSender obj) {
		
	}
	*/
	public void run(Sender obj) {
		// Sender Ŭ������ Ŭ�������� Ȱ���ϴ� �޼ҵ�
		System.out.println("����Ϸ�");
		obj.print();
	}
	
	
}
