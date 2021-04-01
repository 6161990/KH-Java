package kr.or.kh.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//메소드에서 클래스로 발전시키기 
//파라미터 제거 
//변수 제거 
public class Haksa {
	private int cnt; //인스턴스 변수 
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private String part;
	private String object;
	private String nameSearch;
	private String nameDelete;
	private String nameUpdate;
	private String commit;
	public static Scanner input; //클래스변수 
	public static ArrayList<HashMap<String, String>> haksaList; //클래스 변수 
	
	public Haksa() {
		cnt=0;
		age= null;  //인스턴스 변수는 생성자 함수에서 초기화, 물론 컴파일러가 초기화하지만 직접 입력해보기
		name =null;
		studentNum =null;
		subject = null;
		part = null;
		object = null;
		nameSearch = null;
		nameDelete = null;
		nameUpdate = null;
		commit= null;
	}
	
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String, String>>();
	}
	
	public void register() { //등록 함수 시작
		
	
			System.out.println("등록");
			System.out.println("======메뉴 선택======");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			System.out.println("4. 이전메뉴");
			System.out.println("번호를 선택해주세요...");
			cnt = input.nextInt();
			if(cnt==1) { //학생시작
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				age = input.next();
				System.out.println("이름: ");
				name = input.next();
				System.out.println("학번: ");
				studentNum = input.next();
				haksaHash.put("age", age);   //put 등록 
				haksaHash.put("name", name);
				haksaHash.put("studentNum", studentNum);
				haksaHash.put("object", "학생");
				haksaList.add(haksaHash); //배열(haksaList)에 넣기
				System.out.println(name+"님이 학생부에 등록되었습니다.");

			} // 학생의 끝 
			else if(cnt==2) { //교수의 시작
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				age = input.next();
				System.out.println("이름: ");
				name = input.next();
				System.out.println("담당 과목: ");
				subject = input.next();
				haksaHash.put("age", age);
				haksaHash.put("name", name);
				haksaHash.put("subject", subject);
				haksaHash.put("object", "교수");
				haksaList.add(haksaHash);
				System.out.println(name+"님이 담당 과목 ["+ subject+"]로 교수진에 등록되었습니다.");

			} //교수의 끝
			else if(cnt==3) { //관리자의 시작
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				age = input.next();
				System.out.println("이름: ");
				name = input.next();
				System.out.println("담당 부서: ");
				part = input.next();
				haksaHash.put("age",age);
				haksaHash.put("name",name);
				haksaHash.put("part",part);
				haksaHash.put("object", "관리자");
				haksaList.add(haksaHash);
				System.out.println(name+"님이 "+ part +" 부서에 등록되었습니다.");

			}//관리자의 끝
		
	
	}//등록 함수의 끝
	
	public void search() { //검색함수시작
		System.out.println("찾을 이름을 입력해주세요");
		System.out.println("이름 : ");
		name = input.next();
		object="";
		nameSearch = "";
		for(int i=0; i<haksaList.size(); i++) { //반복문시작
			HashMap<String, String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			nameSearch = haksaHash.get("name");
			if(object.equals("학생")) { //학생찾기 시작
				if(name.equals(nameSearch)) {// 학생 이름 찾기 시작
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("학번: "+haksaHash.get("studentNum")+"\n");
			    } //학생 이름 찾기 끝
		   }//학생 찾기 끝
			else if(object.equals("교수")) {// 교수 찾기 시작
				if(name.equals(nameSearch)) { //교수 이름 찾기 시작
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("담당과목: "+haksaHash.get("subject")+"\n");
				}// 교수 이름 찾기 끝
		}//교수 찾기 끝
			else if(object.equals("관리자")) { //관리자 찾기 시작
				if(name.equals(nameSearch)) { //관리자 이름 찾기 시작
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("담당 부서: "+haksaHash.get("part")+"\n");
				}// 관리자 이름 찾기 끝
		  }// 관리자 찾기 끝
    } //반복문 끝
	
	}//검색함수 끝
	public void delete() { //삭제함수
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.print("이름 : ");
		name = input.next();
		nameDelete ="";
		object = "";
		for(int i=0; i<haksaList.size();i++) { // 반복문 시작 
			HashMap<String, String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			nameDelete = haksaHash.get("name");
			if(object.equals("학생")) { //학생 삭제 시작
				if(name.equals(nameDelete)) {// 학생 이름 확인 시작
					haksaList.remove(i);
				}//학생 이름 확인 끝
			}// 학생 삭제 끝
			else if(object.equals("교수")) { // 교수 삭제 시작
				if(name.equals(nameDelete)) { //교수 이름 확인 시작
					haksaList.remove(i);
				}// 교수 이름 확인 끝
			}// 교수 삭제 끝
			else if(object.equals("관리자")) { //관리자 삭제 시작
				if(name.equals(nameDelete)) { //관리자 이름 확인 시작
					haksaList.remove(i);
				}//관리자 이름 확인 끝
			}//관리자 삭제 끝
		}//반복문 끝
		System.out.println(name+"님을 삭제하였습니다.");
	}
	public void list() { //전체 출력함수 시작 
		System.out.println("=====전체출력======");
		for(int i=0; i<haksaList.size(); i++) {//반복문 시작
			HashMap<String,String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			if(object.equals("학생")) { //학생 전체출력 시작
				System.out.print("[학생부] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("학번: " );
				System.out.println(haksaHash.get("studentNum")+"\n");
			}//학생 전체 출력 끝
			else if(object.equals("교수")) { //교수 전체출력 시작
				System.out.print("[교수진] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("담당 과목: " );
				System.out.println(haksaHash.get("subject")+"\n");
				
			}//교수 전체 출력 끝
			else if(object.equals("관리자")){ //관리자 전체출력 시작
				System.out.print("[관리자] 이름: ");
				System.out.print(haksaHash.get("name")+"\t");
				System.out.print("나이: " );
				System.out.print(haksaHash.get("age")+"\t");
				System.out.print("담당 부서: " );
				System.out.println(haksaHash.get("part")+"\n");					
			}//관리자 전체출력 끝
		}//반복문 끝
	}//전체 출력의 끝
	public String update() {  //정보 수정 함수 
		System.out.println("기존에 등록했던 이름을 입력하세요.");
		System.out.println("이름: ");
		name =input.next();
		object= "";
		nameUpdate="";
		commit="";
		for(int i=0; i<haksaList.size(); i++) { //반복문 시작
			HashMap<String, String> haksaHash = haksaList.get(i);
			object = haksaHash.get("object");
			nameUpdate = haksaHash.get("name");
			if(object.equals("학생")) { // 학생 수정 전체 시작
				if(name.equals(nameUpdate)) { // 학생이 같으면의 시작
					System.out.println("=====현재 정보=====");
					System.out.print("나이: "+haksaHash.get("age")+"\t");
					System.out.print("이름: "+haksaHash.get("name")+"\t");
					System.out.print("학번: "+haksaHash.get("studentNum")+"\n");
					System.out.println("정보를 변경하시겠어요? yes/no");
					commit = input.next();
					if(commit.equals("yes")|| commit.equals("YES")) { //학생 수정 최종시작
						haksaHash = new HashMap<String, String>();							
						System.out.println("변경할 나이: ");
						age= input.next();
						System.out.println("변경할 이름: ");
						name = input.next();
						System.out.println("변경할 학번: ");
						studentNum=input.next();
						haksaHash.put("age", age);
						haksaHash.put("name", name);
						haksaHash.put("studentNum", studentNum);
						haksaHash.put("object", "학생");
						haksaList.set(i, haksaHash);
						System.out.println("정보가 변경되었습니다.");
					}//학생 수정의 최종의 끝
					else { //학생 수정 취소의 시작
						return commit;
					}//학생 수정 취소의 끝
				}//학생이 같으면 끝
			} //학생 수정 전체 끝
			else if(object.equals("교수")) { //교수 수정 시작
				if(name.equals(nameUpdate)) { //교수 이름 같으면의 시작
					
						System.out.println("=====현재 정보=====");
						System.out.print("나이: "+haksaHash.get("age")+"\t");
						System.out.print("이름: "+haksaHash.get("name")+"\t");
						System.out.print("담당과목: "+haksaHash.get("subject")+"\n");
						System.out.println("정보를 변경하시겠어요? yes/no");
						commit = input.next();
						if(commit.equals("yes")|| commit.equals("YES")) {//교수 수정 최종 시작
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= input.next();
							System.out.println("변경할 이름: ");
							name = input.next();
							System.out.println("변경할 담당과목: ");
							subject = input.next();
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("subject", subject);
							haksaHash.put("object", "교수");
							haksaList.set(i, haksaHash);
							System.out.println("정보가 변경되었습니다.");
						}//교수 수정의 끝
						else { //교수 수정 취소시작
							return commit;
						}//교수 수정 취소 끝
					}//교수 이름 같으면 끝			
			}//교수 수정 끝
			else if(object.equals("관리자")) { //관리자 수정시작
				if(name.equals(nameUpdate)) { //관리자 이름 같으면 시작
					
						System.out.println("=====현재 정보=====");
						System.out.print("나이: "+haksaHash.get("age")+"\t");
						System.out.print("이름: "+haksaHash.get("name")+"\t");
						System.out.print("담당부서: "+haksaHash.get("part")+"\n");
						System.out.println("정보를 변경하시겠어요? yes/no");
						commit = input.next();
						if(commit.equals("yes")|| commit.equals("YES")) { //관리자 최종 수정 시작
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							age= input.next();
							System.out.println("변경할 이름: ");
							name = input.next();
							System.out.println("변경할 담당부서: ");
							part = input.next();
							haksaHash.put("age", age);
							haksaHash.put("name", name);
							haksaHash.put("subject", part);
							haksaHash.put("object", "관리자");
							haksaList.set(i, haksaHash);
							System.out.println("정보가 변경되었습니다.");
						}//관리자 수정 최종 끝
						else {//관리자 수정 취소 시작
							return commit;
						}//관리자 수정 취소 끝
					}//관리자 이름 같으면 끝 
			}//관리자 수정 끝
	}//반복문의 끝
		return commit;
	}//정보 수정 함수의 전체 의 끝 
}
