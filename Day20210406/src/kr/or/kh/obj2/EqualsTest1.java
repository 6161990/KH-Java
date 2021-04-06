package kr.or.kh.obj2;

class Student3 {
	String name;
	int number;
	public Student3(String name, int number){
		this.name=name;
		this.number=number;
		
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Student3 st1 = new Student3("콩콩이",1);
		Student3 st2 = new Student3("콩콩이",1);
		System.out.println(" == 비교");
		System.out.println("st1==st2: "+(st1==st2) );
		System.out.println("equals 비교"); //객체의 주소가 같냐
		System.out.println("st1.equals.(st2) : "+(st1.equals(st2)) );
	}

}
