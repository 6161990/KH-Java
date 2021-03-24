package kr.or.kh;

public class InputDataCheckNanExample {

	public static void main(String[] args) {
		// 0이 정수일 경우,
//		int x = 5; 
//		int y = 0;
//		try {
//			int z = x/y;
//			System.out.println("z="+z);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없음");
//			//e.printStackTrace();
//		}
//		System.out.println("프로그램은 실행상태입니다."); //try-catch가 없으면 출력 없이 프로그램 바로 종료
	
		
		//0이 실수일 경우 = 0.0, 예외 발생하지 않고 값이 이상하게 연산된다.
		//   5/0.0 -> Infinity(무한대)
		//   5%0.0 -> NaN(Not a Number)
		
		//이를 확인하려면 Double.isInfinite(z), Double.isNaN 메소드를 이용하면된다
		
		int a = 5; 
		double b = 0;
		double c = a/b;
		System.out.println(Double.isInfinite(c));
		System.out.println(Double.isNaN(c));
		System.out.println(c+2); //인피니트거나 nan 이면, 어떤 값(2던지 2억이던지간에)을 연산하더라도(nan은 산술연산이 가능하기때문에 오류안나옴) 결과는 인피니트/nan으로 나오므로. 
								//-> 부동 소수점(실수)를 입력받을 때 nan과 인피니트를 반드시 검사해야하는 이유. 에러는 없지만 다른 값들이 다 인피니트/nan이 되기 때문에 
		if(Double.isInfinite(c)||Double.isNaN(c)) { //연산의 결과가 인피니트 또는 nan이면 절대로 연산을 수행하지 못하도록 if문을 사용해서 실행흐름을 변경해야한다.
			System.out.println("값 산출불가");
		}else {
			System.out.println(c+2);
		}
	}

}
