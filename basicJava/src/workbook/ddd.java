package workbook;

import java.util.Random;

public class ddd {

	public static void main(String[] args) {

		int[] arr3 = new int[5];
		Random rd = new Random();
		boolean[] check = new boolean[11];
		for (int i = 0; i < arr3.length; ++i) {
			// 중복 제거
			arr3[i] = rd.nextInt(10) + 1;
			for (int j = 0; j < i; ++j) {
				if (arr3[i] == arr3[j]) {
					arr3[i] = rd.nextInt(10) + 1;
					j = -1;
				}
			}

		}
		int sum = 0;
		for (int i = 0; i < arr3.length; ++i) {
			System.out.print(arr3[i] + " ");
			sum += arr3[i];
		}
		System.out.println();
		double avg = (double) sum / arr3.length;
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
	}

}
