package kr.or.kh;

public class ExceptionTest3 {
	//멀티 예외

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			
			int result = 10 / num;
			System.out.println("result="+result);
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace(); 
			//System.out.println("인자를 하나 입력해주세요");
		} catch (NumberFormatException e) {
			System.out.println("인자를 정수타입으로 입력해주세요");
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안돼요");
		}
		System.out.println("프로그램 계속 실행됨");
	}

}
