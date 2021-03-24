package kr.or.kh;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//math.random 으로 숫자 무작위. 소수점은 안되니까 (int)형변환 0~99니까 +1
		int randomNumber = (int)(Math.random()*100)+1;
		int inputNumber = 0;
		
		do {
			System.out.println("숫자를 입력하세요");
			inputNumber = input.nextInt();
			if(inputNumber==randomNumber) {
				System.out.println("맞혔습니다.");
				break;
			}else if(inputNumber<randomNumber) {
				System.out.println("숫자가 너무 작아요");
			}else {
				System.out.println("숫자가 너무커요.");
			}
	  }while(true);
		//false면 do는 한번실행됨.
	}
}

