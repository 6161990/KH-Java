package kr.or.kh;

import java.util.Scanner;

public class MethodTest1 {
	//함수만들기
	public static int displayMenu(){
		Scanner input = new Scanner(System.in);
		System.out.println("1.입력 2.삭제 3. 정렬 4. 종료"); //프로토콜 : 통신규약
		int menu = input.nextInt();
		return menu;   //커피와 자판기 동전 넣으면 제품 돌려주는 것 return
	}	
	public static void main(String[] args) {
	   while(true) {
		switch(displayMenu()) {   //함수 호출  // displayMenu의 return 값이 괄호 안에 들어감 = menu
			case 1:	    //입력
				System.out.println("입력");
				break;  
			
			case 2: 	//삭제
				System.out.println("삭제");
				break;
				
			case 3:		//정렬
				System.out.println("정렬");
				break;
				
			case 4:		//종료
				System.out.println("종료");
				System.exit(0);
				break;
		
		}
	   }
	}

}
