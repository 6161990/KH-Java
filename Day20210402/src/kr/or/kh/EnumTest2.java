package kr.or.kh;

class Student1{
	SchoolType school;
	public Student1(SchoolType school) {
		this.school=school;
	}
}

enum SchoolType{
	//문자열만 쭉 적으면 1,2,3,4 쭉 숫자가 매겨짐
	ENEMENTARY,MIDDLE,HIGH,UNIVERSITY;
}

public class EnumTest2 {

	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ENEMENTARY);
		Student1 st2 = new Student1(SchoolType.MIDDLE);
		Student1 st3 = new Student1(SchoolType.HIGH);
		Student1 st4 = new Student1(SchoolType.UNIVERSITY);
		
		System.out.println("상수값을 출력한 경우");
		System.out.println("st1.school="+st1.school);
		if(st1.school==SchoolType.ENEMENTARY) {
			System.out.println("초등학생");
		}
		if(st2.school==SchoolType.MIDDLE) {
			System.out.println("중학생");
		}
		if(st3.school==SchoolType.HIGH) {
			System.out.println("고등학생");
		}
		if(st4.school==SchoolType.UNIVERSITY) {
			System.out.println("대학생");
		}
		
	}
}
