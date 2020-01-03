package chap09.api.lang;

public class StringExam {
	public static void main(String[] args) {
		//str1을 AVAJ로 출력되도록 구현하세요
		//단, StringBuffer의 reverse() 사용하지 않기
		//	 String의 toCharArray()도 사용하지 않기
		//	 String 클래스의 charAt()과 toUpperCase() 이용하기
		String str1 = "java";
		String str2 = str1.toUpperCase();
		for(int i=str2.length()-1; i>=0; --i) {
			System.out.print(str2.charAt(i));
		}
		
	}

}
