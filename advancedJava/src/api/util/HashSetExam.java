package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		// 다음과 같은 변수명으로 HashSet객체 2개 생성하기
		// set1 -> 1부터 10까지의 정수
		// set2 -> 5부터 15까지의 정수
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1; i<=10; ++i) {
			set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i=5; i<=15; ++i) {
			set2.add(i);
		}
			
		// set1과 set2 합집합 출력하기
		HashSet<Integer> uniSet = new HashSet<Integer>(set1);
		//교집합
		HashSet<Integer> interSet = new HashSet<Integer>(set1);
		interSet.retainAll(set2);
		for (Integer data : set2) {
			uniSet.add(data);
		}
		print(uniSet, "uniSet");
		
		// set1과 set2 교집합 출력하기
		print(interSet, "interSet");
		
	}
	
	public static void print(Set<Integer> set, String setName) {
		System.out.println("사이즈=>"+set.size());
		for (Integer data : set) {
			System.out.println(setName+"에 저장된 요소=>"+data);
		}
		System.out.println("=================================");
	}
}


