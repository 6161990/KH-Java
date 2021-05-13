package oop.collection01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		//저장소생성
		Map<String, String> db = new HashMap<>();
		
		//데이터 추가
		Member a = new Member("user","user123");
		Member b = new Member("master","master123");
		Member c = new Member("admin","admin");
		Member d = new Member("tester","tester123");
		Member e = new Member("manager","manager");
		
		db.put(a.getId(),a.getPw());
		db.put(b.getId(),b.getPw());
		db.put(c.getId(),c.getPw());
		db.put(d.getId(),d.getPw());
		db.put(e.getId(),e.getPw());
	
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String userId = sc.next();
		sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String uesrPw = sc.nextLine();
		sc.close();
		
		Set<String> set  = db.keySet(); //map에 있는 key값을 set형태로 바꿔준다
		
		for(String key : set) { //map에 있는 해당 key에 value값을 가져온다
			String value = db.get(key);
			System.out.println("key: "+key+", value: "+value);
		}
		
		if(db.containsKey(userId)) {
			System.out.println("이미 사용중인 아이디 입니다.");
		}else {
			db.put(userId, uesrPw);
			System.out.println("환영합니다. "+userId+"님 회원가입이 완료되었습니다.");
		}
	}
}
