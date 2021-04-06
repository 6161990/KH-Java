package kr.or.kh.obj2;


class Student4 extends Object{
	String name;
	int number;
	
	public Student4(String name, int number) {
		super();
		this.name=name;
		this.number=number;
	}
	@Override
	public boolean equals(Object obj) {
		Student4 st = null;
		if(obj instanceof Student4) {
			st = (Student4) obj;
		}
		return (st !=null && st.name.equals(name)&& st.number==number);
	}
}
public class EqualsTest2 {

	
	public static void main(String[] args) {
		Student4 st1 = new Student4("콩순이",1);
		Student4 st2 = new Student4("콩순이",1);
		System.out.println("단순 비교 ==");
		System.out.println("st1==st2: "+(st1==st2));
		System.out.println("equals 비교");
		System.out.println("st1.equals(st2) : "+(st1.equals(st2)));
	
		String st3="abc";
		String st4="abc";
		String st5= new String("바보");
		String st6= new String("바보");
		System.out.println("st3==st4: "+(st3==st4));
		System.out.println("st3.equals(st4) : "+(st3.equals(st4)));
		System.out.println("st5==st6: "+(st5==st6)); //false
		System.out.println("st5.equals(st6) : "+(st5.equals(st6))); //true
		
	}

}
