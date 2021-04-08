package kr.or.kh.obj2;

import java.util.HashMap;

public class List {
	
	private String object;
	
	public List() {}

	
	public void list() {//전체출력의시작
		   for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	         HashMap<String,String> haksaHash=Register.haksaList.get(i);
	         object=haksaHash.get("object");
	         if(object.equals("학생")) {//학생전체출력시작
	        	 System.out.println("===학생전체출력====");
	             listDisplay(1,haksaHash);
	         }//학생전체출력의끝
	         else if(object.equals("교수")) {//교수전체출력의시작
	        	 System.out.println("===교수전체출력====");
	        	 listDisplay(2,haksaHash);
	              
	         }//교수전체출력의끝
	         else if(object.equals("관리자")) {//관리자전체출력시작
	        	 System.out.println("===관리자전체출력====");
	        	 listDisplay(3,haksaHash);           
	          }//관리자전체출력의끝
	      }//반복문의끝
      }//전체출력의끝
	   
	   public void listDisplay(int cnt, HashMap<String,String> haksaHash) {
			
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
	
}
