package oob;

public class StringObjectTest {

	public static void main(String[] args) {
		char c = "Hello.".charAt(1); //첫번째 문자는 charAt(0)
		System.out.println("Hello.의 두번째문자: "+c);
		char d = "Hello.".charAt(5);
		System.out.println("Hello.의 마지막문자: "+d);
		
		String s2 = "Hello.".toLowerCase();
		System.out.println("Hello.를 소문자로 "+s2);
		
		String s3 = "Hello.".toUpperCase();
		System.out.println("Hello.를 대문자로 "+s3);
		
	}

}
