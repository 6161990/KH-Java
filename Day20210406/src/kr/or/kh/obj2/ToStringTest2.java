package kr.or.kh.obj2;


class Student7 extends Object{
	String name;
	int number;
	
	public Student7 (String name, int number) {
		super();
		this.name=name;
		this.number=number;
	}
	@Override
	public boolean equals(Object obj) {
		Student7 st = null;
		if(obj instanceof Student7) {
			st = (Student7) obj;
		}
		return (st!=null && name.equals(name)&& st.number==number);
	}
	@Override
	public String toString() {
		return "이름: "+name+", 숫자:"+number;
	}
	
}

public class ToStringTest2 {

	public static void main(String[] args) {
		Student7 st1 = new Student7("팡이",1);
		Student7 st2 = new Student7("곰",1);
		System.out.println("st1.toString()"); //부모의 메소드를 재정의했기때문에 문자열이 나옴
		System.out.println(st1);//오버라이딩 덕분에 문자열이 나옴
		System.out.println("st2.toString()");
		System.out.println(st2);//오버라이딩 덕분에 문자열이 나옴
		
	}

}
