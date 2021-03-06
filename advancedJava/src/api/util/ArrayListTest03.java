package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java"};
		ArrayList<String> list = changeData(arr);
		// 변환된 ArrayList에 저장된 값을 꺼내서 출력하기
		// old for문 - list.size()함수를 써야 함.
		// for문 돌리기 전에 미리 변수에 size를 받아둬야 함!!
		int size = list.size();
		for(int i=0; i<size; ++i) {
			System.out.println(list.get(i));
		}
		// new for문
		for (String data : list) {
			System.out.println("요소:" + data);
		}
		
	}
	//ArrayList도 리턴타입이 될 수 있다.
	// 배열을 ArrayList로 변환해서 리턴하는 메소드
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		// 매개변수로 전달된 배열에서 데이터를 꺼내서 ArrayList에 저장하는 코드
		for(int i=0; i<arr.length; ++i) {
			list.add(arr[i]);
		}
		return list;
	}

}
