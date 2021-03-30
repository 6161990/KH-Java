package kr.or.kh.obj3;

import java.util.Arrays;

public class Triangle extends Point2D {
	
	protected Point2D[] point;
	
	public Triangle() {
		point = new Point2D[3];
		point[0] = new Point2D(10,20);
		point[1] = new Point2D(70,20);
		point[2] = new Point2D(50,20);
	}
	
	public Triangle(Point2D[] p) {
		this.point=p;
	}

	@Override
	public String toString() {
		return point[0].x+":"+point[0].y+":"+point[1].x+":"+point[1].y+":"+point[2].x+":"+point[2].y;
		
	}
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.toString());
	}
	
	
	
}
