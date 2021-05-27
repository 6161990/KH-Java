package codingTest;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호는? :");
		String input = sc.nextLine();
		if(input.equals("hello")||input.equals("HELLO")) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("비밀번호 불일치");
		}
	}

}
