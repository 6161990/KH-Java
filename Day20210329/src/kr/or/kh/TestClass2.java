package kr.or.kh;

public class TestClass2 {
	int iv;  //인스턴스 변수
 	static int cv;  //클래스 변수
	
	void instanceMethod() {  //인스턴스 메소드에서는 static,인스턴스 변수 다 사용할 수 있다. 
		System.out.println(iv);
		System.out.println(cv);
	}
	static void staticMethod() {  //static메소드에서는 인스턴스 변수를 쓸 수 없다. 
		//System.out.println(iv); //인스턴스 변수는 static메소드에서 사용할 수 없음. 
		System.out.println(cv);
	}
}
