package oop.collection02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		List<Member> member = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Member a = new Member("admin","admin1234");
		member.add(a);
		member.add(new Member("user1","user1234"));
		member.add(new Member("user2","user123"));
		member.add(new Member("user3","user999"));
		member.add(new Member("student","student123"));
		
		
		System.out.println("아이디를 입력하세요");
		String inputID = sc.next();
		sc.nextLine();
		System.out.println("비번을 입력하세요");
		String inputPW = sc.nextLine(); //next와 nextLine혼용해서 쓸거면 nextLine을 한번 실행해서 엔터를 먹어줘야함
	
		//검증 
		int count=0;
		for(int i=0; i<member.size(); i++) {
			Member m = member.get(i);
			if(member.contains(m)) {
				String id = m.getId();
				String pw = m.getPw();
				if(id.equals(inputID) && pw.equals(inputPW)) {
					count++;
					break;
				}
			}else {
				System.out.println("해당하는 아이디가 없습니다.");
			}
		}
		
		//출력
		if(count>0) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
