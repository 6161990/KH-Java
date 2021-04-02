package kr.or.kh;

//Enum (나열형 상수)
//관련성이 있는 데이터들을 상수처럼 정의해서 사용할 수 있는 단위 

class Student {
	
	
	int school;
	public Student(int school) {
		this.school=school;
	}
	public static int ELEMENTARY=1;
	public static int MIDDLE=2;
	public static int HIGHSCHOOL=3;
	public static int UNIVERSITY=4;

}

public class EnumTest1 {

	public static void main(String[] args) {
		Student st1 = new Student(Student.ELEMENTARY); //이게 가독성이 좋음 딱 보면 뭘 의미하는지 알 수 있음
		Student st2 = new Student(2); //이것도 가능 
		Student st3 = new Student(Student.HIGHSCHOOL);
		Student st4 = new Student(Student.UNIVERSITY);
		System.out.println("상수 값을 출력한 경우");
		System.out.println(":"+st1.school);
		System.out.println(":"+st2.school);
		System.out.println(":"+st3.school);
		System.out.println(":"+st4.school);
		if(st1.school==Student.ELEMENTARY) {
			System.out.println("당신은 초등학생입니다.");
		}
		if(st2.school==Student.MIDDLE) {
			System.out.println("당신은 중학생입니당");
		}
		if(st3.school==Student.HIGHSCHOOL) {
			System.out.println("당신은 고등학생입니당");
		}
		if(st4.school==Student.UNIVERSITY) {
			System.out.println("당신은 대학생입니당");
		}
		
		
		//but, 상수는 프로그램상에서 해당 값의 의미를 명확히 하기위해서 사용되는데 ELEMENTARY 상수값대신 1상수값을 이용해서 비교가 가능하다면 상수의 기능적인 면이 조금 부족하다. 
		// 그리고 상수값을 출력했을 때 Student 클래스에서 정의된 이름이 아니라 일반 정수값으로 출력되기 때문에 해당 값이 상수로 정의한 값인지확인이 안된다. 
		//=> 이런 부족한 점을 보강하기 위해 jdk1.5에서 enum기능이추가되었다. 
	}

}
