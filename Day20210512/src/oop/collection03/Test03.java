package oop.collection03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	
	public static void main(String[] args) {
		
		Set<String> lhs = new HashSet<>();	//순서 x
//		Set<String> lhs = new TreeSet<>();	//순서 x
//		Set<String> lhs = new LinkedHashSet<>(); //순서대로 출력
		lhs.add("아이스 아메리카노");
		lhs.add("자바칩 프라푸치노");
		lhs.add("망고바나나");
		lhs.add("스트로베리 피치 프라페");
		lhs.add("블랙 밀크티");
		lhs.add("아이스바닐라라ㄸㅔ");
		
		System.out.println(lhs);
	}

}
