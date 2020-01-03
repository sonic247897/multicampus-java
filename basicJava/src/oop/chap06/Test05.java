package oop.chap06;

public class Test05 {
	public static void main(String[] args) {
		Student[] s = new Student[3];
		s[0] = new Student("Kim", 100, 90, 95, 89);
		s[1] = new Student("Lee", 60, 70, 99, 98);
		s[2] = new Student("Park",68, 86, 60, 40);
		
		for(int i=0; i<3; ++i) {
			s[i].print();
		}

	}

}
