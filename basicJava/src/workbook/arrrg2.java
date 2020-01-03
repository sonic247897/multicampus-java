package workbook;

public class arrrg2 {
	public static void main(String[] args) {
		System.out.print("ÀÔ·Â ¿¹1: "+args[0]);
		char[] arr = new char[args[0].length()];
		char[] arr2 = new char[args[0].length()];
		
		arr = args[0].toCharArray();
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[(arr.length-1)-i];
		}
		System.out.println();
		System.out.println(arr2);
		
	}

}
