package chap04;

import java.util.Random;
// Random Ŭ������ if�� ����
public class ifTest01 {
	public static void main(String[] args) {
		//Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾�
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		System.out.println(num);
		if(num >= 90) {
			System.out.println("����");
			System.out.println("�� ��° �����Դϴ�.");
		}
		System.out.println("����");
		
		
		
		
	}

}
