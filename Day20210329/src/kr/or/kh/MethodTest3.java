package kr.or.kh;

public class MethodTest3 {
	static boolean power;   //변수도 static   // boolean의 초기값은 false;
	public static void power() {  //메소드가 static이니 , 
		power = ! power;
		System.out.println(power);
	}
	public static void main(String[] args) {
		power();
	}

}
