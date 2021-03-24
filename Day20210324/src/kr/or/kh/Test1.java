package kr.or.kh;

public class Test1 { 

	public static void main(String[] args) {
		//비교 연산자에서도 연산을 수행하기 전에 타입변환을 통해 피연산자의 타입을 일치시킴
		
		//A가 int 타입으로 변환 후 비교
		System.out.println('A'==65);
		
		//int 타입이 double 타입으로 변환 후 비교
		System.out.println(3==3.0);
		
		//에러. 부동소수점 타입은 0.1을 정확히 표현할 수 없다 근사값으로 표현됨.
		//0.1f는 0.1보다 큰 값이 되어버림. 피연산자를 모두 float 타입으로 강제 변환 하든지 
		// 정수로 변환해서 비교해야한다. 
		//클래스 CompareOperatorExample2 참조 
		System.out.println(0.1==0.1f);
		
		
	}
 
}
