package kr.or.kh;

import java.util.Scanner;

public class JazzangSearchMain {

	public static void main(String[] args) {
		JazzangProcess sv = new JazzangProcess();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("검색할 상품을 입력하세요:");
			String name = input.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult)  break;
			System.out.println("해당 상품이 없습니다.");
		}while(true);
			

	}

}
