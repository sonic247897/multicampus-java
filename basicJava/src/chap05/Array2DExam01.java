package chap05;

public class Array2DExam01 {
	public static void main(String[] args) {
		// 1. 2���� �迭�� ����
		int[][] arr = new int[5][5];
		// 2. 2���� �迭�� ���� �����ϱ� - setting
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length;++j) {
				arr[i][j] = i*5 + (j+1);
			}
		}
		// 3. 2���� �迭�� ����� �����͸� ������¿� ���� ����ϱ� - getting 
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length;++j) {
				if(i == j) {
					System.out.print("*" + "\t");
				}
				else {
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}
		
	}

}
