package oop.api;

import java.util.Scanner;

public class BadWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String input = sc.nextLine();
		//이런 시베리아에서 식빵먹을 빠가사리야 족구하지마
		System.out.println(input.replaceAll("[시베리아족구하지마식빵빠가사리머저리]", "*"));
//		System.out.println(input.replaceAll("[족구하지마]", "*"));
//		System.out.println(input.replaceAll("[식빵]", "*"));
//		System.out.println(input.replaceAll("[빠가사리]", "*"));
//		System.out.println(input.replaceAll("[머저리]", "*"));

		
	}
}
