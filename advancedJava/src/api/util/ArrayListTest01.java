package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		// E는 ArrayList를 사용하는 시점에 정의하는 데이터 타입
		// ArrayList에 저장되는 요소의 타입
		// Elements에 모든걸 다 담을 수 있다. 기본형, 참조형, Exception, API..
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("사이즈:"+list.size());
		// 선형구조(LinearList)라서 배열과 같이 순서가 있다.
		System.out.println("ArrayList에 저장된 요소들");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
	}
}
