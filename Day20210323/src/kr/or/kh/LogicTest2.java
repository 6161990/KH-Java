package kr.or.kh;

import java.util.Scanner;

public class LogicTest2 {

	public static void main(String[] args) {
		//run > run configuration > main 패키지, 클래스 확인하고 > argument 2021 입력 >
		// args[0]에 "2021"을 입력하게 된 것임.
		int year = Integer.parseInt(args[0]); // 메인 진입점 직접처리
		boolean result = false;
		result = (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0));
			if(result) {
				System.out.println("입력하신 년도 "+year+" 은 윤년입니다.");
			}else {
				System.out.println("입력하신 년도 "+year+" 은 평년입니다.");
				}
		}
		
		
		
		
//		Scanner scanner = new Scanner (System.in);
//		int year = scanner.nextInt();
//		if(year % 4 ==0 && (year % 100 !=0 || year % 400 == 0)) {
//			System.out.println("입력하신 년도 "+year+" 은 윤년입니다.");
//		}else {
//			System.out.println("입력하신 년도 "+year+" 은 평년입니다.");
//		}
}
	
	


