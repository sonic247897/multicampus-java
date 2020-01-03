package oop.chap07.poly;

import javax.swing.JFrame;

// ������ �ý��ۿ��� GUI ���� �Ⱦ��� ���� �̿��Ѵ�.
// �������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���
// 					�⺻������ �����ؾ� �ϴ� ����� �������� �����ϱ� ���� ����(JDBC)
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		GUITest obj = new GUITest("�������̽� ����");
	}

}
