package api.util;

import java.util.Vector;

//Vector를 만들고 사용하는 방법
public class VectorTest01 {
	public static void main(String[] args) {
		// int를 참조형으로 표현해 놓은 것이 Integer
		// generic: 컬렉션 프레임웍의 데이터 형식을 표현해놓은 것
		//			사용하는 시점에 작성하면 된다.
		Vector<Integer> v = new Vector<Integer>();
		//v.add("java");
		v.add(10);
		System.out.println("Vector의 용량:"+v.capacity()); //총 사이즈
		// 들어가 있는 데이터의 개수
		System.out.println("Vector에 저장된 요소의 개수:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=10; ++i) {
			v.add(i);
		}
		System.out.println("Vector의 용량:"+v.capacity()); //총 사이즈
		// 들어가 있는 데이터의 개수
		System.out.println("Vector에 저장된 요소의 개수:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=10; ++i) {
			v.add(i);
		}
		System.out.println("Vector의 용량:"+v.capacity()); //총 사이즈
		// 들어가 있는 데이터의 개수
		System.out.println("Vector에 저장된 요소의 개수:"+v.size());
		
		
		System.out.println("====================================");
		for(int i=1; i<=20; ++i) {
			v.add(i);
		}
		System.out.println("Vector의 용량:"+v.capacity()); //총 사이즈
		// 들어가 있는 데이터의 개수
		System.out.println("Vector에 저장된 요소의 개수:"+v.size());
		
		System.out.println("====================================");
		for(int i=1; i<=40; ++i) {
			v.add(i);
		}
		System.out.println("Vector의 용량:"+v.capacity()); //총 사이즈
		// 들어가 있는 데이터의 개수
		System.out.println("Vector에 저장된 요소의 개수:"+v.size());
		// 용량이 2배씩 늘어난다!
	}

}
