package kr.or.kh.obj2;

import java.util.HashMap;

public class Delete {
	
	private String name;
	private String object;
	private String nameDelete;

	public Delete() {}
	
	public void delete() {//삭제함수의시작
 		  deleteMenu();
 		
	      for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	         HashMap<String,String> haksaHash = Register.haksaList.get(i);
	         object = haksaHash.get("object");
	         nameDelete = haksaHash.get("name");
	         if(object.equals("학생")) {//학생삭제
	           if(name.equals(nameDelete)) {//학생이름삭제
	             studentDelete(i);    
	           }//학생이름삭제
	         }//학생삭제
	         else if(object.equals("교수")) {//교수삭제
	           if(name.equals(nameDelete)) {//교수이름삭제
	              professorDelete(i);        
	            }//교수이름삭제
	         }//교수삭제
	         else if(object.equals("관리자")) {//관리자삭제
	           if(name.equals(nameDelete)) {//관리자이름삭제
	             managerDelete(i);
	           }//관리자이름삭제
	         }//관리자삭제
	      }//반복문끝
	         
	      deleteDisplay();
	         
	 }//삭제함수의끝

	 public void deleteMenu() {
		 System.out.println("삭제할사람의 이름을 입력해 주세요.");
	     System.out.print("이름 : ");
	     name = Register.input.next();
	 }
	
	 public void studentDelete(int i) {
		 Register.haksaList.remove(i);    
	 }
	 public void professorDelete(int i) {
		 Register.haksaList.remove(i);    
	 }
	 public void managerDelete(int i) {
		 Register.haksaList.remove(i);    
	 }
	 public void deleteDisplay() {
			System.out.println(name+"님 삭제하였습니다.");    
	 }
}
