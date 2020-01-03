package workbook;

import java.util.Random;

public class arrg {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("다시 입력 하세요");
			return;
		}
		Random rd  = new Random();
		double sum=0.0; double avg=0.0;
		int[] num = {Integer.parseInt(args[0]),Integer.parseInt(args[1])};
		if((1<=num[0] && num[0] <=5)&&(1<=num[1] && num[1]<=5)) {
			int arr[][] = new int[num[0]][num[1]];
			for(int i=0; i<arr.length; ++i) {
				for(int j=0; j<arr[i].length ;++j) {
					arr[i][j] = rd.nextInt(4)+1;
					System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}
				System.out.println();
			}
			avg = sum/(num[0]*num[1]);
			System.out.println("\nsum="+sum);
			System.out.println("avg="+avg);
		}
		else {
			System.out.println("숫자를 확인 하세요");
			return;
		}
		
		
		
	}

}
