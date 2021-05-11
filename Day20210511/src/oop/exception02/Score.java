package oop.exception02;

import java.io.IOException;
import java.util.InputMismatchException;

public class Score {
	
	private String name;
	private int kor,eng,math;
	
	public Score() {}
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.setName(name); 
		this.setKor(kor); 
		this.setEng(eng);
		this.setMath(math);
	}
	
	public int total() throws Exception {
		return kor+eng+math;
	}

	public int avg() throws Exception {
		return (kor+eng+math)/3;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		//예외를 만들 때 Exception은 반드시 던지거나 잡아줘야함 CHECKED EXCEPTION이기때문에 
		try { 
		if(!(name.length() >= 2  && name.length()<=8)) {
			throw new Exception("이름은 두 글자에서 여덟글자 이하로 입력하세요.");
		}
		}catch(Exception e) {
			System.out.println("이름은 두 글자에서 여덟글자 이하로 입력하세요.");
		}
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		//예외를 만들 때 Exception은 반드시 던지거나 잡아줘야함 CHECKED EXCEPTION이기때문에 
		//BUT, InputMismatchException은 잡아주지 않아도 됨. UNCHECKED EXCEPTION 이기때문에
		if(!(kor > 0 && kor <= 100)) {
			throw new InputMismatchException("국어점수는 0점이상 100점 이하로 입력하세요");
		}
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
			if(!(eng > 0 && eng <= 100)) {
				throw new InputMismatchException("영어점수는 0점이상 100점 이하로 입력하세요");
			}
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
			if(!(math > 0 && math <= 100)) {
				throw new InputMismatchException("메세지 없어도됨.");
			}
		this.math = math;
	}
	
	

}
