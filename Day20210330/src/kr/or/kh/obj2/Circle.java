package kr.or.kh.obj2;

//Has-a 관계 (소유, 포함의 관계)
//전체(원)
public class Circle {
	
	Point p;
	int r;
	
	public Circle() {
		p = new Point();
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x=10;
		c.p.y=10;
		c.r=5;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
	}
}
