package chap04;
// break문 연습 - break문이 선언된 블럭을 빠져나간다.
public class GuGu_Break {
	public static void main(String[] args) {
		for(int dan=2; dan<=9; ++dan) {
			if(dan==5) {
				break;
			}
			for(int i=1; i<=9; ++i) {
				/*if(dan == 5) { break문이 내부 for에 선언되어 있으므로
					break;		반복문이 종료되지는 않는다.
				}*/
				System.out.print(dan+"*"+i+"="+dan*i +"\t");
			}
			System.out.println();
		}
		
	}

}
