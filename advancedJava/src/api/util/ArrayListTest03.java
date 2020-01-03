package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java"};
		ArrayList<String> list = changeData(arr);
		// ��ȯ�� ArrayList�� ����� ���� ������ ����ϱ�
		// old for�� - list.size()�Լ��� ��� ��.
		// for�� ������ ���� �̸� ������ size�� �޾Ƶ־� ��!!
		int size = list.size();
		for(int i=0; i<size; ++i) {
			System.out.println(list.get(i));
		}
		// new for��
		for (String data : list) {
			System.out.println("���:" + data);
		}
		
	}
	//ArrayList�� ����Ÿ���� �� �� �ִ�.
	// �迭�� ArrayList�� ��ȯ�ؼ� �����ϴ� �޼ҵ�
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		// �Ű������� ���޵� �迭���� �����͸� ������ ArrayList�� �����ϴ� �ڵ�
		for(int i=0; i<arr.length; ++i) {
			list.add(arr[i]);
		}
		return list;
	}

}