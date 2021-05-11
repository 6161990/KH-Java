package oop.api;

import java.util.Scanner;

public class BadWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String input = sc.nextLine();
		//이런 시베리아에서 식빵먹을 빠가사리야 족구하지마
		sc.close();



		
		String[] filter = new String[] {"시베리아","족구하지마","식빵","주옥","빠가사리","머저리"};
		
		for(int i=0; i<filter.length; i++) {
			int sl= filter[i].length();
			input = input.replace(filter[i], Star.star(sl));
		}
		
		System.out.println(input);
		
//		System.out.println(input.replaceAll("[시베리아족구하지마식빵빠가사리머저리]", "*"));		
	}
}
