package kr.or.kh;

abstract class AbClass1{
	abstract void abMethod1();
	
}
abstract class AbClass2 extends AbClass1 {
	
	
	/* 숨어있는 부모클래스의 추상 메소드 
	 *  AbClass2() {
		super();
	}*/

	abstract void abMehtod2();
}

class GeneralClass extends AbClass2{

	@Override
	void abMehtod2() {
		System.out.println("abMethod1 수행");		
	}

	@Override
	void abMethod1() {
		System.out.println("abMethod2 수행");
	}
	
}

public class AbstractTest2 {

	public static void main(String[] args) {
		GeneralClass gc = new GeneralClass();
		gc.abMethod1();
		gc.abMehtod2();
	}

}
