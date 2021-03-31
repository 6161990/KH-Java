package kr.or.kh.obj;

public class OverridingTest {
//객체의 다형성 
	public static void main(String[] args) {
		Employee employee = new Employee();
		Person person = employee;
		System.out.println("employee="+ employee.x);
		System.out.println("person.x"+ person.x);
		employee.sleep();
		person.sleep();
		//다른 코딩인데 결과가 같다. 
	
	}

}
