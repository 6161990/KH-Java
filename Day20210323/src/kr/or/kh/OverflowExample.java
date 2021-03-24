package kr.or.kh;

public class OverflowExample {

	public static void main(String[] args) {
		//오버플로우 
		
		int x = 1000000;
		int y = 1000000;
		int z = x*y; // 1000000 * 1000000 은 32승 , int 타입에 저장될 수 있는 값의 범위 초과 
		System.out.println(z); //error는 없지만 오버 플로우 발생, 숫자 범위 초과 
		// 올바른 값을 얻기 위해서는 long 으로 타입 변환을 해야한다.
		
		
		
		//long 타입이 두 곳에 붙어야 한다. 고정 한 곳은 최종 연산이 담길 변수 c, 그리고 한 곳은 연산이 있는 곳에 (long) 강제 형변환을 하거나 
		int a = 1000000;
		int b = 1000000;
		long c = (long)a*b;
		System.out.println(c);
		
		//또는 피 연산자 두 개 중 한 개가 long 타입이어야함.
//		int a = 1000000;
//		long b = 1000000; 
//		long c = a*b; //b가 long 타입이니까 산술과정에서 자동 형변환된다. 
//		System.out.println(c);
		
	}

}
