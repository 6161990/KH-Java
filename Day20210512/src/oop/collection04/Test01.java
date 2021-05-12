package oop.collection04;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	
	public static void main(String[] args) {
		//Map의 기본사용
		Map<String, Integer> map = new HashMap<>(); 
		//추가하는 메소드 .add()아 아니라! put()
		
		map.put("스위스", 30);
		map.put("알래스카", 365);
		map.put("뉴질랜드", 365*3);
		map.put("대만", 7);
		map.put("노래방", 1);

		System.out.println(map);
		//해당하는 key 값의 value값을 가지고 오는 메소드 
		System.out.println(map.get("뉴질랜드"));
		
		//key에 ??? 이 있습니까?
		//-containsKey()
		
		//value에 ???이 있습니까?
		//-containsValue()
		System.out.println(map.containsKey("일본")); //없음
		System.out.println(map.containsValue(7)); //있음
		
		//int point = map.get("");
		Integer point = map.get("태국");  //null도 빼올 수 있음
		System.out.println(point);
	}
}
