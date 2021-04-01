package kr.or.kh.obj3;

import java.util.HashMap;

public class Search{
	private String name;
	private String object;
	private String nameSearch;
	
	public void search() {//검색함수의시작
	    System.out.println("찾을이름을 입력해주세요.");
	     System.out.println("이름:");
	     name = Register.input.next();
	     object="";
	     nameSearch="";
	     for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	        HashMap<String,String> haksaHash = Register.haksaList.get(i);
	         object = haksaHash.get("object");
	         nameSearch = haksaHash.get("name");
	         if(object.equals("학생")) {//학생찾기시작
	            if(name.equals(nameSearch)) {//학생이름시작
	               System.out.print("나이:"+haksaHash.get("age")+"\t");
	               System.out.print("이름:"+haksaHash.get("name")+"\t");
	               System.out.print("학번:"+haksaHash.get("studentNum")+"\n");
	            }//학생이름끝
	         }//학생찾기끝
	         else if(object.equals("교수")) {//교수찾기시작
	            if(name.equals(nameSearch)) {//교수이름시작
	               System.out.print("나이:"+haksaHash.get("age")+"\t");
	               System.out.print("이름:"+haksaHash.get("name")+"\t");
	               System.out.print("과목:"+haksaHash.get("subject")+"\n");
	            }//교수이름끝
	         }//교수찾기끝
	         else if(object.equals("관리자")) {//관리자시작
	            if(name.equals(nameSearch)) {//관리자이름시작
	               System.out.print("나이:"+haksaHash.get("age")+"\t");
	               System.out.print("이름:"+haksaHash.get("name")+"\t");
	               System.out.print("부서:"+haksaHash.get("part")+"\n");
	            }//관리자이름끝
	         }//관리자끝
	     }//반복문끝    
	}//검색함수의끝
}