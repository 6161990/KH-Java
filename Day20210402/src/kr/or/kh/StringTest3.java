package kr.or.kh;

public class StringTest3 {

	public static void main(String[] args) {
		//StringBuffer 클래스 
		//메모리상에 문자열을 동적으로 변경하려면 StringBuffer클래스를 사용하면된다.
		//불변성이 없으므로 메소드를 이용해서 문자열을 변경하면 메모리상에서 문자열이 동적으로 변경된다. 
			
			StringBuffer sb = new StringBuffer("Java");
			StringBuffer sb2 = sb.append("fighting");
			System.out.println(": "+(sb==sb2));
			

	}

}
