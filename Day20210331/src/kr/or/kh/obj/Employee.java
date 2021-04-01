package kr.or.kh.obj;

public class Employee extends Person {
	private String department;
	int x;
	
	public Employee() {
		this(null, 500);
	}

	public Employee(String department, int x) {
		this.department = department;
		this.x = x;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	
	@Override
	public void sleep() {
		System.out.println("직장인은 보통 7시간 잔다.");
	}

	@Override
	public void showSleepStyle() {
		 System.out.println("월급 노예들이 잘 시간이 어딨어!!!!");
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", x=" + x + "]";
	}


	

}
