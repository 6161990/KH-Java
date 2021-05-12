package oop.collection03;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//set으로 집합연산을 해보자
		//집합연산 - 서로 다른 두 집합간의 연산
		//ex. 합집합, 교집합, 차집합
		Set<Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		
		//합집합 : 새로운 Set을 만들어서 a와 b모드를 추가
		Set<Integer> c = new TreeSet<>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
		
		//교집합: 새로운 Set을 만들어서 계산
		Set<Integer> d = new TreeSet<>();
		d.addAll(a);
		d.retainAll(b); //a와 합집합된 d와 b의 교집합 
		System.out.println(d);
		
		//차집합: removeAll
		Set<Integer> e = new TreeSet<>(a); //a룰 추가하면서 e를 생성해라 
		e.removeAll(b);//a를 가진 채로 만든 e에서 b에 포함된 항목을 삭제 
		System.out.println(e);
		e.clear();
		System.out.println(e.isEmpty());
	}
}
