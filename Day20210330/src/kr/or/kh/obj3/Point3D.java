package kr.or.kh.obj3;

public class Point3D extends Point2D {
	protected int z;
	
	public Point3D() {
		super();
		z=0;  //컴파일러가 스스로 코딩하는 부분 
	}
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	@Override
	public String toString() {
		return super.toString()+ " + Point3D [z=" + z + "]";
	}
	public static void main(String[] args) {
		Point3D point3D = new Point3D();
		System.out.println(point3D.toString());
		
		Point3D point3D1 = new Point3D(10,30,50);
		System.out.println(point3D1.toString());
	}
	
	
	
}
