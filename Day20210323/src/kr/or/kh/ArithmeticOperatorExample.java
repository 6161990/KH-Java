package kr.or.kh;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 =5;
		int v2 =2;
//		int result1 = v1+v2;
//		System.out.println("result1="+result1);
//		
//		int result2 = v1 - v2;
//		System.out.println("result2=" +result2);
//		
//		int result3 = v1 * v2;
//		System.out.println("result3=" +result3);
//		
//		int result4 = v1 / v2;
//		System.out.println("result4=" +result4);
//		
//		int result5 = v1 % v2;
//		System.out.println("result5=" +result5);
	
		//부동 소수점의 오류 
		double result6 = v1/v2; //정확하게 계산되지 않음
		System.out.println("result6=" +result6);
		
		double result7 = (double)v1/v2; //형변환을 해줘야 정확한 계싼
		System.out.println("result7=" +result7);
		//이유 이진 포맷의 가수를 사용하는 모든 부동 소수점 타입은 0.1을 정확히 표현할 수가 없기 때문에
		//0.1f는 근사값으로만 표현된다. 피연산자를 모두 실수 타입으로 강제변환해야한다. 
		//정확하게 계산할 때는 부동 소수점을 사용하지 않는 것이 좋다
		//오버플로우는 다르다. 그건 타입 변환을 해주지 않으면 엉뚱한 값이 나오는 것.
	}

}
