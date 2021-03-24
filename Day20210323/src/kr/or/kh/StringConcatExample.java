package kr.or.kh;

public class StringConcatExample {

	public static void main(String[] args) {
		
		//문자열 연산
		String str1 = "JDK"+6.0;
		String str2 = str1+"특징";
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 ="JDK"+3+3.0;
		String str4 = 3+3.0+"JDK";
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
