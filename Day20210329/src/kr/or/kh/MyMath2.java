package kr.or.kh;

public class MyMath2 {

	long a,b;
	
	long add(){  //인스턴스 메소드 new 연산자에 의해 호출 
		return a+b;
	}
	static long add(long a, long b) { //new 연산자와 관계 없이 클래스 이름으로 직접 호출할 수 있다. 
	return a+b;
	}
}
