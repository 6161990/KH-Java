package kr.or.kh;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("직급이 어떻게 되세요?");
		String posiiton =input.next();
		switch(posiiton) {
		case "부장" : 
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("200만원");
		}
	}

}
