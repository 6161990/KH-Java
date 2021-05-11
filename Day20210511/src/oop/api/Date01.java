package oop.api;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		//date를 만들어 다른 클래스와 사용해보자 
		Date a= new Date();
		Format f1 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		Format f2 = new SimpleDateFormat("y년 M월 d일 E요일");
		Format f3 = new SimpleDateFormat("H시 m분");
		Format f4 = new SimpleDateFormat("a h시 m분 s초 SSS");
		
		System.out.println(f1.format(a));
		System.out.println(f2.format(a));
		System.out.println(f3.format(a));
		System.out.println(f4.format(a));
	}

}
