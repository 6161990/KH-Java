package kr.or.kh.obj4;

import java.util.HashMap;

public class Delete extends Haksa{
	
	private String nameDelete;
	
	public void Delete() {
		nameDelete=null;
	}
	
    public void delete() {//삭제함수의시작
    		deleteMenu();
    		
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
	         
	         deleteDisplay();
	         
	     }//삭제함수의끝

}
