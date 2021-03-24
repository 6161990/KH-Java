package kr.or.kh;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "서울";
		String inputString ="";
		do {
			System.out.println("대한민국의 수도를 입력하세요");
			inputString = input.next();
			if(inputString.equals(result)) {
				System.out.println("대한민국의 수도는 "+result+"입니다.");
				break;
			}
			System.out.println("다시 입력해주세요.");
		}while(true) ;
		//false면 do를 한번 실행하고 do안에 인풋 스트링 값 자체를 계속 받지 못함.
		System.out.println("while빠져나옴");
	}

}
