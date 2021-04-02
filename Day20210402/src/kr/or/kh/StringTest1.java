package kr.or.kh;

public class StringTest1 {

	public static void main(String[] args) {
		// 값 대입
		String string1 = "testString";
		String string2 = "testString";
		
		System.out.println(":"+(string1 == string2));
		System.out.println(":"+(string1.equals(string2)));
		
		
		//객체 생성
		String string3 = new String("testString");
		String string4 = new String("testString");
		
		System.out.println(": "+(string3 == string4)); //공간을 따로 만든 것이기 때문에 물리적으로 동일하지 않음
		System.out.println(": "+(string3.equals(string4))); //공간을 따로 만들었찌만 논리적으로는 동일함.
	}

}
