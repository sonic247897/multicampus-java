package workbook2;

public class StringTest02 {
	public static void main(String[] args) {
		String str = "   [Beyond promise.]   ";
		System.out.println(str.replace(" ", "_"));
		System.out.println(str.trim());
		System.out.println(str.trim().toUpperCase());
		System.out.println(str.trim().toLowerCase());
		System.out.println(str.trim().replace('e', 'a'));
		System.out.println(str.trim().substring(8,15));
	}
}
