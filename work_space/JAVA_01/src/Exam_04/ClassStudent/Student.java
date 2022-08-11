package Exam_04.ClassStudent;

public class Student {
	public String name; // 이름
	public int kor; // 국어점수
	public int math; // 수학점수
	public int eng; // 영어점수
	
	public Student ( ) {
		name = "황지훈";
		kor = 80;
		math = 80;
		eng = 90;
	}

	public Student(String string, int i, int j, int k) {
		name = string;
		kor = i;
		math = j;
		eng = k;
	}
}