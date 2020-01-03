package workbook2;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String str = "4,2,3,6,7";
		StringTokenizer token = new StringTokenizer(str, ",");
		int cnt = token.countTokens();
		int sum=0;
		for(int i=1; i<= cnt; ++i) {
			int tmp = Integer.parseInt(token.nextToken());
			sum +=tmp;
		}
		System.out.println(sum);
	}

}
