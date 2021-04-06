package kr.or.kh.obj2;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("1부터 100까지의 난수발생");
		int num = (int) (Math.random()*100)+1;
		System.out.println("1부터 100 사이의 숫자 :"+num);
		
		System.out.println("===============");
		
		System.out.println("1부터 50까지의 난수발생");
		num = (int)(Math.random()*50)+1;
		System.out.println("1부터 50사이의 숫자: "+num);
		
		System.out.println("===============");
		
		System.out.println("1부터20까지의 난수발생");
		num = (int)(Math.random()*20)+1;
		System.out.println("1부터 20 사이의 숫자: "+num);
		
		 	/*1부터 100까지의 난수발생
			1부터 100 사이의 숫자 :90
			===============
			1부터 50까지의 난수발생
			1부터 50사이의 숫자: 14
			===============
			1부터20까지의 난수발생
			1부터 20 사이의 숫자: 13*/
	}

}
