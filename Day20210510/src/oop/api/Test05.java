package oop.api;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("닉네임을 입력하세요");
		String nicName=sc.next();
		
//		if(!(nicName.contains("운영자"))) {
//			if(nicName.length()>2 && nicName.length()<=10) {
//				char temp = nicName.charAt(0);
//				if(Character.isDigit(temp) == false) {
//					System.out.println("닉네임이 등록되었습니다.");
//				}else{
//					System.out.println("닉네임등록 실패");
//				}
//			}else {
//				System.out.println("닉네임등록 실패");
//			}
//		}else {
//			System.out.println("닉네임등록 실패");
//		}
		
		boolean one = !(nicName.contains("운영자"));
		boolean two = nicName.length()>2 && nicName.length()<=10;
		char temp = nicName.charAt(0);
		boolean three = !(Character.isDigit(temp));
		// 또는 boolean three = !(nickName.charAt(0) >= '0' && nickName.charAt(0) <=9);
		if(one && two && three) {
			System.out.println("닉네임이 등록되었습니다.");
		}else {
			System.out.println("닉네임등록실패");
		}
	}

}
