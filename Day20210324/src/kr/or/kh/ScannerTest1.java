package kr.or.kh;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("문자열입력:");
		String nextString = input.next();
		System.out.println("입력한 숫자는"+nextString);
		
		System.out.println("숫자를입력:");
		int nextIntNum = input.nextInt();
		System.out.println("입력한 숫자는="+nextIntNum);
	}

}
