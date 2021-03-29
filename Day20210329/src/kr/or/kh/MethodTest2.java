package kr.or.kh;

public class MethodTest2 {
	
	// 함수의 유형 4가지 
	public static int add(int x, int y) {   //1. return 타입 존재, 파라미터도 존재 o
		int result = x + y;
		return  result;		
	}
	public static int add2() { //2. return 타입 존재, 파라미터 존재 x
		int result = 1+3;
		return result;
	}
	public static void add3(int x, int y) { //3. return 타입 존재 x, 파라미터 존재 o
		int result = x+y;
		System.out.println(result);
	}
	
	public static void add1() {  //4. return 타입 존재 x, 파라미터 존재 x
		int result = 2+5;
		System.out.println(result);
	}

	public static void main(String[] args) {
		int result = add(2,3);
		System.out.println(result);
		
	}
	
	
	
	// 함수의 유형 4가지 
//	1. return 타입 존재, 파라미터도 존재 o
//	2. return 타입 존재, 파라미터 존재 x
//	3. return 타입 존재 x, 파라미터 존재 o
//	4. return 타입 존재 x, 파라미터 존재 x
}
