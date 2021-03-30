package kh.or.kh.obj1;

import java.util.Scanner;

public class ChinaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SeoulChina sc = new SeoulChina();
		SeongnamChina snc = new SeongnamChina();
		
		while(true) {
			System.out.println("1. 서울차이나 2. 성남차이나");
			int number = input.nextInt();
			if(number==1) {

				System.out.println("짜장면 가격");
				int jazzang = input.nextInt();
				System.out.println("짬뽕 가격");
				int jambong = input.nextInt();
				System.out.println("탕수육 가격");
				int tang = input.nextInt();
				System.out.println("쟁반짜장가격");
				int jangban = input.nextInt();
				
				//객체 가져오기
				sc.setJazzang(jazzang);   
				sc.setJambong(jambong);
				sc.setTang(tang);
				sc.setJangban(jangban);
				
				System.out.println(sc.toString());
			}else if(number==2) {
				System.out.println("짜장면 가격");
				int jazzang = input.nextInt();
				System.out.println("짬뽕 가격");
				int jambong = input.nextInt();
				System.out.println("탕수육 가격");
				int tang = input.nextInt();
				System.out.println("삼선짬뽕가격");
				int samseonJambong = input.nextInt();
				
				//객체 가져오기
				snc.setJazzang(jazzang);  
				snc.setJambong(jambong);
				snc.setTang(tang);
				snc.setSamseonJambong(samseonJambong);
				
				System.out.println(snc.toString());
				
			}else {
				System.out.println("1. 서울 차이나와 2.성남 차이나 중에 입력하세요");
			}
		}
		
	}

}
