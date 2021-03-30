package kr.or.kh.obj6;

//super. 의 용도 

class Sawon3{
	protected String name;
	public Sawon3() {
		name="super super";
	}
}

class Sales3 extends Sawon3{
	protected String name;
	public Sales3() {
		name="this this";
	}
	public String displayInfoLocal() {
		String name = "첫째 나는야 명탐정코난";
		return name;
	}
	public String displayInfoThis() {
		String name="둘째 레미레미도레미";
		return this.name;
	}
	public String displayInfoSuper() {
		String name="셋째 솔라솔라솔라시";
		return super.name;
	}
}

public class SuperVariableTest {
	
	public static void main(String[] args) {
		Sales3 sales3 = new Sales3();
		System.out.println("local.name="+sales3.displayInfoLocal());  
		System.out.println("this.name="+sales3.displayInfoThis());  //둘째 레미레미 도레미가 아니라 자기 자신 클래스 안에 있는 변수 "this this"가 나옴
		System.out.println("super.name="+sales3.displayInfoSuper()); //셋째 솔라솔라솔라시가 아니라 super 클래스 안에 1이 나옴
	}

}
