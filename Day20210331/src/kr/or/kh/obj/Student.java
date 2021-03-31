package kr.or.kh.obj;

public class Student extends Person {
	private String schoolKind;
	private String grade;
	public Student() {
		this(null, null);
	}	
	public Student(String schoolKind, String grade) {
		this.schoolKind = schoolKind;
		this.grade = grade;
	}
	public String getSchoolKind() {
		return schoolKind;
	}
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [schoolKind=" + schoolKind + ", grade=" + grade + "]";
	}
	@Override
	public void showSleepStyle() {
		System.out.println("학생들은 요즘 새벽 한시가 넘어서도 핸드폰하느라 잠을 안자, 아주 현대인들의 수면부족 심각해");
	}
	public void study() {
		System.out.println("공부를 한다.");
	}
	
	

}
