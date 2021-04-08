package kr.or.kh.obj1;

import java.util.HashMap;

public class Search {
	
	private String name;
	private String object;
	private String nameSearch;

	public Search() {}
	
	public void search() {
		System.out.println("찾을 이름을 입력해주세요");
		System.out.println("이름 : ");
		name = Register.input.next();
		if( name == null || name == "") {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		object="";
		nameSearch = "";
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			object = haksaHash.get("object");
			nameSearch = haksaHash.get("name");
			if(object.equals("학생")) {
				if(name.equals(nameSearch)) {
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("학번: "+haksaHash.get("studentNum")+"\n");
			    }
		   }else if(object.equals("교수")) {
				if(name.equals(nameSearch)) {
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("담당과목: "+haksaHash.get("subject")+"\n");
				}
		}else if(object.equals("관리자")) {
				if(name.equals(nameSearch)) {
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("담당 부서: "+haksaHash.get("part")+"\n");
				}
		 }
    }
	}
}
