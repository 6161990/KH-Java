package kr.or.kh;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 단항 연산자 (싱글 부호 연산자와 증감,감소 연산자)
		int z = 1;
		int y = 1;
		int result1 = ++z +10; // 2 + 10
		int result2 = y++ +10; // 1 + 10
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(y); // y는 여기서 ++이 된다. 
		
//		int x = -100;
//		int result1 = +x;
//		int result2 = -x;
//		System.out.println("result1="+result1);
//		System.out.println("result2="+result2);
//		short s= 100;
//		//short result3 = -s; 컴파일 에러 
//		int result3 = -s;
//		System.out.println("result3"+result3);
		
		short s = 100;
		int result = -s;  //long 타입을 제외한 정수의 산술연산은 무조건 int로 형변환을 한 후 산술 연산되기 때문에 int 타입변수에 산출값을 대입해야한다.
		System.out.println(result);
		
		int x = -100;
		
		byte v1 = 10;
		int v2 = -v1 + 1;
		System.out.println(v2);
	}

}
