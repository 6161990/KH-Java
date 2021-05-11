package oop.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	
		public static void main(String[] args) {
			//예외처리 try/catch문 
		try {	
			Scanner sc = new Scanner(System.in);
			System.out.println("정산 금액 : ");
			int money = sc.nextInt();
			
			System.out.println("인원 수 : ");
			int people = sc.nextInt();
			
			sc.close();
			
			int pay = money/people;
			int change = money % people;
			
			System.out.println("개인당"+pay);
			System.out.println("잔돈"+change);
		} catch(InputMismatchException e) {
			System.out.println("자료형을 확인하고 제대로 입력해주세요;;");
		}	
			
		}
}
