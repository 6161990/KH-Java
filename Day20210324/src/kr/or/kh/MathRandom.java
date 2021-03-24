package kr.or.kh;

public class MathRandom {

	public static void main(String[] args) {
		System.out.println("0.0 <= x < 1.0의 난수발생");
		System.out.println(Math.random());

		
		System.out.println("1~100범위의 난수 발생");
		System.out.println((int)(Math.random()*100)+1);
	}

}
