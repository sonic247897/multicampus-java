package chap05;
// 배열의 문법 연습 - 사용하는 방법
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. 배열의 선언
		int[] myarr;
		int[] myarr2;
		//2. 배열의 생성
		myarr = new int[5];
		myarr2 = new int[5];
		
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println("myarr의 2번 요소의 값=>" + myarr[2]);
		
		// 3. 배열의 초기화 - 2번 요소에 100을 저장
		myarr[2] = 100;
		System.out.println("myarr의 2번 요소의 값=>" + myarr[2]);
		
		// 배열의 선언과 생성을 한꺼번에 처리
		int[] numarr = new int[3];
		boolean[] boolarr = new boolean[5];
		long[] longarr = new long[100];
		double[] doublearr = new double[100];
		
		// 배열의 기본 초기값
		// 기본형인 경우
		// 정수형 - 0
		// boolean - false, 실수형 - 0.0
		System.out.println(numarr[0]);
		System.out.println(boolarr[0]);
		System.out.println(longarr[0]);
		System.out.println(doublearr[0]);
	}

}
