package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		// ������ ���� ���������� HashSet��ü 2�� �����ϱ�
		// set1 -> 1���� 10������ ����
		// set2 -> 5���� 15������ ����
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1; i<=10; ++i) {
			set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i=5; i<=15; ++i) {
			set2.add(i);
		}
			
		// set1�� set2 ������ ����ϱ�
		HashSet<Integer> uniSet = new HashSet<Integer>(set1);
		//������
		HashSet<Integer> interSet = new HashSet<Integer>(set1);
		interSet.retainAll(set2);
		for (Integer data : set2) {
			uniSet.add(data);
		}
		print(uniSet, "uniSet");
		
		// set1�� set2 ������ ����ϱ�
		print(interSet, "interSet");
		
	}
	
	public static void print(Set<Integer> set, String setName) {
		System.out.println("������=>"+set.size());
		for (Integer data : set) {
			System.out.println(setName+"�� ����� ���=>"+data);
		}
		System.out.println("=================================");
	}
}

