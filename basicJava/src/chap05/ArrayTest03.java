package chap05;
//�迭 �׼����ϱ�
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] myarr = new int[5];
		// �迭�� ����� ũ�⸦ ���
		// length - �迭�� ����� �����ϰ� �ִ� �⺻ ����(�ڵ����� �����Ǵ�)
		System.out.println("�迭�� ����� ����:" + myarr.length);
		for(int i=0; i<myarr.length; ++i) {
			System.out.println(myarr[i]);
		}
	}

}
