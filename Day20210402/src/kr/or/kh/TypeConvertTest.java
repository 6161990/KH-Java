package kr.or.kh;

public class TypeConvertTest {

	public static void main(String[] args) {
		int num1 = 3;
		String num2 = "4";
		System.out.println(":"+(num1+num2)); //연산이아니라 걍 3과 4의 결합이됨
		
		int intNum = Integer.parseInt(num2); //타입변환 후 ,
		System.out.println(num1+intNum); // 연산됨  :7
		
		String numStr = "3.11";
		System.out.println(":"+(num1+numStr)); //걍 결합
		
		double numDouble = Double.parseDouble(numStr); // 문자열 안에 있는 것을 기본형으로 끄집어내기
		System.out.println(":"+(num1+numDouble)); // 연산됨
	}

}
