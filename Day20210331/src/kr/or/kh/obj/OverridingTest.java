package kr.or.kh.obj;

//객체의 다형성 

public class OverridingTest {

	public static void main(String[] args) {
		//부모 Person, 자식 Employee
		
		Employee employee = new Employee();
		Person person = employee;
		System.out.println("employee="+ employee.x); //employee=500
		System.out.println("person="+ person.x); //person=0
		employee.sleep();
		person.sleep(); 
	 // => 직장인 클래스의 sleep 메소드가 출력
     // => 다른 코딩인데 결과가 같다. 
	
	}

}
