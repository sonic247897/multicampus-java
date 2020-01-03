package workbook;

import java.util.Random;

public class ArrayExam03 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; ++i) {
			numArr[i] = i;
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		// 5È¸ ¼ÅÇÃ
		Random rd = new Random();
		for(int i=0; i<5; ++i) {
			int shuffle = rd.nextInt(10);
			int tmp = numArr[i];
			numArr[i] = numArr[shuffle];
			numArr[shuffle] = tmp;
		}
		
		for(int i=0; i<numArr.length; ++i) {
			System.out.print(numArr[i] + " ");
		}
	}

}
