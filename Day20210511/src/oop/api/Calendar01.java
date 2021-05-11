package oop.api;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		//int year = c.get(1); //숫자로 기억하기가 힘들다. 상수를 사용한다
		int year = c.get(Calendar.YEAR);
		System.out.println("year = "+ year);
		
		//캘린더는 month를 0부터 11까지로 표현한다. 12가 1년의 개월수라는 의미로 사용되기때문에 이렇게 만들었다
		int month = c.get(Calendar.MONTH)+1; //+1해줘야 현재 월이 나온다 
		System.out.println("month = "+month);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day = "+day);
		
		int hour = c.get(Calendar.HOUR);
		System.out.println("hour = "+hour);
		
		int hour1=c.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour1 = "+hour1);//24시기준 

		int minute = c.get(Calendar.MINUTE);
		System.out.println("minute = "+minute);
		
		int second = c.get(Calendar.SECOND);
		System.out.println("second = "+second);
		
		//요일이 숫자로 나옴(일요일 =1)
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("week = "+week);
	}

}
