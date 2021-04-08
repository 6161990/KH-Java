package kr.or.kh.instance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//프로토콜을 기준으로 함수 만들기 
//static제거해서 인스턴스 메소드로 변경하기
public class HaksaFunction {

	public void register(int cnt, Scanner input, ArrayList<HashMap<String, String>> haksaList) {

		System.out.println("등록");
		System.out.println("======메뉴 선택======");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.println("번호를 선택해주세요...");
		cnt=input.nextInt();
		if( cnt < 0 || cnt > 4 ) {
			System.out.println("음수이거나 4 이상이면 에러입니다. 메뉴 중에 선택하세요.");
		}
		if(cnt==1) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			String age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			String name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("학번: ");
			String studentNum = input.next();
			if( studentNum == null || studentNum == "") {
				System.out.println("학번이 null이거나 공백입니다.");
			}
			haksaHash.put("age", age);   //put 등록 
			haksaHash.put("name", name);
			haksaHash.put("studentNum", studentNum);
			haksaHash.put("object", "학생");
			haksaList.add(haksaHash); //배열(haksaList)에 넣기
			System.out.println(name+"님이 학생부에 등록되었습니다.");

		}else if(cnt==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			String age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			String name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 과목: ");
			String subject = input.next();
			if( subject == null || subject == "") {
				System.out.println("담당과목이 null이거나 공백입니다.");
			}
			haksaHash.put("age", age);
			haksaHash.put("name", name);
			haksaHash.put("subject", subject);
			haksaHash.put("object", "교수");
			haksaList.add(haksaHash);
			System.out.println(name+"님이 담당 과목 ["+ subject+"]로 교수진에 등록되었습니다.");

		}else if(cnt==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("나이: ");
			String age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			String name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 부서: ");
			String part = input.next();
			if( part == null || part == "") {
				System.out.println("담당부서가 null이거나 공백입니다.");
			}
			haksaHash.put("age",age);
			haksaHash.put("name",name);
			haksaHash.put("part",part);
			haksaHash.put("object", "관리자");
			haksaList.add(haksaHash);
			System.out.println(name+"님이 "+ part +" 부서에 등록되었습니다.");
	   }
		
	}
	
	public void search(int cnt, Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("찾을 이름을 입력해주세요");
		System.out.println("이름 : ");
		String name = input.next();
		if( name == null || name == "") {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		String object="";
		String nameSearch = "";
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
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
	
	public void delete(int cnt, Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.print("이름 : ");
		String nameDelete ="";
		String object = "";
		String name = input.next();
		if( name == null || name == "") {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		for(int i=0; i<haksaList.size();i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			nameDelete = haksaHash.get("name");
			if(object.equals("학생")) {
				if(name.equals(nameDelete)) {
					haksaList.remove(i);
				}
			}else if(object.equals("교수")) {
				if(name.equals(nameDelete)) {
					haksaList.remove(i);
				}
			}else if(object.equals("관리자")) {
				if(name.equals(nameDelete)) {
					haksaList.remove(i);
				}
			}
		}
		System.out.println(name+"님을 삭제하였습니다.");
	}
	
	public void list(ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("=====전체출력======");
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String,String> haksaHash = haksaList.get(i);
			String object = haksaHash.get("object");
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
	public void update(Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("기존에 등록했던 이름을 입력하세요.");
		System.out.println("이름: ");
		String name =input.next();
		if(name == null||name== "" ) {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		String nameUpdate="";
		String object= "";
		for(int i=0; i<haksaList.size(); i++) { //반복문의 시작
			HashMap<String, String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			nameUpdate = haksaHash.get("name");
			if(object.equals("학생")) {
				if(name.equals(nameUpdate)) {
					System.out.println("=====현재 정보=====");
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("학번: "+haksaHash.get("studentNum")+"\n");
					System.out.println("정보를 변경하시겠어요? yes/no");
					String commit = input.next();
					if(commit == null||commit == "" ) {
						System.out.println("commit이 null이거나 공백입니다.");
					}
					if(commit.equals("yes")|| commit.equals("YES")) {
						haksaHash = new HashMap<String, String>();							
						System.out.println("변경할 나이: ");
						String age= input.next();
						if(age == null || age== "" ) {
							System.out.println("나이가 null이거나 공백입니다.");
						}
						System.out.println("변경할 이름: ");
						name = input.next();
						if(name == null || name== "" ) {
							System.out.println("이름이 null이거나 공백입니다.");
						}
						System.out.println("변경할 학번: ");
						String studentNum=input.next();
						if(studentNum == null || studentNum=="") {
							System.out.println("학번이 null이거나 공백입니다.");
						}
						haksaHash.put("age", age);
						haksaHash.put("name", name);
						haksaHash.put("studentNum", studentNum);
						haksaHash.put("object", "학생");
						haksaList.set(i, haksaHash);
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
						String commit = input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							String age= input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당과목: ");
							String subject = input.next();
							if(subject == null || subject == "") {
								System.out.println("담당과목이 null이거나 공백입니다.");
							}
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("subject", subject);
							haksaHash.put("object", "교수");
							haksaList.set(i, haksaHash);
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
						String commit = input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							String age= input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당부서: ");
							String part = input.next();
							if(part == null || part == "") {
								System.out.println("담당부서가 null이거나 공백입니다.");
							}
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("part", part);
							haksaHash.put("object", "관리자");
							haksaList.set(i, haksaHash);
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
