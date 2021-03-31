package kr.or.kh.obj1;

public class School {
	protected int kor;
	protected int eng;
	protected int math;
	protected int total;
	
	public void total() {
		total = kor+eng+math;
		System.out.println(total);
	}

}
