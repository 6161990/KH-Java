package oop.exception01;

import java.util.InputMismatchException;

public class Student {
	private String name;
	private int kor,eng,math;
	
	
	public Student() {}


	public Student(String name, int kor, int eng, int math) {
		super();
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(!(name.length()>=2 && name.length() <=5)) {
			throw new InputMismatchException("이름은 두글자이상, 다섯글자 이하로 입력하세요");
		}
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if(!(kor>=0 && kor <=100)){
			throw new InputMismatchException("국어점수는 0~100점 사이를 입력하세요");
		}
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		if(!(eng>=0 && eng <=100)){
			throw new InputMismatchException("영어점수는 0~100점 사이를 입력하세요");
		}
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		if(!(math>=0 && math <=100)){
			throw new InputMismatchException("수학점수는 0~100점 사이를 입력하세요");
		}
		this.math = math;
	}
	
}
