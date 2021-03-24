package kr.or.kh;

import java.util.Scanner;

public class JuExample1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) { //반복문시작
		System.out.println("주문 준비되셨나요??? y/n");
		char ju = input.next().charAt(0);
	   	 if(ju=='y'||ju=='Y') {
			System.out.println("네 주문할게요");
			System.out.println("메뉴 1. 덤플링 2. 중국식 탕수육 3. 일본식 라멘 4.메뉴판 다시 살펴보기");
			int menu = input.nextInt();
			if(menu==1) {
				System.out.println("네 덤플링이요");
			} else if(menu==2) {
				System.out.println("중국식 탕수육은 품절이에요");
			} else if(menu==3) {
				System.out.println("좀 매운데 괜찮으세요?");
			}else if(menu == 4) {
				System.out.println("아 어렵네요, 좀 더 생각해볼게요");
				continue;
			}
	   	 }else {
	   		System.out.println("아뇨 사람이 오면요");
	   	  }
		}//while 끝
	}

}
