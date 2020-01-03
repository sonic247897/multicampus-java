package chap04;

public class ForExam01 {
	public static void main(String[] args) {
		// char->int는 자동캐스팅 된다.
		for(int i=0; i<26; ++i) {
			System.out.print((char)('A'+i));
		}
	}
}
