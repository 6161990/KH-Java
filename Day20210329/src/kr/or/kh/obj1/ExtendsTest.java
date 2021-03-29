package kr.or.kh.obj1;


class Parent{
	protected int parentVar;
	public Parent() {
		parentVar=10;
	}
	public void parentMethod() {
		System.out.println("parent Method...");
	}
}
class Child extends Parent{
	protected int childVar;
	public Child() {
		childVar=20;
	}
	public void childMethod() {
		System.out.println("child Method...");
	}
}


public class ExtendsTest {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("child.parentVar+"+child.parentVar);
		System.out.println("child.childVar+"+child.childVar);
	}

}
