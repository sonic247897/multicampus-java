package workbook2;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("LGCNS");
		String str = null;
		sb.delete(2, sb.length());
		sb.append("cnser");
		str = sb.toString();
		System.out.println(str);
	}

}
