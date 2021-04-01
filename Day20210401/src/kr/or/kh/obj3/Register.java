package kr.or.kh.obj3;

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
	public static ArrayList<HashMap<String,String>> haksaList;
	
	public Register() {
		cnt=0;
		age=null;
		name=null;
		studentNum=null;
		subject=null;
		part=null;
	}
	
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();
	}
	
	public void register() {//등록함수
	 //등록의시작
    System.out.println("등록");
    System.out.println("=======메뉴 선택======");
    System.out.println("1.학생");
    System.out.println("2.교수");
    System.out.println("3.관리자");
    System.out.println("4.이전메뉴");
    System.out.println("번호를 선택해 주세요..");
    cnt = input.nextInt();
    if(cnt==1) {//학생시작
       HashMap<String,String> haksaHash = new HashMap<String,String>();
       System.out.println("나이:");
       age = input.next();
       System.out.println("이름:");
       name = input.next();
       System.out.println("학번:");
       studentNum = input.next();
       haksaHash.put("age", age);
       haksaHash.put("name", name);
       haksaHash.put("studentNum", studentNum);
       haksaHash.put("object", "학생");
       haksaList.add(haksaHash);
       System.out.println("학생이등록되었습니다.");
                 
    }//학생의끝
    else if(cnt==2) {//교수의시작
       HashMap<String,String> haksaHash = new HashMap<String,String>();
       System.out.println("나이:");
       age = input.next();
       System.out.println("이름:");
       name = input.next();
       System.out.println("과목:");
       subject = input.next();
       haksaHash.put("age", age);
       haksaHash.put("name", name);
       haksaHash.put("subject", subject);
       haksaHash.put("object", "교수");
       haksaList.add(haksaHash);
       System.out.println("교수님이 등록되었습니다.");     
    }//교수의끝
    else if(cnt==3) {//관리자의시작
       HashMap<String,String> haksaHash = new HashMap<String,String>();
       System.out.println("나이:");
       age = input.next();
       System.out.println("이름:");
       name = input.next();
       System.out.println("부서:");
       part = input.next();
       haksaHash.put("age", age);
       haksaHash.put("name", name);
       haksaHash.put("part", part);
       haksaHash.put("object", "관리자");
       haksaList.add(haksaHash);
       System.out.println("관리자님등록되었습니다.");           
    }//관리자의끝  
 }//등록함수의끝
}