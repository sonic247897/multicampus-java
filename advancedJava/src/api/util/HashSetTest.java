package api.util;

import java.util.HashSet;
import java.util.Iterator;
// HashSet 사용하기 - <자료구조>데이터 저장하고 저장된 데이터 꺼내기
// 집합, 중복을 허용하지 않는다.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		// 중복된 데이터는 하나로 친다.
		set.add("java");
		System.out.println("사이즈=>"+set.size());
		// ArrayList - 순서가 있으므로 get과 for문, index접근 가능
		// <set에 저장된 요소를 추출>
		// 1. HashSet데이터를 표준 인터페이스(모든 자료구조에 담긴 데이터를 
		// 	변환해서 담을 수 있도록 제공되는 추출 전용 인터페이스) Iterator로 변환
		Iterator<String> it = set.iterator();
		// 2. 변환한 후 추출  => 순서는 없다!!
		while(it.hasNext()) { //Iterator 안에 저장된 요소가 있는지 확인-boolean 리턴
			String data = it.next(); //Iterator에 저장된 요소를 하나 꺼내서 반환
			System.out.println("꺼낸 요소:"+data);
		}
		
		// foreach : 위의 방법과 같은 결과(set에 저장되어 있는것 하나씩 꺼냄)
		for (String data : set) {
			System.out.println("set에 저장된 요소:"+data);
		}
	}

}
