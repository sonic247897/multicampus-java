package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		// E�� ArrayList�� ����ϴ� ������ �����ϴ� ������ Ÿ��
		// ArrayList�� ����Ǵ� ����� Ÿ��
		// Elements�� ���� �� ���� �� �ִ�. �⺻��, ������, Exception, API..
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("������:"+list.size());
		// ��������(LinearList)�� �迭�� ���� ������ �ִ�.
		System.out.println("ArrayList�� ����� ��ҵ�");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
	}
}