package kr.or.kh;

import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//					0 1234   0제 1목 2| 3내 4용  => 문자열은 곧 배열이다.
		System.out.println("제목|내용");
		String titleContent= input.next(); //'title|content' 입력
		
		int indexI = titleContent.indexOf("|"); // '|'가 위치한 String 배열의 배열방 번지수를 indexI에 담기
		System.out.println(indexI);
		String title = titleContent.substring(0, indexI); //문자열을 짜르는 함수 subString 
		//0부터 indexI(5)= 5개 까지만 title에 담기
		System.out.println(title);
		String content = titleContent.substring(indexI+1); //indexI(5)+1 = 6, 6번째부터 마지막문자까지 content에 담기
		System.out.println(content);
	}

}
