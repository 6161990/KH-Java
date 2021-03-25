package kr.or.kh;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("--------");
				System.out.println("1. 중속 | 2. 감속 | 3. 중지");
				System.out.println("---------");
				System.out.println("선택:");	
			}
			try {
				keyCode=System.in.read();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(keyCode==49) { //키보드에서 숫자 0은 48코드를 가지고 있다.
				speed++;
				System.out.println("현재 속도="+speed);
			}else if(keyCode==50) {
				speed--;
				System.out.println("현재 속도="+speed);
			}else if(keyCode==51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
