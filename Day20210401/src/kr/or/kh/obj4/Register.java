package kr.or.kh.obj4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register extends Haksa{
	
	public static Scanner input;
	public static ArrayList<HashMap<String,String>> haksaList;
	
	public Register() {
	}
	
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();
	}
	
	public void register() {//등록함수
			registerMenu();
		    if(cnt==1) {//학생시작
		       HashMap<String,String> haksaHash = new HashMap<String,String>();
		       registerAgeName();
		       System.out.println("학번:");
		       studentNum = input.next();
		       haksaHash.put("age", age);
		       haksaHash.put("name", name);
		       haksaHash.put("studentNum", studentNum);
		       haksaHash.put("object", "학생");
		       haksaList.add(haksaHash);
		       registerDisplay(1);             
		    }//학생의끝
		    else if(cnt==2) {//교수의시작
		       HashMap<String,String> haksaHash = new HashMap<String,String>();
		       registerAgeName();
		       System.out.println("과목:");
		       subject = input.next();
		       haksaHash.put("age", age);
		       haksaHash.put("name", name);
		       haksaHash.put("subject", subject);
		       haksaHash.put("object", "교수");
		       haksaList.add(haksaHash);
		       registerDisplay(2);             
		    }//교수의끝
		    else if(cnt==3) {//관리자의시작
		       HashMap<String,String> haksaHash = new HashMap<String,String>();
		       registerAgeName();
		       System.out.println("부서:");
		       part = input.next();
		       haksaHash.put("age", age);
		       haksaHash.put("name", name);
		       haksaHash.put("part", part);
		       haksaHash.put("object", "관리자");
		       haksaList.add(haksaHash);
		       registerDisplay(3);        
		    }//관리자의끝  
		 }//등록함수의끝
		}