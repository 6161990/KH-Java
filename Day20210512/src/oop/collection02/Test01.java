package oop.collection02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

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
		System.out.println("비번을 입력하세요");
		String inputPW = sc.next();
	
		//검증 및 출력 
		for(int i=0; i<member.size(); i++) {
			Member m = member.get(i);
			String id = m.getId();
			String pw = m.getPw();
			if(member.contains(m)) {
				if(id.equals(inputID) && pw.equals(inputPW)) {
					System.out.println("로그인성공");
					break;
				}else {
					System.out.println("로그인 실패");
					continue;
				}
			}else {
				System.out.println("해당하는 아이디가 없습니다.");
			}
		}
		
	}

}
