package kr.or.kh.obj;

public class ChildMethodCall {

	public static void main(String[] args) {
		//Person person = new Student(); 와 아래 두 줄은 같다.
		Student student = new Student();
		Person person = student;
  //에러	person.study(); 이건 오버라이드 안했음. 일반 함수임(Student에서)
		person.showSleepStyle(); //이건 오버라이드 해놓았음. (Student에서)
		
		
	}

}
