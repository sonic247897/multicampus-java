package workbook2;

import java.util.StringTokenizer;

public class StringTest01 {
	public static void main(String[] args) {
		String str = "I am second to none";
		StringTokenizer tk = new StringTokenizer(str, " ");
		int cntWord = tk.countTokens();
		int cntChar = 0; 
		for(int i=1 ; i<=cntWord; ++i) {
			String tmp = tk.nextToken();
			for(int j=0; j<tmp.length(); ++j) {
				System.out.print(tmp.charAt(j)+" ");
				++cntChar;
			}
		}
		System.out.println("문자개수: "+ cntChar);
		System.out.println(str + " "+"단어개수: "+cntWord);
	}

}
