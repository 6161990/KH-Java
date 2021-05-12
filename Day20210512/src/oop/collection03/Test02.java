package oop.collection03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	
	public static void main(String[] args) {
		Set<String> snack = new TreeSet<>();
		snack.add("홈런볼");
		snack.add("빈츠");
		snack.add("꼬북칩");
		snack.add("눈을감자");
		snack.add("프링글스");
		
		System.out.println(snack);
		
		//Iterator를 사용해서 데이터를 꺼내보자
		Iterator<String> iter = snack.iterator();
		
		while(iter.hasNext()) {
			String cookie = iter.next();
			System.out.println(cookie.length());
		}
		for(String cookie : snack) {
			System.out.println(cookie);
		}
		
	}

}
