package kr.or.kh;

public class SwitchTest2 {

	public static void main(String[] args) {
		String operator = args[0];
		switch(operator) {
		case "+" : case "-" : // if와 다르게 {}가 없으니까 연달아 'case :' 로 구현가능 
			System.out.println("덧셈과");
			System.out.println("뺄셈");
			break;
		case "x" : case "X" :
			System.out.println("곱셉");
			break;
		case "/" :
			System.out.println("나눗셈");
			break;
		case "%" :
			System.out.println("나머지");
			break;
		default : 
			System.out.println("연산자가 없습니다.");
		}// 스위치의 끝
	}

}
