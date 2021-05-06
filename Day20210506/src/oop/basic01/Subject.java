package oop.basic01;

public class Subject {
	
	private String studentName;
	private int kor;
	private int math;
	private int eng;
	
	public Subject() {}

	public Subject(String studentName, int kor, int math, int eng) {
		this.studentName=studentName;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double scoreAvg() {
		return (this.math+this.kor+this.eng)/3;
	}
	
	public double scoreAvg(int kor, int math, int eng) {
		this.kor=kor;
		this.math=math;
		this.eng=eng;
		return (this.math+this.kor+this.eng)/3;
	}
	
	public void printScore(String studentName) {
		System.out.println(studentName+ "님의 평균 점수는" + scoreAvg(kor,math,eng));
	}
	

}
