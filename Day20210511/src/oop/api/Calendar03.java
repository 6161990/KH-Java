package oop.api;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar03 {
	//수료일이 2021년 9월 3일 입니다.
	//현재날로부터 디데이와 
	//D-77 이 되는 날짜를 계산하여 출력
	//결과 값이 네이버 디데이 계산기처럼 나와야함
	
	public static int getDday(int year, int month, int day) {
		
		Calendar today = Calendar.getInstance();
		Calendar targetDate = Calendar.getInstance();
		targetDate.set(year,month,day);
		
		long l_targetDate = targetDate.getTimeInMillis() /(24*60*60*1000);
		long l_today = today.getTimeInMillis() /(24*60*60*1000);
		
		long substract = l_today - l_targetDate;
		return (int)substract;
		
	}
	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 9-1, 3);
		c.add(Calendar.DATE, -77);
		Date a = c.getTime();
		Format f1 = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println("D-77일이 되는 날 "+ f1.format(a));
		
		System.out.println("9월 3일까지 D-Day "+getDday(2021,9-1,3));
	

		
		
	}
}
