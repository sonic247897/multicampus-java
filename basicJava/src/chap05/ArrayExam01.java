package chap05;
// 배열을 작성하고 액세스하기
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[2] = 100;
		arr[3] = 200;
		arr[5] = 300;
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

}
