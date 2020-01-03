package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sum=0, oddSum=0, evenSum=0;
		int i=1;
		while(i<=100) {
			sum +=i;
			if(i%2 ==0) {
				evenSum +=i;
			}
			else {
				oddSum +=i;
			}
			++i;
		}
		System.out.println("Че: " + sum);
		System.out.println("ШІМіЧе: " + oddSum);
		System.out.println("ТІМіЧе: " + evenSum);
	}

}
