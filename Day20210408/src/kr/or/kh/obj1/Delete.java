package kr.or.kh.obj1;

import java.util.HashMap;

public class Delete {
	
	private String name;
	private String object;
	private String nameDelete;

	public Delete() {}
	
	public void delete() {
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.print("이름 : ");
		nameDelete ="";
		object = "";
		name = Register.input.next();
		if( name == null || name == "") {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		for(int i=0; i<Register.haksaList.size();i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			object = haksaHash.get("object");
			nameDelete = haksaHash.get("name");
			if(object.equals("학생")) {
				if(name.equals(nameDelete)) {
					Register.haksaList.remove(i);
				}
			}else if(object.equals("교수")) {
				if(name.equals(nameDelete)) {
					Register.haksaList.remove(i);
				}
			}else if(object.equals("관리자")) {
				if(name.equals(nameDelete)) {
					Register.haksaList.remove(i);
				}
			}
		}
		System.out.println(name+"님을 삭제하였습니다.");
	}
	
	
}
