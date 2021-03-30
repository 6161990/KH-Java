package kr.or.kh.obj2;

import java.util.Scanner;

public class WomanSchool extends School {
	protected int gajong;

	public WomanSchool() {  //부모의 기본 생성자
		super();
	}

	public WomanSchool(int kor, int eng, int math, int gajong) {
		super(kor, eng, math);  //부모의 매개변수 있는 함성자
		this.gajong=gajong;
	}

	public int getGajong() {
		return gajong;
	}

	public void setGajong(int gajong) {
		this.gajong = gajong;
	}

	@Override
	public String toString() {
		return super.toString()+ " WomanSchool plus [gajong=" + gajong + "]";
	}
	
	/*public static void main(String[] args) {
		WomanSchool womanSchool = new WomanSchool();
		Scanner input = new Scanner(System.in);
		System.out.println("국어 입력");
		int kor = input.nextInt();
		System.out.println("영어 입력");
		int eng = input.nextInt();
		System.out.println("국어 입력");
		int math = input.nextInt();
		System.out.println("가정 입력");
		int gajong = input.nextInt();
		womanSchool.setKor(kor);
		womanSchool.setEng(eng);
		womanSchool.setMath(math);
		womanSchool.setGajong(gajong);
		System.out.println(womanSchool.toString());
	}*/
}
