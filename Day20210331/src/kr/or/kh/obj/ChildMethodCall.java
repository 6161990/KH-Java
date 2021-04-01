package kr.or.kh.obj;

//객체의 다형성

public class ChildMethodCall {

	public static void main(String[] args) {
		//부모 Person, 자식 Student
		
		//Person person = new Student(); 와 아래 두 줄은 같다.
		Student student = new Student();
		Person person = student;
		
//error person.study(); 이건 오버라이드 안했음. 일반 함수임(Student에서)
		person.showSleepStyle(); //이건 오버라이드 해놓았음. (Student에서)  
     // => 학생의 showSpeepStyle가 출력됨
		
		
	}

}
