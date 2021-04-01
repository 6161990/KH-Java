package kr.or.kh.obj3;

import java.util.HashMap;

public class Delete {
	private String name;
	private String object;
	private String nameDelete;
	
	
    public void delete() {//삭제함수의시작
	       nameDelete="";
	         object="";
	        System.out.println("삭제할사람의 이름을 입력해 주세요.");
	        System.out.print("이름 : ");
	        name = Register.input.next();
	         for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	            HashMap<String,String> haksaHash = Register.haksaList.get(i);
	            object = haksaHash.get("object");
	            nameDelete = haksaHash.get("name");
	            if(object.equals("학생")) {//학생삭제
	               if(name.equals(nameDelete)) {//학생이름삭제
	            	   Register.haksaList.remove(i);         
	               }//학생이름삭제
	            }//학생삭제
	            else if(object.equals("교수")) {//교수삭제
	               if(name.equals(nameDelete)) {//교수이름삭제
	            	   Register. haksaList.remove(i);         
	               }//교수이름삭제
	            }//교수삭제
	            else if(object.equals("관리자")) {//관리자삭제
	               if(name.equals(nameDelete)) {//관리자이름삭제
	            	   Register.haksaList.remove(i);
	               }//관리자이름삭제
	            }//관리자삭제
	         }//반복문끝
	         System.out.println(name+"님삭제하였습니다.");    
	     }//삭제함수의끝

}
