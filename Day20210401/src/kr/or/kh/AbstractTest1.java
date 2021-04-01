package kr.or.kh;


abstract class AbstractClass{
	//변수 선언
	int age;
	
	public void generalMethod() { //완전한메소드
		System.out.println("일반 메소드");
	}
	abstract void abstractMethod(); //불완전한메소드
}

class AbstractChildClass extends AbstractClass {

	/* 숨어있는 부모 클래스의 메서드 super는 늘 숨어있다.
	 * public AbstractChildClass() {
		super();
	}*/ 

	@Override
	void abstractMethod() {
		System.out.println("추상메소드구현");
	}
	
}

public class AbstractTest1 {

	public static void main(String[] args) {
	//	AbstrctClass ac = new AbstractClass(); 추상클래스는 객체생성불가
		AbstractChildClass acc = new AbstractChildClass();	
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	
	}

	

}
