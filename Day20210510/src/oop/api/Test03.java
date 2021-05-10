package oop.api;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String id = new String ("admin");
		String password = new String("teset2345");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String userId = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String userPw = sc.next();
		sc.close();
		
		//로그인을 성공하려면 아이디와 비밀번호가 일치해야 합니다.
		if(userId.equals(id) && userPw.equals(password)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
