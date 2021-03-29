package kr.or.kh;

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main:x=" + d.x);
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main:x=" + d.x);
	}
	
	
	//기본형 매개변수 값을 읽기만 할 수 있다. 
	public static void change(int x) {
		x = 1000;
		System.out.println("change(): x="+x);
	}

}
