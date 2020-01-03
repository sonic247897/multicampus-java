package test.exam;

public class OprTest01{
	public static void main(String[] args){
		int x=5; int y;
		y = x++;
		System.out.println(x+" "+y);
		x=5;
		y = ++x;
		System.out.println(x+" "+y);
		x=5;
		y = x--;
		System.out.println(x+" "+y);
		x=5;
		y = --x;
		System.out.println(x+" "+y);

	}
}