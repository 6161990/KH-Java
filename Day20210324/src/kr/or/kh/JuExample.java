package kr.or.kh;

import java.util.Scanner;

public class JuExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) { //반복문의 시작
			System.out.println("주문하세요y/n");
			char ju = input.next().charAt(0);
			if(ju=='y' || ju=='Y') {
				System.out.println("주문선택");
				System.out.println("메뉴1. 자장면 2. 짬뽕 3.탕수육");
				int menu = input.nextInt();
				if(menu==1) {
					System.out.println("자장면선택");
					System.out.println("자장면곱배기? y/n");
					char gob = input.next().charAt(0);
					if(gob=='y'||gob=='Y') {
						System.out.println("자장면 곱배기 선택");
					}else {
						System.out.println("자장면보통선택");
					}
				}
				else if(menu==2) {
					System.out.println("짬뽕선택");
					System.out.println("짬뽕곱배기선택 y/n");
					char gob = input.next().charAt(0);
					if(gob=='y'||gob=='Y') {
						System.out.println("짬뽕 곱배기선택");
					}else {
						System.out.println("짬뽕보통선택");
					}
				}
				else if(menu==3) {
					System.out.println("탕수육선택");
					System.out.println("탕수육 1.대 2.중 3.소y");
					int tang = input.nextInt();
					if(tang==1) {
						System.out.println("탕수육 대자");
					}else if(tang==2) {
						System.out.println("탕수육 중자");
					} else if(tang==3) {
						System.out.println("탕수육 소자");
					}
				}else {
					System.out.println("1,2,3 중에 선택하세요");
				}
			  }else {
					System.out.println("주문취소");
					System.exit(0);
					
				}	
			}// 반복문의 끝
		}
	}


