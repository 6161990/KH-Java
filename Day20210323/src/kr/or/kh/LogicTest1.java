package kr.or.kh;

import java.util.Scanner;

public class LogicTest1 {

	public static void main(String[] args) {
		//문법 - 구조 - 흐름(생각-순서) 
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("당신은 우등생입니다.");
		} else if(score >= 50) {
			System.out.println("화이팅! 우리는 할 수 있습니다!");
		}
		
		
	}

}
