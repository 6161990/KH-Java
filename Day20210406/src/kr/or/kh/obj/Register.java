package kr.or.kh.obj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register extends Haksa implements IRegister{
	
	public static Scanner input;
	public static ArrayList<HashMap<String,String>> haksaList;
	
	public Register() {
		
	}
	
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();
	}
	@Override
	public void registerStudent() { //학생등록
		HashMap<String,String> haksaHash = new HashMap<String,String>();
	       registerAgeName();
	       System.out.println("학번:");
	       studentNum = input.next();
	       haksaHash.put("age", age);
	       haksaHash.put("name", name);
	       haksaHash.put("studentNum", studentNum);
	       haksaHash.put("object", "학생");
	       haksaList.add(haksaHash);
	                
	}
	@Override
	public void registerProfessor() {
		HashMap<String,String> haksaHash = new HashMap<String,String>();
	       registerAgeName();
	       System.out.println("과목:");
	       subject = input.next();
	       haksaHash.put("age", age);
	       haksaHash.put("name", name);
	       haksaHash.put("subject", subject);
	       haksaHash.put("object", "교수");
	       haksaList.add(haksaHash);
	}
	@Override
	public void registerManager() {
		   HashMap<String,String> haksaHash = new HashMap<String,String>();
		   registerAgeName();
	       System.out.println("부서:");
	       part = input.next();
	       haksaHash.put("age", age);
	       haksaHash.put("name", name);
	       haksaHash.put("part", part);
	       haksaHash.put("object", "관리자");
	       haksaList.add(haksaHash);
	}
	
	public void register() {//등록함수
			registerMenu();
		    if(cnt==1) {//학생시작
		       registerStudent();
		       registerDisplay(1);     
		    }//학생의끝
		    else if(cnt==2) {//교수의시작
		       registerProfessor();
		       registerDisplay(2);             
		    }//교수의끝
		    else if(cnt==3) {//관리자의시작
		    	registerManager();
		    	registerDisplay(3);        
		    }//관리자의끝  
		 }//등록함수의끝

	
	
		}