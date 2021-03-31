package kr.or.kh.obj;


//파라미터(매개변수)의 다형성
public class PersonInfo {
	public void showSleepingType(Person person) { //Person person = (Person) employee, student, president
		person.showSleepStyle();
	}

}
