package kr.or.kh;

public class StringTest2 {
	//String 클래스의 불변성
	// 기존 문자열을 변경하면 기존의 문자열이 동적으로 변경되는 것이 아니고 새로운 문자열이 생성하게 된다. 
	
	public static void main(String[] args) {
		String originalString = new String("java");
		String lastString = originalString.concat("fighting"); 

		System.out.println(originalString);
		System.out.println(lastString);
		System.out.println(originalString==lastString);
		
		
	}
}
