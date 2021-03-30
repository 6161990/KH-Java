package kr.or.kh.obj6;


class Sawon2{
	protected String name;
	protected String dept;
	protected int salary;
	
	public Sawon2(String name, String dept, int salary) {
		super();
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String displayInfo() {
		return "이름="+name+", 부서:"+dept+",연봉:"+salary;
	}
}

class Sales2 extends Sawon2{
	protected int commition;
	
	public Sales2(String name, String dept, int salary, int commition) {
		super(name,dept,salary);
		this.commition=commition;
	}
	public String displayInfo() {
		return super.displayInfo()+"수당:"+commition;
	}
}

public class SuperConstractorTest {
	
	public static void main(String[] args) {
		
		Sawon2 sawon2 = new Sawon2("김사랑","마케팅",911100);
		System.out.println(sawon2.displayInfo());
		
		Sales2 sales2 = new Sales2("윤지짱","스마트개발부",90000000,300);
		System.out.println(sales2.displayInfo());
		
		Sales2 sales3 = new Sales2("나는야민우킴","스마트 주식",999999900,500);
		System.out.println(sales3.displayInfo());
		
	}

	

}
