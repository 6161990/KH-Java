package kr.or.kh;

public class MyMathTest2 {

	public static void main(String[] args) {
		//new 연산자와 관계 없이 클래스 이름으로 직접 호출할 수 있다. 해당 메소드가 static 니까. main이 static이니까 가능
		System.out.println(MyMath2.add(200L,100L));
		
		//인스턴스 메소드 new 연산자에 의해 호출 
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
	}

}
