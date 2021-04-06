package kr.or.kh.obj2;

class Student5{
	String name;
	int number;
	public Student5(String name, int number) {
		super();
		this.name=name;
		this.number=number;
		
	}
	@Override
	public boolean equals(Object obj) {
		Student5 st =null;
		if(obj instanceof Student5) {
			st =(Student5) obj;
		}
		return (st!=null && name.equals(name) && st.number==number);
	}
}

public class ToStringTest1 {

	public static void main(String[] args) {
		Student5 st1 = new Student5("콩벌레",1);
		Student5 st2 = new Student5("콩순이",1);
		System.out.println("st1.toString() = "+st1); //부모의 toString 메소드가 불려온 것. equals처럼 
		System.out.println(st1);  // 주소 출력
		System.out.println("st2.toString() = "+st2);
		System.out.println(st2); // 주소 출력
	}

}
