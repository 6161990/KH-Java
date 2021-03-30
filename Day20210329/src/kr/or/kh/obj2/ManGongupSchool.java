package kr.or.kh.obj2;

import java.util.Scanner;

public class ManGongupSchool extends ManSchool {

	protected int gongup;

	public ManGongupSchool() {
		super();  //생성자 함수는 상속이 안되서 반드시 달아줘야한다(컴파일러가 수행한다) 수행하지 않을시 개발자가 코딩.
	}

	public ManGongupSchool(int kor, int eng, int math, int gisul, int gongup) {
		super(kor, eng, math, gisul);
		this.gongup = gongup;
	}

	public int getGongup() {
		return gongup;
	}

	public void setGongup(int gongup) {  //set은 대입
		this.gongup = gongup;
	}
	@Override
	public String toString() {
		return super.toString()+ " ManGongupSchool plus [gongup=" + gongup + "]";
	}
	
	/*public static void main(String[] args) {
		//ManGongupSchool manGongupSchool = new ManGongupSchool(20,20,20,20,20);
		//System.out.println(manGongupSchool.toString());
		
		ManGongupSchool manGongupSchool = new ManGongupSchool();
		Scanner input = new Scanner(System.in);
		System.out.println("국어입력");
		int kor = input.nextInt();
		System.out.println("영어입력");
		int eng = input.nextInt();
		System.out.println("수학입력");
		int math = input.nextInt();
		System.out.println("기술입력");
		int gisul = input.nextInt();
		System.out.println("공업입력");
		int gongup = input.nextInt();
		
		manGongupSchool.setKor(kor);
		manGongupSchool.setEng(eng);
		manGongupSchool.setMath(math);
		manGongupSchool.setGisul(gisul);
		manGongupSchool.setGongup(gongup);
		
	}*/
	
}
