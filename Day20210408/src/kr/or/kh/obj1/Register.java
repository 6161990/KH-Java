package kr.or.kh.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {

	private int cnt;
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private String part;
	
	
	public static Scanner input;
	public static ArrayList<HashMap<String, String>> haksaList;
	
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();
	}
	
	public Register() {} //생성자 함수
	
	
	public void register() {

		System.out.println("등록");
		System.out.println("======메뉴 선택======");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.println("번호를 선택해주세요...");
		cnt=input.nextInt();
		if( cnt < 0 || cnt > 4 ) {
			System.out.println("음수이거나 4 이상이면 에러입니다. 메뉴 중에 선택하세요.");
		}
		if(cnt==1) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("학번: ");
			studentNum = input.next();
			if( studentNum == null || studentNum == "") {
				System.out.println("학번이 null이거나 공백입니다.");
			}
			haksaHash.put("age", age);   //put 등록 
			haksaHash.put("name", name);
			haksaHash.put("studentNum", studentNum);
			haksaHash.put("object", "학생");
			haksaList.add(haksaHash); //배열(haksaList)에 넣기
			System.out.println(name+"님이 [학생부]에 등록되었습니다.");

		}else if(cnt==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 과목: ");
			subject = input.next();
			if( subject == null || subject == "") {
				System.out.println("담당과목이 null이거나 공백입니다.");
			}
			haksaHash.put("age", age);
			haksaHash.put("name", name);
			haksaHash.put("subject", subject);
			haksaHash.put("object", "교수");
			haksaList.add(haksaHash);
			System.out.println(name+"님이 담당 과목 ["+ subject+"]로 교수진에 등록되었습니다.");

		}else if(cnt==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 부서: ");
			part = input.next();
			if( part == null || part == "") {
				System.out.println("담당부서가 null이거나 공백입니다.");
			}
			haksaHash.put("age",age);
			haksaHash.put("name",name);
			haksaHash.put("part",part);
			haksaHash.put("object", "관리자");
			haksaList.add(haksaHash);
			System.out.println(name+"님이 ["+ part +"] 부서에 등록되었습니다.");
		}
		
	}
		

}
