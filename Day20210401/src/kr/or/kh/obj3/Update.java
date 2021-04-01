package kr.or.kh.obj3;

import java.util.HashMap;

public class Update {
	private String name;
	private String age;
	private String object;
	private String nameUpdate;
	private String commit;
	private String studentNum;
	private String subject;
	private String part;

	public Update() {
		age=null;
	      name=null;
	      studentNum=null;
	      object=null;
	      subject=null;
	      part=null;
	      nameUpdate=null;
	      commit=null;
	}
	
    public String update() {//수정의시작
	      System.out.println("수정할이름을입력하세요.");
	        System.out.println("이름:");
	        name = Register.input.next();
	        object = "";
	        nameUpdate="";
	        commit="";
	        for(int i=0;i<Register.haksaList.size();i++) {//반복문의시작
	           HashMap<String,String> haksaHash = Register.haksaList.get(i);
	           object=haksaHash.get("object");
	           nameUpdate = haksaHash.get("name");
	           if(object.equals("학생")) {//학생수정시작
	              if(name.equals(nameUpdate)) {//학생이같으면시작
	                 System.out.print("나이:"+haksaHash.get("age")+"\t");
	                 System.out.print("이름:"+haksaHash.get("name")+"\t");
	                 System.out.print("학번:"+haksaHash.get("studentNum")+"\n");
	                 System.out.println("변경하기전내용입니다.수정할까요yes/no");
	                 commit = Register.input.next();
	                 if(commit.equals("yes")||commit.equals("YES")) {//학생수정최종시작
	                    haksaHash = new HashMap<String,String>();
	                    System.out.println("나이:");
	                    age = Register.input.next();
	                    System.out.println("이름:");
	                    name = Register.input.next();
	                    System.out.println("학번:");
	                    studentNum = Register.input.next();
	                    haksaHash.put("age", age);
	                    haksaHash.put("name", name);
	                    haksaHash.put("studentNum", studentNum); 
	                    haksaHash.put("object", "학생");
	                    Register.haksaList.set(i, haksaHash);
	                    System.out.println("학생이수정되었습니다.");
	                 }//학생수정최종끝
	                 else {//학생수정취소의시작
	                    return commit;
	                 }//학생수정취소의끝
	              }//학생이같으면끝                 
	           }//학생수정끝
	           else if(object.equals("교수")) {//교수수정시작           
	              if(name.equals(nameUpdate)) {//교수이름같으면시작
	                 System.out.print("나이:"+haksaHash.get("age")+"\t");
	                 System.out.print("이름:"+haksaHash.get("name")+"\t");
	                 System.out.print("과목:"+haksaHash.get("subject")+"\n");
	                 System.out.println("변경하기전내용입니다.수정할까요yes/no");
	                 commit = Register.input.next();
	                 if(commit.equals("yes")||commit.equals("YES")) {//교수최종수정
	                    haksaHash = new HashMap<String,String>();
	                    System.out.println("나이:");
	                    age = Register.input.next();
	                    System.out.println("이름:");
	                    name = Register.input.next();
	                    System.out.println("과목:");
	                    subject = Register.input.next();
	                    haksaHash.put("age", age);
	                    haksaHash.put("name", name);
	                    haksaHash.put("subject", subject); 
	                    haksaHash.put("object", "교수");
	                    Register. haksaList.set(i, haksaHash);
	                 System.out.println("교수님수정되었습니다.");
	              }//교수수정의끝
	                 else {//교수수정취소시작
	                 return commit;
	              }//교수수정취소끝
	             }//교수이름같으면끝
	           }//교수수정끝
	           else if(object.equals("관리자")) {//관리자수정시작
	              if(name.equals(nameUpdate)) {//관리자이름같으면시작
	                 System.out.print("나이:"+haksaHash.get("age")+"\t");
	                 System.out.print("이름:"+haksaHash.get("name")+"\t");
	                 System.out.print("부서:"+haksaHash.get("part")+"\n");
	                 System.out.println("변경하기전내용입니다.수정할까요yes/no");
	                 commit = Register.input.next();
	                 if(commit.equals("yes")||commit.equals("YES")) {//관리자수정최종수정
	                    haksaHash = new HashMap<String,String>();
	                    System.out.println("나이:");
	                    age = Register.input.next();
	                    System.out.println("이름:");
	                    name = Register.input.next();
	                    System.out.println("부서:");
	                    part = Register.input.next();
	                    haksaHash.put("age", age);
	                    haksaHash.put("name", name);
	                    haksaHash.put("part", part); 
	                    haksaHash.put("object", "관리자");
	                    Register.haksaList.set(i, haksaHash);
	                 System.out.println("관리자님수정되었습니다.");
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
