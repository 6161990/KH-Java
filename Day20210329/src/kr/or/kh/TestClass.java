package kr.or.kh;

public class TestClass {

	void instanceMethod(){}		//인스턴스 메소드
	
	static void staticMethod() {}	//static메소드 클래스 메소드
	
	void instanceMethod2(){
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {  //static메소드에서는 static메소드만 호출 할 수 있다. 할당된 메모리 공간이 다름. 
		//instanceMethod(); // 에러 인스턴스 메소드를 호출할 수없다
		staticMethod();
	}
}
