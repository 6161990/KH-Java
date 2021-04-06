package kr.or.kh.obj2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {

	public static void main(String[] args) {
		//직접 날짜 출력하고 싶을 때 
		Calendar myCalendar = Calendar.getInstance(); //static메서드 new없이 인스턴스 생성할 때 쓰임		
		
		//직접 날짜입력 (내가 입력한 날, 시간을 쓰고 싶을 때)
		myCalendar.set(Calendar.YEAR,2021);
		myCalendar.set(Calendar.MONTH,3); //0월 부터계산되니까.
		myCalendar.set(Calendar.DAY_OF_MONTH,6);
		myCalendar.set(Calendar.HOUR_OF_DAY,10);
		myCalendar.set(Calendar.MINUTE, 14);
		myCalendar.set(Calendar.SECOND, 2);
		
		//출력 형식의 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //데이트 포맷 방식 1
		Date date = myCalendar.getTime(); //직접 입력한 날짜를 date에 넣기 
		DateFormat df = DateFormat.getDateTimeInstance(); //데이트 포맷 방식 2
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
		
		/*2021-04-06 10:14:02
		  2021. 4. 6. 오전 10:14:02*/
		
		System.out.println("======================");
		
		//현재 시간 가져오는 것 
		Date date1 = new Date(); //Date  객체 생성
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat df2 = DateFormat.getDateTimeInstance();
		System.out.println(sdf2.format(date1));
		System.out.println(df2.format(date1));
		
		/*2021-04-06 13:53:28
		  2021. 4. 6. 오후 1:53:28*/
		
	}

}
