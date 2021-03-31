package kr.or.kh.obj1;

public class Student extends Person{
	public void stu() {
		System.out.println("직장인");
	}

	@Override
	public void sleep() {
		System.out.println("학생의 수면시간은 5시간이다.");
	}

}
