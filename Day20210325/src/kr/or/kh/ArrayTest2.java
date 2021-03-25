package kr.or.kh;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrayNumber = new int[3];
		String[] names = new String[3];
		
		for(int i=0; i<arrayNumber.length; i++) {
			System.out.println("휴대폰번호 입력:");
			arrayNumber[i]=input.nextInt();
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름 입력:");
			names[i]=input.next();
		}
//		arrayNumber[0] = 10;
//		arrayNumber[1] = 20;
//		arrayNumber[2] = 30;
//		names[0]="오늘점심은";
//		names[1]="냉모밀과";
//		names[2]="돈까스 카레";
//		
		for(int i=0; i<arrayNumber.length; i++) {
			System.out.println(arrayNumber[i]);
			System.out.println(names[i]);
		}
	}

}
