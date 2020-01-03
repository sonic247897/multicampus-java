package chap05;
//배열 액세스하기
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] myarr = new int[5];
		// 배열의 요소의 크기를 출력
		// length - 배열의 사이즈를 저장하고 있는 기본 변수(자동으로 제공되는)
		System.out.println("배열의 요소의 개수:" + myarr.length);
		for(int i=0; i<myarr.length; ++i) {
			System.out.println(myarr[i]);
		}
	}

}
