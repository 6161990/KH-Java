package kr.or.kh;

import java.util.Scanner;

public class JuExecuter2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] menu = new int[2][2];
		while(true) {
		System.out.println("주문하시겠어요? y/n");
		menu[0][0]=input.next().charAt(0);
		if(menu[0][0]=='y'||menu[0][0]=='Y') {
			System.out.println("주문선택");
			System.out.println("메뉴 1. 카위 2. 위씨앙로우쓰 3.미씨엔");
			menu[0][1]=input.nextInt();
			if(menu[0][1]==1) {
				System.out.println("구운 생선요리 입니다");
				System.out.println("감자 추가하세요? y/n");
				menu[1][0]= input.next().charAt(0);
				if(menu[1][0]=='y'||menu[1][0]=='Y') {
					System.out.println("네 감자도 구워주세요");
				}else {
					System.out.println("아뇨 고구마요");
				}
			}else if(menu[0][1]==2) {
				System.out.println("오향육입니다");
				System.out.println("꽃빵 같이 드려요? y/n");
				menu[1][0]=input.next().charAt(0);
				if(menu[1][0]=='y'||menu[1][0]=='Y') {
					System.out.println("네 다섯개요");
				}else {
					System.out.println("아뇨 밥주세요");
				}
			}else if(menu[0][1]==3){
				System.out.println("중국식 쌀국수 입니다.");
				System.out.println("맵기정도는요? 1. 보통 2.맵게 3.특라");
				menu[1][1]=input.nextInt();
				if(menu[1][1]==1) {
					System.out.println("걍 주세요");
				}else if(menu[1][1]==2) {
					System.out.println("맵게주세요");
				}else if(menu[1][1]==3) {
					System.out.println("트어 라더");
				}
			}
		}else {
			System.out.println("아뇨 아직이요");
		}

		}
	}
}
