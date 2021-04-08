package kr.or.kh.obj1;

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

	
	public void update() {
		System.out.println("기존에 등록했던 이름을 입력하세요.");
		System.out.println("이름: ");
		name =Register.input.next();
		if(name == null||name== "" ) {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		nameUpdate="";
		object= "";
		for(int i=0; i<Register.haksaList.size(); i++) { //반복문의 시작
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			object = haksaHash.get("object");
			nameUpdate = haksaHash.get("name");
			if(object.equals("학생")) {
				if(name.equals(nameUpdate)) {
					System.out.println("=====현재 정보=====");
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("학번: "+haksaHash.get("studentNum")+"\n");
					System.out.println("정보를 변경하시겠어요? yes/no");
					commit = Register.input.next();
					if(commit == null||commit == "" ) {
						System.out.println("commit이 null이거나 공백입니다.");
					}
					if(commit.equals("yes")|| commit.equals("YES")) {
						haksaHash = new HashMap<String, String>();							
						System.out.println("변경할 나이: ");
						age= Register.input.next();
						if(age == null || age== "" ) {
							System.out.println("나이가 null이거나 공백입니다.");
						}
						System.out.println("변경할 이름: ");
						name = Register.input.next();
						if(name == null || name== "" ) {
							System.out.println("이름이 null이거나 공백입니다.");
						}
						System.out.println("변경할 학번: ");
						studentNum=Register.input.next();
						if(studentNum == null || studentNum=="") {
							System.out.println("학번이 null이거나 공백입니다.");
						}
						haksaHash.put("age", age);
						haksaHash.put("name", name);
						haksaHash.put("studentNum", studentNum);
						haksaHash.put("object", "학생");
						Register.haksaList.set(i, haksaHash);
						System.out.println("정보가 변경되었습니다.");
					}else {
						continue;
					}
				
				}
			}else if(object.equals("교수")) {
				if(name.equals(nameUpdate)) {
					if(name.equals(nameUpdate)) {
						System.out.println("=====현재 정보=====");
						System.out.print("나이: "+haksaHash.get("age")+"\t");
						System.out.print("이름: "+haksaHash.get("name")+"\t");
						System.out.print("담당과목: "+haksaHash.get("subject")+"\n");
						System.out.println("정보를 변경하시겠어요? yes/no");
						commit = Register.input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= Register.input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = Register.input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당과목: ");
							subject = Register.input.next();
							if(subject == null || subject == "") {
								System.out.println("담당과목이 null이거나 공백입니다.");
							}
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("subject", subject);
							haksaHash.put("object", "교수");
							Register.haksaList.set(i, haksaHash);
							System.out.println("정보가 변경되었습니다.");
						}else {
							continue;
						}
					}
				}
			}else if(object.equals("관리자")) {
				if(name.equals(nameUpdate)) {
					if(name.equals(nameUpdate)) {
						System.out.println("=====현재 정보=====");
						System.out.print("나이: "+haksaHash.get("age")+"\t");
						System.out.print("이름: "+haksaHash.get("name")+"\t");
						System.out.print("담당부서: "+haksaHash.get("part")+"\n");
						System.out.println("정보를 변경하시겠어요? yes/no");
					    commit = Register.input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= Register.input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = Register.input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당부서: ");
							part = Register.input.next();
							if(part == null || part == "") {
								System.out.println("담당부서가 null이거나 공백입니다.");
							}
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("part", part);
							haksaHash.put("object", "관리자");
							Register.haksaList.set(i, haksaHash);
							System.out.println("정보가 변경되었습니다.");
						}else {
							continue;
						}
					}
				}
			}
	}
	
	}
	
	
}
