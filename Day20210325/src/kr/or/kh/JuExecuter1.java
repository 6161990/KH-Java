package kr.or.kh;

import java.util.Scanner;

public class JuExecuter1 {

	public static void main(String[] args) {
		String[] ju = new String[2]; //원래는 char == 로 구현 
 		int[] menu =new int[2];
		Scanner input = new Scanner(System.in);
 		while(true){
 		System.out.println("주문 하시나요? y/n");
		ju[0] = input.next();
		if(ju[0].equals("yes")|| ju[0].equals("y")) {
			System.out.println("예 주문 좀 할게요");
			System.out.println("1. 일본식 2. 인도식 3. 오뚜기식 있습니다");
			menu[0] = input.nextInt();
			if(menu[0]==1) {
				System.out.println("일본식으로 할까요?");
				System.out.println("우쥬라이크 스파이시? y/n");
				ju[1]=input.next();
				if(ju[1].equals("yes")||ju[1].equals("y")) {
					System.out.println("i like spicy");
				}else {
					System.out.println("no!! i dont like lamb");
				}
			} else if(menu[0]==2) {
				System.out.println("인도인도인도카레양");
				System.out.println("난도 같이할래요? y/n");
				ju[1]= input.next();
				if(ju[1].equals("yes")||ju[1].equals("y")) {
					System.out.println("yes, please too");
				}else {
					System.out.println("i don't want it");
				}
			}else if(menu[0]==3) {
				System.out.println("오뚜기 삼분요리");
				System.out.println("오뚜기 말고 1. 카레여왕 2. 커리샵 3. 왕카레있어요");
				menu[1]= input.nextInt();
				if(menu[1]==1) {
					System.out.println("카레는 여왕이죠");
				}else if(menu[1]==2) {
					System.out.println("커리샵 시도해볼게요");
				}else if(menu[1]==3) {
					System.out.println("큰 거 큰거 왕카레요");
				}
				
			}
		}else {
			System.out.println("아뇨 사람이 오면요.");
		}
 		}
	}
}
