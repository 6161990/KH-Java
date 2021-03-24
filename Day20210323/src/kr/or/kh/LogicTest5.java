package kr.or.kh;

public class LogicTest5 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		String operation = args[1];
		int num2 = Integer.parseInt(args[2]);
		
		
		int result = 0;
		
		if(operation.equals("+")) {
			result = num1 + num2;
		}else if(operation.equals("-")) {
			result = num1 - num2;
		}else if(operation.equals("*") || operation.equals("x")) {
			result = num1 * num2;
		}else if(operation.equals("/")) {
			result = num1 / num2;
		}else if(operation.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("+,-,*,/,% 중에 입력하세요.");
		}
		System.out.println(num1 + operation + num2+ "="+ result);
	}

}
