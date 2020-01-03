package test.exam;
//자바 기본형 데이터의 리터럴에 대해서 살펴보는 예제
public class PrimitiveTypeTest{
	public static void main(String[] args){
		// boolean형
		boolean bool = true;// true or false
		System.out.println(bool);

		// 문자형
		char c = 'a'; // char타입 변수는 리터럴을 표현할 때 ''로 표현
		System.out.println(c);

		// 정수형 변수
		// 정수형 변수에 기본으로 할당되는 리터럴의 타입은 int
		byte b = 127;
		System.out.println(b);

		short s = 32767;
		System.out.println(s);

		long i = 2147483648L;
		System.out.println(i);

		float f = 10.5f;
		System.out.println(f);
		double d = 10.5;
		System.out.println(d);
		
		double exam = 10/3d;
		System.out.println(exam);

	
	}

}