package codingTest;

import java.util.Calendar;
import java.util.Scanner;

public class TodayIs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 몇월 몇일 입니까?");
		String input="";
		System.out.println("몇 월?");
		int inputMonth = Integer.parseInt(sc.nextLine()); //int값만 받을 수 있도록 
		System.out.println("몇 일?");
		int inputDay = Integer.parseInt(sc.nextLine());
		
		Calendar today = Calendar.getInstance();
		int realMonth = today.get(Calendar.MONTH) + 1;
		int realDay = today.get(Calendar.DAY_OF_MONTH);
		
		if(inputMonth == realMonth || inputDay == realDay) {
			System.out.println("오늘 날짜 ");
			System.out.println(inputMonth+"월 "+inputDay+"일 입니다.");
		}else {
			System.out.println("날짜를 잘못 입력하셨습니다.");
		}
		
		
	}

}
