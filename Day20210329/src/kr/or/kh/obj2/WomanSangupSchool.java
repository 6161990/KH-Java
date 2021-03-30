package kr.or.kh.obj2;

import java.util.Scanner;

public class WomanSangupSchool extends WomanSchool {
	
	protected int sangup;

	public WomanSangupSchool() {
		super();
	}

	public WomanSangupSchool(int kor, int eng, int math, int gajong, int sangup) {
		super(kor, eng, math, gajong);
		this.sangup = sangup;
	}

	public int getSangup() {
		return sangup;
	}

	public void setSangup(int sangup) {
		this.sangup = sangup;
	}

	@Override
	public String toString() {
		return super.toString() + " WomanSangupSchool plus [sangup=" + sangup + "]";
	}

	/*public static void main(String[] args) {
		WomanSangupSchool womanSangupSchool = new WomanSangupSchool();
		Scanner input = new Scanner(System.in);
		System.out.println("국어입력");
		int kor = input.nextInt();
		System.out.println("영어입력");
		int eng = input.nextInt();
		System.out.println("수학입력");
		int math = input.nextInt();
		System.out.println("가정입력");
		int gajong = input.nextInt();
		System.out.println("상업입력");
		int sangup = input.nextInt();

		womanSangupSchool.setKor(kor);
		womanSangupSchool.setEng(eng);
		womanSangupSchool.setMath(math);
		womanSangupSchool.setGajong(gajong);
		womanSangupSchool.setSangup(sangup);
		
		System.out.println(womanSangupSchool.toString());
	}*/
}
