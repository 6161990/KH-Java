package kr.or.kh;

public class ExceptionTest2 {
// 예외 처리 (프로그램 완전히 종료되지 않게)
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result="+result);
		} catch (Exception e) {
			System.out.println("정수를 0으로 나누면안돼요");
		}
		System.out.println("프로그램 계속 실행됨!!!! ");
	}

}
