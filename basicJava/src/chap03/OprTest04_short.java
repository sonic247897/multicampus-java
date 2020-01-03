package chap03;
// 비교연산자 - ||, && (숏컷 연산자) - 모든 항을 검사하지 않고 조건에 만족하면 skip
public class OprTest04_short {
	public static void main(String[] args) {
		int num = 100;
		String str = null; // 현재 str은 아무것도 저장되지 않은 변수
		//str.length();
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
