package chap05;

public class Array2DExam01 {
	public static void main(String[] args) {
		// 1. 2차원 배열을 생성
		int[][] arr = new int[5][5];
		// 2. 2차원 배열에 값을 저장하기 - setting
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length;++j) {
				arr[i][j] = i*5 + (j+1);
			}
		}
		// 3. 2차원 배열에 저장된 데이터를 출력형태와 같이 출력하기 - getting 
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
