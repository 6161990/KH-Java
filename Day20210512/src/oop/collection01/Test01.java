package oop.collection01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		//List에 대해 알아보자
		//ArrayList와 LinkedList의 차이
		//ArrayList는 붙어있는 배열 형태로 이루어져있다
		//-속도가 빠르다
		//-변경이 불리하다 (데이터를 불러올 일만 있고 변경이 거의 없을 경우 사용)
		
		//LinkedList는 떨어져있지만 연결되어있는 상태
		//-속도가 느리다
		//-변경에 용이하다(데이터가 자주 바뀔 수 있는 상황에 좋다)
		
		
		LinkedList b = new LinkedList();
		List d = new LinkedList();
		
	//	ArrayList a = new ArrayList();
	//	List c = new ArrayList();
	//	List<Object> c = new ArrayList<Object>();
	//	List<Integer> c = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<>(); //가장 기본적인 형태
		
		c.add(10);
		c.add(35);
		c.add(52);
		c.add(1);
	//	c.add("도라에몽");
		
		//인덱스를 통해서 값을 불러올 수 있음
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4)); 
		
		//리스트에 들어있는 데이터의 개수를 알고 싶을 떄 사용하는 메소드 
		System.out.println(c.size());
		
		//리스트에 해당 데이터가 들어있는지 확인하는 메소드
		System.out.println(c.contains(20)); //없음
		System.out.println(c.contains(53)); //없음
		
		//리스트에 해당 데이터가 어디에 있는지 확인하는 메소드
	//	System.out.println(c.indexOf("도라에몽"));
		System.out.println(c.indexOf(66)); //해당 값이 리스트 안에 없을 땐 -1을 반환
		
		//리스트에 해당 데이터 삭제
		System.out.println(c.remove(2)); //52삭제
		System.out.println(c);
		
	}

}
