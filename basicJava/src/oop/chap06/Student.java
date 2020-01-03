package oop.chap06;

public class Student {
	private String name;
	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Student(String name, int korean, int english, 
			int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return this.korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return this.english;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return this.math;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getScience() {
		return this.science;
	}

	public double getAvg() {
		int sum = this.korean + this.english + this.math +this.science;
		double avg = (double)sum/4;
		return avg;
	}

	public String getGrade() {
		double avg = getAvg();
		if (avg > 100 | avg < 0) {
			return "잘못 입력";
		} else {
			if (avg >= 90) {
				return "A학점";
			} else if (avg >= 70) {
				return "B학점";
			} else if (avg >= 50) {
				return "C학점";
			} else if (avg >= 30) {
				return "D학점";
			} else {
				return "F학점";
			}
		}
	}
	
	public void print() {
		System.out.println(this.getName() +" 평균: " +this.getAvg()
			+" 학점: " + this.getGrade());
	}
	
	public static void show() {
		System.out.println("=============================");
	}
	
	
}
