package kr.or.kh.obj4;

import java.util.HashMap;

public class List extends Haksa {
	public List() {
		
	}
    public void List() {//전체출력의시작
 
        for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
           HashMap<String,String> haksaHash=Register.haksaList.get(i);
           object=haksaHash.get("object");
           if(object.equals("학생")) {//학생전체출력시작
             listDisplay(1,haksaHash);
           }//학생전체출력의끝
           else if(object.equals("교수")) {//교수전체출력의시작
        	  listDisplay(2,haksaHash);
              
           }//교수전체출력의끝
           else if(object.equals("관리자")) {//관리자전체출력시작
        	  listDisplay(3,haksaHash);           
           }//관리자전체출력의끝
        }//반복문의끝
     }//전체출력의끝
}
