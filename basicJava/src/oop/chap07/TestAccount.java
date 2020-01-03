package oop.chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		CheckingAccount acc1 = 
				// account Id, ownerName, balance, cardID
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		// cardNo이 틀리므로 지불 불가
		System.out.print("카드번호입력: ");
		String cardNo = key.next();
		
		acc1.pay(500000,"1234-5678-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		// 같으므로 지불 가능
		acc1.pay(500000, cardNo);
		System.out.println("현재잔액====>"+acc1.getBalance());
		
	}

}
