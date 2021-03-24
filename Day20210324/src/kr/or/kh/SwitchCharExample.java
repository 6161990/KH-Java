package kr.or.kh;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("회원 번호 첫번쨰 자리를 입력하세요. 번호가 없으면 c를 입력하세요");
		char grade = input.next().charAt(0);
		switch(grade) {
		case 'A' : case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' : case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");
		}
	}

}
