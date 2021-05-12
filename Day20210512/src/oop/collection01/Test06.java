package oop.collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//1. 저장소 2개를 만들어주자
		List<String> names = new ArrayList<>();
		List<String> events = new ArrayList<>();
		
		
		//2.데이터 추가
		Scanner sc = new Scanner(System.in);
		
		//인원수 입력받기
		System.out.println("인원수를 입력하세요");
		int people = sc.nextInt();
		sc.nextLine(); //엔터버리기
		
		//이름 입력받기
		for(int i =0; i<people; i++) {
			System.out.println("이름: ");
			names.add(sc.nextLine());
		}
		
		//항목 입력받기
		for(int i =0; i<people; i++) {
			System.out.println("항목: ");
			events.add(sc.nextLine());
		}
		sc.close();
		
//		names.add("엄태구");
//		names.add("전지현");
//		names.add("송혜교");
//		
//		events.add("밥사라 윤지한테");
//		events.add("집사라 김윤지한테");
//		events.add("차사라 to yoonji");
		
		//3.항목을 섞어봅시다
		Collections.shuffle(events);
		
		//4.출력해봅시다
		for(int i=0; i<people; i++) {
			System.out.println(names.get(i)+"->"+ events.get(i));
		}
	}

}
