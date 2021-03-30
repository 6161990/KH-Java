package kr.or.kh.obj5;

public class Sales extends Sawon {
	protected int Commition;
	
	

	public Sales() {
		this("윤지", "it부", 90000000,300);
	}



	public Sales(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.Commition = commition;
	}



	@Override
	public String toString() {
		return super.toString()+ " + Sales [Commition=" + Commition + "]";
	}
	
	public static void main(String[] args) {
		Sales sales1 = new Sales();
		System.out.println(sales1.toString());
		
		
		Sales sales2 = new Sales("yoonji","it부",70000000,200);
		System.out.println(sales2.toString());
		
		Sawon sawon1 = new Sawon();
		System.out.println(sawon1.toString());
	}

}
