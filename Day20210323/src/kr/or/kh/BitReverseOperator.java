package kr.or.kh;

public class BitReverseOperator {
	// 비트반전 연산자 이진수 직접 출력해보기 
	public static void main(String[] args) {
		String v1BinaryString = Integer.toBinaryString(8461);
		System.out.println(v1BinaryString);
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length()<32) {
			str = "0"+str;
		}
		return str;
	}
	

}
