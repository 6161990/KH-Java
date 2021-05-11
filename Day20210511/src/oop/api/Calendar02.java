package oop.api;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		//연도를 2022로 설정
		c.set(Calendar.YEAR, 2022);
		
		//월도 1월로 설정 월은 0부터시작
		c.set(Calendar.MONTH, 0);
		
		c.set(2050, 0, 1);
		
		c.add(Calendar.DATE, 7);
		
		Date a = c.getTime();
		Format f1 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(f1.format(a));
	}

}
