package oop.chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		CheckingAccount acc1 = 
				// account Id, ownerName, balance, cardID
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
		// cardNo�� Ʋ���Ƿ� ���� �Ұ�
		System.out.print("ī���ȣ�Է�: ");
		String cardNo = key.next();
		
		acc1.pay(500000,"1234-5678-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		// �����Ƿ� ���� ����
		acc1.pay(500000, cardNo);
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		
	}

}
