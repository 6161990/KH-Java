package kr.or.kh.obj;

import java.util.HashMap;

public class Update extends Haksa implements IUpdate{
	
	private String nameUpdate;

	public Update() {
	      nameUpdate=null;
	}
	@Override
	public void updateStudent(HashMap<String, String> haksaHash, int i) {
		  haksaHash.put("age", age);
          haksaHash.put("name", name);
          haksaHash.put("studentNum", studentNum); 
          haksaHash.put("object", "학생");
          Register.haksaList.set(i, haksaHash);
	}
	@Override
	public void updateProfessor(HashMap<String, String> haksaHash, int i) {
		  haksaHash.put("age", age);
          haksaHash.put("name", name);
          haksaHash.put("subject", subject); 
          haksaHash.put("object", "교수");
          Register. haksaList.set(i, haksaHash);
	}
	@Override
	public void updateManager(HashMap<String, String> haksaHash, int i) {
		haksaHash.put("age", age);
        haksaHash.put("name", name);
        haksaHash.put("part", part); 
        haksaHash.put("object", "관리자");
        Register.haksaList.set(i, haksaHash);
	}
    public String update() {//수정의시작
	     
    		updateMenu();
	
	        for(int i=0;i<Register.haksaList.size();i++) {//반복문의시작
	           HashMap<String,String> haksaHash = Register.haksaList.get(i);
	           object=haksaHash.get("object");
	           nameUpdate = haksaHash.get("name");
	           if(object.equals("학생")) {//학생수정시작
	              if(name.equals(nameUpdate)) {//학생이같으면시작
	            	 updateConfirmDisplay(1,haksaHash);
	            	 updateConfirmMenu();
	                
	                 if(commit.equals("yes")||commit.equals("YES")) {//학생수정최종시작
	                    haksaHash = new HashMap<String,String>();
	                    updateRegister(1);
	                    updateStudent(haksaHash,i);
	                    updateDisplay(1);
	                 }//학생수정최종끝
	                 else {//학생수정취소의시작
	                    return commit;
	                 }//학생수정취소의끝
	              }//학생이같으면끝                 
	           }//학생수정끝
	           else if(object.equals("교수")) {//교수수정시작           
	              if(name.equals(nameUpdate)) {//교수이름같으면시작
	            	  updateConfirmDisplay(2,haksaHash);
	            	  updateConfirmMenu();
	               
	                 if(commit.equals("yes")||commit.equals("YES")) {//교수최종수정
	                    haksaHash = new HashMap<String,String>();
	                    updateRegister(2);
	                    updateProfessor(haksaHash,i);
	                    updateDisplay(2);
	              }//교수수정의끝
	                 else {//교수수정취소시작
	                 return commit;
	              }//교수수정취소끝
	             }//교수이름같으면끝
	           }//교수수정끝
	           else if(object.equals("관리자")) {//관리자수정시작
	              if(name.equals(nameUpdate)) {//관리자이름같으면시작
	            	  updateConfirmDisplay(3,haksaHash);
	            	  updateConfirmMenu();
	                
	                 if(commit.equals("yes")||commit.equals("YES")) {//관리자수정최종수정
	                    haksaHash = new HashMap<String,String>();
	                    updateRegister(2);
	                    updateManager(haksaHash,i);
	                    updateDisplay(3);
	              }//관리자수정최종끝
	                 else {//관리자수정취소시작
	                 return commit;
	              }//관리자수정취소끝
	             }//관리자이름같으면끝
	           }//관리자수정끝
	        }//반복문의끝
	      return commit;
	     }//수정의끝




	
}
