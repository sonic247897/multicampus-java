package chap04;

import java.util.Scanner;

public class ForExam02 {
	public static void main(String[] args) {
		System.out.print("����� ��: ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i=1; i<=9; ++i) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			
		}
	}

}
