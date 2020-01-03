package test.exam;
public class TimeExam
{
	public static void main(String[] args){
		// time 변수에 저장된 값은 초 데이터다.
		// ___시 ___분 ___초 의 형태로 출력하기
		int time = 8888;
		int hour = time/3600;
		time = time - hour*3600;
		int minute = time/60;
		time = time - minute*60;
		int second = time;

		System.out.println(hour + "시 " + minute + "분 " + second + "초");

	}
}