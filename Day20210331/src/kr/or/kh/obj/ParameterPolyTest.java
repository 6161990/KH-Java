package kr.or.kh.obj;

public class ParameterPolyTest {
//파라미터(매개변수)의 다형성 
	public static void main(String[] args) {
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		pf.showSleepingType(person);
		pf.showSleepingType(employee);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}

}
