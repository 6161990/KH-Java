package kr.or.kh.obj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Haksa {
	
	//인스턴스 변수
	private int cnt;  //생성자 함수만 코딩하면 초기화 필요없음 컴파일러가 기본 생성자 초기화함.
	public static Scanner input;
	public static ArrayList<HashMap<String, String>> haksaList;
	private String age;
	private String name;
	private String studentNum; //학생
	private String subject; //교수
	private String part; //관리자

	private String object; //구분자
	
	private String nameSearch; // 찾을 이름

	private String nameDelete; // 삭제할 이름
	
	private String nameUpdate; // 수정할 이름
	
	private String commit; // 정보 변경 yes/no
	
	//static 변수 
	static {//처음 값을 공간을 만들어서 객체가 사용할 수 있는 형태로 사용 
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();	
	}
	
	
	public Haksa() {}//기본 생성자
	
	
	public void register() {

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
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("학번: ");
			studentNum = input.next();
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
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 과목: ");
			subject = input.next();
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
			age = input.next();
			if(age == null || age == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
			System.out.println("이름: ");
			name = input.next();
			if( name == null || name == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
			System.out.println("담당 부서: ");
			part = input.next();
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
	
	public void search() {
		System.out.println("찾을 이름을 입력해주세요");
		System.out.println("이름 : ");
		name = input.next();
		if( name == null || name == "") {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		object="";
		nameSearch = "";
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
	
	public void delete() {
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.print("이름 : ");
		nameDelete ="";
		object = "";
		name = input.next();
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
	
	public void list() {
		System.out.println("=====전체출력======");
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String,String> haksaHash = haksaList.get(i);
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
	public void update() {
		System.out.println("기존에 등록했던 이름을 입력하세요.");
		System.out.println("이름: ");
		name =input.next();
		if(name == null||name== "" ) {
			System.out.println("이름이 null이거나 공백입니다.");
		}
		nameUpdate="";
		object= "";
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
					commit = input.next();
					if(commit == null||commit == "" ) {
						System.out.println("commit이 null이거나 공백입니다.");
					}
					if(commit.equals("yes")|| commit.equals("YES")) {
						haksaHash = new HashMap<String, String>();							
						System.out.println("변경할 나이: ");
						age= input.next();
						if(age == null || age== "" ) {
							System.out.println("나이가 null이거나 공백입니다.");
						}
						System.out.println("변경할 이름: ");
						name = input.next();
						if(name == null || name== "" ) {
							System.out.println("이름이 null이거나 공백입니다.");
						}
						System.out.println("변경할 학번: ");
						studentNum=input.next();
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
						commit = input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당과목: ");
							subject = input.next();
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
					    commit = input.next();
						if(commit == null||commit == "") {
							System.out.println("commit이 null이거나 공백입니다.");
						}
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= input.next();
							if(age == null || age == "") {
								System.out.println("나이가 null이거나 공백입니다.");
							}
							System.out.println("변경할 이름: ");
							name = input.next();
							if(name == null || name == "") {
								System.out.println("이름이 null이거나 공백입니다.");
							}
							System.out.println("변경할 담당부서: ");
							part = input.next();
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
