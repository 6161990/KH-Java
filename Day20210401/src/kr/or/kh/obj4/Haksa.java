package kr.or.kh.obj4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Haksa {
	protected int cnt;
	protected String age;
	protected String name;
	protected String studentNum;
	protected String subject;
	protected String part;
	protected String object;
	protected String commit;
	
	public Haksa() {
		cnt=0;
		age= null;
		name=null;
		studentNum=null;
		subject=null;
		part=null;
		object=null;
		commit=null;
	}
	public void registerMenu() {
	    System.out.println("등록");
	    System.out.println("=======메뉴 선택======");
	    System.out.println("1.학생");
	    System.out.println("2.교수");
	    System.out.println("3.관리자");
	    System.out.println("4.이전메뉴");
	    System.out.println("번호를 선택해 주세요..");
	    cnt = Register.input.nextInt();
	}
	
	public void registerAgeName() {
		   HashMap<String,String> haksaHash = new HashMap<String,String>();
	       System.out.println("나이:");
	       age = Register.input.next();
	       System.out.println("이름:");
	       name = Register.input.next();
	}
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("학생이 등록되었습니다.");
		}else if(cnt==2) {
			System.out.println("교수님이 등록되었습니다.");
		}else if(cnt ==3) {
			System.out.println("관리자님이 등록되었습니다.");
		}
	}
	
	public void searchMenu() {
		 System.out.println("찾을이름을 입력해주세요.");
	     System.out.println("이름:");
	     name = Register.input.next();
	}
	
	public void searchDisplay(int cnt, HashMap<String,String> haksaHash ) {
		if(cnt==1) {
			System.out.print("나이:"+haksaHash.get("age")+"\t");
            System.out.print("이름:"+haksaHash.get("name")+"\t");
            System.out.print("학번:"+haksaHash.get("studentNum")+"\n");
		}else if(cnt==2) {
			System.out.print("나이:"+haksaHash.get("age")+"\t");
            System.out.print("이름:"+haksaHash.get("name")+"\t");
            System.out.print("과목:"+haksaHash.get("subject")+"\n");
		}else if(cnt==3) {
			System.out.print("나이:"+haksaHash.get("age")+"\t");
            System.out.print("이름:"+haksaHash.get("name")+"\t");
            System.out.print("부서:"+haksaHash.get("part")+"\n");
		}
	}
	
	public void deleteMenu() {
		 System.out.println("삭제할사람의 이름을 입력해 주세요.");
	     System.out.print("이름 : ");
	     name = Register.input.next();
	}
	public void deleteDisplay() {
		System.out.println(name+"님 삭제하였습니다.");    
	}
	
	public void listDisplay(int cnt, HashMap<String,String> haksaHash) {
		System.out.println("===전체출력====");
		if(cnt==1) {
			 System.out.print("이름: " );
             System.out.print(haksaHash.get("name")+"\t");
             System.out.print("나이: " );
             System.out.print(haksaHash.get("age")+"\t");
             System.out.print("학번: " );
             System.out.print(haksaHash.get("studentNum")+"\n");
		}else if(cnt==2) {
			 System.out.print("이름: " );
             System.out.print(haksaHash.get("name")+"\t");
             System.out.print("나이: " );
             System.out.print(haksaHash.get("age")+"\t");
             System.out.print("과목: " );
             System.out.print(haksaHash.get("subject")+"\n");
             
		}else if(cnt==3) {
			 System.out.print("이름: " );
             System.out.print(haksaHash.get("name")+"\t");
             System.out.print("나이: " );
             System.out.print(haksaHash.get("age")+"\t");
             System.out.print("부서: " );
             System.out.print(haksaHash.get("part")+"\n");     
		}
	}
	
	public void updateMenu() {
		 System.out.println("수정할이름을입력하세요.");
	     System.out.println("이름:");
	     name = Register.input.next();
	}
	public void updateConfirmDisplay(int cnt, HashMap<String,String> haksaHash) {
		if(cnt ==1) {
			System.out.print("나이:"+haksaHash.get("age")+"\t");
			System.out.print("이름:"+haksaHash.get("name")+"\t");
			System.out.print("학번:"+haksaHash.get("studentNum")+"\n");
		} else if (cnt==2) {
			 System.out.print("나이:"+haksaHash.get("age")+"\t");
             System.out.print("이름:"+haksaHash.get("name")+"\t");
             System.out.print("과목:"+haksaHash.get("subject")+"\n");
		} else if(cnt ==3) { 
			 System.out.print("나이:"+haksaHash.get("age")+"\t");
             System.out.print("이름:"+haksaHash.get("name")+"\t");
             System.out.print("부서:"+haksaHash.get("part")+"\n");
		}
		
	}
	
	public void updateConfirmMenu() {
		 System.out.println("변경하기전내용입니다.수정할까요yes/no");
         commit = Register.input.next();
	}
	
	public void updateRegister(int cnt) {
		if(cnt==1) {
			System.out.println("나이:");
	        age = Register.input.next();
	        System.out.println("이름:");
	        name = Register.input.next();
	        System.out.println("학번:");
	        studentNum = Register.input.next();
		}else if(cnt==2) {
			System.out.println("나이:");
            age = Register.input.next();
            System.out.println("이름:");
            name = Register.input.next();
            System.out.println("과목:");
            subject = Register.input.next();
		}else if(cnt==3) {
			System.out.println("나이:");
            age = Register.input.next();
            System.out.println("이름:");
            name = Register.input.next();
            System.out.println("부서:");
            part = Register.input.next();
		}
	}
	
	public void updateDisplay(int cnt) {
		if(cnt==1) {
		 System.out.println("학생이수정되었습니다.");
		} else if(cnt ==2) {
		 System.out.println("교수님이 수정되었습니다.");
		}else if (cnt ==3){
		 System.out.println("교수님이 수정되었습니다.");
		}
	}
}
