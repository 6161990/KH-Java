package kr.or.kh.obj;



public class Child extends Parent {  //확장의 개념 
	protected int height;
	public void childMethod1() {
		System.out.println("자식메소드");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.childMethod1(); //자식의 것
		child.parentMethod1(); //부모의 것
		System.out.println(child.age);  //부모의 것
		System.out.println(child.height); //자식의 것
	}
}
