package kr.or.kh.obj3;

public class Circle extends Point2D {
	protected double r;
	
	public Circle() {
		super();
		r=0.0;
	}
	public Circle (int x, int y, double r) {
		super(x,y);
		this.r=r;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " + Circle [r=" + r + "]";
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.toString());
		
		Circle circle1 = new Circle(20,10,3.14);
		System.out.println(circle1.toString());
		
	}

}
