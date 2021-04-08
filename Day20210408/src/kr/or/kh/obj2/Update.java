package kr.or.kh.obj2;

import java.util.HashMap;

public class Update {
	
	private String name;
	private String object;
	private String nameUpdate;
	private String commit;
	private String age;
	private String studentNum;
	private String subject;
	private String part;
	
	public Update() {}

	
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
                    updateRegister(3);
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
	
	

	public void updateMenu() {
		 System.out.println("수정할이름을입력하세요.");
	     System.out.println("이름:");
	     name = Register.input.next();
	     if(name == null || name == "") {
	    	 System.out.println("이름이 null이거나 공백입니다.");
	     }
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
		 if(commit == null || commit == "") {
	    	 System.out.println("입력 내용이 null이거나 공백입니다.");
	     }
	}
	
	public void updateStudent(HashMap<String, String> haksaHash, int i) {
	    haksaHash.put("age", age);
        haksaHash.put("name", name);
        haksaHash.put("studentNum", studentNum); 
        haksaHash.put("object", "학생");
        Register.haksaList.set(i, haksaHash);
	}
	public void updateProfessor(HashMap<String, String> haksaHash, int i) {
		haksaHash.put("age", age);
        haksaHash.put("name", name);
        haksaHash.put("subject", subject); 
        haksaHash.put("object", "교수");
        Register. haksaList.set(i, haksaHash);
	}
	public void updateManager(HashMap<String, String> haksaHash, int i) {
		haksaHash.put("age", age);
        haksaHash.put("name", name);
        haksaHash.put("part", part); 
        haksaHash.put("object", "관리자");
        Register.haksaList.set(i, haksaHash);
	}
	
	public void updateAgeName() {
		System.out.println("나이:");
        age = Register.input.next();
        if(age == null || age == "") {
	    	 System.out.println("입력 내용이 null이거나 공백입니다.");
	     }
        System.out.println("이름:");
        name = Register.input.next();
        if(name == null || name == "") {
	    	 System.out.println("입력 내용이 null이거나 공백입니다.");
	     }
	}
	public void updateRegister(int cnt) {
		if(cnt==1) {
			updateAgeName();
	        System.out.println("학번:");
	        studentNum = Register.input.next();
	        if(studentNum == null || studentNum == "") {
		    	 System.out.println("입력 내용이 null이거나 공백입니다.");
		     }
		}else if(cnt==2) {
			updateAgeName();
            System.out.println("과목:");
            subject = Register.input.next();
            if(subject == null || subject == "") {
		    	 System.out.println("입력 내용이 null이거나 공백입니다.");
		    }
		}else if(cnt==3) {
			updateAgeName();
            System.out.println("부서:");
            part = Register.input.next();
            if(part == null || part == "") {
		    	 System.out.println("입력 내용이 null이거나 공백입니다.");
		    }
		}
	}
	
	public void updateDisplay(int cnt) {
		if(cnt==1) {
		 System.out.println("학생이수정되었습니다.");
		} else if(cnt ==2) {
		 System.out.println("교수님이 수정되었습니다.");
		}else if (cnt ==3){
		 System.out.println("관자리님이 수정되었습니다.");
		}
	}
	
}
