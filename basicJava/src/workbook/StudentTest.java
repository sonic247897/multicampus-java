package workbook;

public class StudentTest {
	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임걱정",16,175,65);
		System.out.println("이름"+"\t"+"나이"+"\t"+"신장"+"\t"+"몸무게");
		int ageSum=0,heightSum=0, weightSum=0;
		for(int i=0; i<3; ++i) {
			System.out.println(studentArray[i].getName() +"\t"
					+studentArray[i].getAge() + "\t"
					+studentArray[i].getHeight()+ "\t"
					+studentArray[i].getWeight());
			
			ageSum += studentArray[i].getAge();
			heightSum += studentArray[i].getHeight();
			weightSum += studentArray[i].getWeight();
		}
		System.out.println();
		
		double ageAvg = ageSum/3.0;
		ageAvg = ageAvg%(0.01) >= 0.005? ((int)(ageAvg/0.01))/100.0 +0.01
							: ((int)(ageAvg/0.01))/100.0;
		double heightAvg = heightSum/3.0;
		heightAvg = heightAvg%(0.01) >= 0.005? ((int)(heightAvg/0.01))/100.0 +0.01
				: ((int)(heightAvg/0.01))/100.0;
		
		double weightAvg = weightSum/3.0;
		weightAvg = weightAvg%(0.01) >= 0.005? ((int)(weightAvg/0.01))/100.0 +0.01
				: ((int)(weightAvg/0.01))/100.0;
		
		
		System.out.println("나이의 평균: "+ageAvg);
		System.out.println("신장의 평균: "+heightAvg);
		System.out.println("몸무게의 평균: "+weightAvg);
		
		
	}

}
