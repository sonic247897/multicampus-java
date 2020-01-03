package chap09.api.lang;
// String 클래스의 기본 메소드
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println(str1); //toString이 각각 출력된다.
		System.out.println(str2); //toString은 Object의 기본메소드이므로
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));
		System.out.println("str1.lastIndexOf('a')=>"+
									str1.lastIndexOf('a'));
		System.out.println("str1.length()=>"+str1.length());
		//문자열로 "를 삽입하고 싶으면 \"
		//문자열 비교 - 대소문자 비교
		System.out.println("str1.equals(\"java programming\")=>"
				+str1.equals("java programming"));
		System.out.println("str1.equals(\"java programming\")=>"
				+str1.equals("Java programming"));
		
		//문자열비교 - 대소문자 비교 안함
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
				+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
				+str1.equalsIgnoreCase("Java programming"));
		
		//문자열비교 - prefix
		System.out.println("str1.startsWith(\"java\")=>"
				+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"
				+str1.startsWith("Java"));
		
		//문자열비교 - suffix
		System.out.println("str1.endsWith(\"ming\")=>"
				+str1.endsWith("ming"));
	}
}
