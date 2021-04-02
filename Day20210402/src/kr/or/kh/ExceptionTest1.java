package kr.or.kh;

public class ExceptionTest1 {
//예외 
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = 10/num;
		System.out.println("result="+result);
	}
}
//RuntimeException 이 있느냐 없느냐에 따라, 
//실행할 때 에러가 나냐 //컴파일 할 때 에러가 나냐 