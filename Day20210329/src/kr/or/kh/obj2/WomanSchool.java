package kr.or.kh.obj2;

public class WomanSchool extends School {
	protected int gajong;

	public WomanSchool() {
		super();
	}

	public WomanSchool(int kor, int eng, int math, int gajong) {
		super(kor, eng, math);
		this.gajong=gajong;
	}

	@Override
	public String toString() {
		return super.toString()+ " WomanSchool [gajong=" + gajong + "]";
	}
	
	public static void main(String[] args) {
		WomanSchool womanSchool = new WomanSchool(70,80,90,100);
		System.out.println(womanSchool.toString());
	}
}
