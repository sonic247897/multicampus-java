package test.exam;
public class TimeExam
{
	public static void main(String[] args){
		// time ������ ����� ���� �� �����ʹ�.
		// ___�� ___�� ___�� �� ���·� ����ϱ�
		int time = 8888;
		int hour = time/3600;
		time = time - hour*3600;
		int minute = time/60;
		time = time - minute*60;
		int second = time;

		System.out.println(hour + "�� " + minute + "�� " + second + "��");

	}
}