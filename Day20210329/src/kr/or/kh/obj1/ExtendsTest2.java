package kr.or.kh.obj1;

class Super{
	protected int x;
	public Super() {
		x=30;
	}
	public void superMethod() {
		System.out.println("super Method...");
	}
}

class Sub extends Super {
	protected int y;
	public Sub() {
		//x=4000;
		y=40;
	}
	public void setMethod() {
		System.out.println("sub Method...");
	}
}
class SubSub extends Sub{
	protected int z;
	public SubSub() {
		z=50;
	}
	public void setSubMethod() {
		System.out.println("sub sub Method");
	}
}

public class ExtendsTest2 {

	public static void main(String[] args) {
		SubSub ss = new SubSub();
		System.out.println(ss.x);
		System.out.println(ss.y);
		System.out.println(ss.z);
		ss.superMethod();
		ss.setMethod();
		ss.setSubMethod();
	}

}
