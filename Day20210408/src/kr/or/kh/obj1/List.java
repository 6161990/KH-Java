package kr.or.kh.obj1;

import java.util.HashMap;

public class List {
	
	private String object;
	
	public List() {}

	
	public void list() {
		System.out.println("=====전체출력======");
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String,String> haksaHash =  Register.haksaList.get(i);
			object = haksaHash.get("object");
			if(object.equals("학생")) {
				System.out.print("[학생부] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("학번: " );
				System.out.println(haksaHash.get("studentNum")+"\n");
			}
			else if(object.equals("교수")) {
				System.out.print("[교수진] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("담당 과목: " );
				System.out.println(haksaHash.get("subject")+"\n");
				
			}else if(object.equals("관리자")){
				System.out.print("[관리자] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("담당 부서: " );
				System.out.println(haksaHash.get("part")+"\n");					
			}
		}
	}
	
}
