package chap05;
// �迭�� �ۼ��ϰ� �׼����ϱ�
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
