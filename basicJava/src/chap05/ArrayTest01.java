package chap05;
// �迭�� ���� ���� - ����ϴ� ���
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. �迭�� ����
		int[] myarr;
		int[] myarr2;
		//2. �迭�� ����
		myarr = new int[5];
		myarr2 = new int[5];
		
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println("myarr�� 2�� ����� ��=>" + myarr[2]);
		
		// 3. �迭�� �ʱ�ȭ - 2�� ��ҿ� 100�� ����
		myarr[2] = 100;
		System.out.println("myarr�� 2�� ����� ��=>" + myarr[2]);
		
		// �迭�� ����� ������ �Ѳ����� ó��
		int[] numarr = new int[3];
		boolean[] boolarr = new boolean[5];
		long[] longarr = new long[100];
		double[] doublearr = new double[100];
		
		// �迭�� �⺻ �ʱⰪ
		// �⺻���� ���
		// ������ - 0
		// boolean - false, �Ǽ��� - 0.0
		System.out.println(numarr[0]);
		System.out.println(boolarr[0]);
		System.out.println(longarr[0]);
		System.out.println(doublearr[0]);
	}

}