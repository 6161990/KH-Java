package kr.or.kh.obj5;

public class Sawon {
	protected String name;
	protected String dept;
	protected int salary;
	
	
	
	public Sawon() {
		this("우빈", null, 0);
	}



	public Sawon(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Sawon [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
