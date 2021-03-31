package kr.or.kh.obj1;

public class Employee extends Person {
	public void emp() {
		System.out.println("직장인");
	}
	
	
	@Override
	public void set() {
		System.out.println("직장인의 특성");
	}

	@Override
	public void sleep(){
		System.out.println("직장인 수면시간은 7시간입니다.");
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		Person person = employee;
		employee = (Employee)person;
		employee.sleep();
		
		
		/*Person person = new Person();
		Employee employee = person;  //에러 
		Employee employee =(Employee) person; //업 캐스팅명시해도 error why? employee의 동적공간이 생성안됐기 때문에 heap메모리에 참조할 공간이 아직 없다. 
		employee.sleep();*/
		
		
		
		
		/*Person person = new Person ();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		person = (Person)employee;  //다운캐스팅
		person.set();
		person.sleep();
		//person.emp(); 쓸 수 없음 
		
		
		person = (Person)student;
		person.set();
		person.sleep();
		///person.stu(); 쓸 수 없음 
		
		person = (Person)president;
		person.set();
		person.sleep();
		president.sleep();*/
		
		
		/*Person person = new Person ();
		person.sleep();
		
		Employee employee = new Employee();
		employee.sleep();*/
		
	}
}
