package kr.or.kh;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
//		String[][] student = new String[2][3]; //학생 5명의 3개의 정보
//		String[][] professor = new String[2][3]; //교수 5명의 3개의 정보
//		String[][] manager = new String[2][3];
		while(true) {
		System.out.println("======메뉴 선택======");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체출력");
		System.out.println("5. 등록된 정보 수정");
		System.out.println("-------------------");
		System.out.println("0.종료");
		System.out.println("번호를 선택해주세요...");
		int cnt = input.nextInt();
		if(cnt==1) {
			System.out.println("등록");
			System.out.println("======메뉴 선택======");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			System.out.println("4. 이전메뉴");
			System.out.println("번호를 선택해주세요...");
			cnt=input.nextInt();
			if(cnt==1) {
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				String age = input.next();
				System.out.println("이름: ");
				String name = input.next();
				System.out.println("학번: ");
				String studentNum = input.next();
				haksaHash.put("age", age);   //put 등록 
				haksaHash.put("name", name);
				haksaHash.put("studentNum", studentNum);
				haksaHash.put("object", "학생");
				haksaList.add(haksaHash); //배열(haksaList)에 넣기
				System.out.println(name+"님이 학생부에 등록되었습니다.");
//				int count = 0;
//				for(int i=0; i<student.length;i++) {
//						System.out.println(++count +"번 학생등록"); // i는 고정. 한 학생의 3개의 정보를 가지면 되니까.
//						System.out.println("나이:");
//						student[i][0]=input.next();
//						System.out.println("이름");
//						student[i][1]=input.next();
//						System.out.println("학번:");
//						student[i][2]=input.next();
//				}
			}else if(cnt==2) {
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				String age = input.next();
				System.out.println("이름: ");
				String name = input.next();
				System.out.println("담당 과목: ");
				String subject = input.next();
				haksaHash.put("age", age);
				haksaHash.put("name", name);
				haksaHash.put("subject", subject);
				haksaHash.put("object", "교수");
				haksaList.add(haksaHash);
				System.out.println(name+"님이 담당 과목 ["+ subject+"]로 교수진에 등록되었습니다.");
//				int count = 0;
//				for(int i=0; i<professor.length;i++) {
//					System.out.println(++count +"번 교수등록");
//					System.out.println("나이:");
//					professor[i][0]=input.next();
//					System.out.println("이름");
//					professor[i][1]=input.next();
//					System.out.println("과목:");
//					professor[i][2]=input.next();
//				}
			}else if(cnt==3) {
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("나이: ");
				String age = input.next();
				System.out.println("이름: ");
				String name = input.next();
				System.out.println("담당 부서: ");
				String part = input.next();
				haksaHash.put("age",age);
				haksaHash.put("name",name);
				haksaHash.put("part",part);
				haksaHash.put("object", "관리자");
				haksaList.add(haksaHash);
				System.out.println(name+"님이 "+ part +" 부서에 등록되었습니다.");
//				int count = 0;
//				for(int i=0; i<manager.length;i++) {
//					System.out.println(++count +"관리자등록");
//					System.out.println("나이:");
//					manager[i][0]=input.next();
//					System.out.println("이름");
//					manager[i][1]=input.next();
//					System.out.println("부서:");
//					manager[i][2]=input.next();
//				}
			}else if(cnt==4) {
				continue;
			}
		}else if(cnt==2) {
			String object="";
			String nameSearch = "";
			System.out.println("찾을 이름을 입력해주세요");
			System.out.println("이름 : ");
			String name = input.next();
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
		System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
		int number = input.nextInt();
		if(number == 1) {
			continue;
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		}else if(cnt==3) {
			String nameDelete ="";
			String object = "";
			System.out.println("삭제할 이름을 입력하세요.");
			System.out.print("이름 : ");
			String name = input.next();
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
			System.out.println("계속하시려면 1, 종료하세려면 0을 입력하세요.");
			int number = input.nextInt();
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}else if(cnt==4) {
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
			System.out.println("계속 등록 1, 종료하시려면 0을 입력해주세요");
			int number = input.nextInt();
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
//			System.out.println("===학생전체출력===");
//			for(int i=0; i<student.length;i++) {
//					System.out.print("이름:\t "+ student[i][1]+" ");
//					System.out.print("나이:\t "+ student[i][0]+" ");
//					System.out.print("학번:\t "+ student[i][2]+"\n");
//					System.out.println();
//			}
//			System.out.println();
//			System.out.println("===교수전체출력===");
//			for(int i=0; i<professor.length;i++) {
//					System.out.print("이름:\t "+ professor[i][1]+" ");
//					System.out.print("나이:\t "+ professor[i][0]+" ");
//					System.out.print("과목:\t "+ professor[i][2]+"\n");
//					System.out.println();
//			}
//			System.out.println();
//			System.out.println("===관리자전체출력===");
//			for(int i=0; i<manager.length;i++) {
//					System.out.print("이름:\t "+ manager[i][1]+" ");
//					System.out.print("나이:\t "+ manager[i][0]+" ");
//					System.out.print("부서:\t "+ manager[i][2]+"\n");
//					System.out.println();
//			}
			System.out.println();
		}else if(cnt==0) {
			System.out.println("프로그램종료");
			System.exit(0);
		}else if(cnt==5) {
			System.out.println("기존에 등록했던 이름을 입력하세요.");
			System.out.println("이름: ");
			String name =input.next();
			String object= "";
			String nameUpdate="";
			for(int i=0; i<haksaList.size(); i++) {
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
						if(commit.equals("yes")|| commit.equals("YES")) {
							haksaHash = new HashMap<String, String>();							
							System.out.println("변경할 나이: ");
							String age= input.next();
							System.out.println("변경할 이름: ");
							name = input.next();
							System.out.println("변경할 학번: ");
							String studentNum=input.next();
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
							if(commit.equals("yes")|| commit.equals("YES")) {
								haksaHash = new HashMap<String, String>();							
								System.out.println("변경할 나이: ");
								String age= input.next();
								System.out.println("변경할 이름: ");
								name = input.next();
								System.out.println("변경할 담당과목: ");
								String subject = input.next();
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
							if(commit.equals("yes")|| commit.equals("YES")) {
								haksaHash = new HashMap<String, String>();							
								System.out.println("변경할 나이: ");
								String age= input.next();
								System.out.println("변경할 이름: ");
								name = input.next();
								System.out.println("변경할 담당부서: ");
								String part = input.next();
								haksaHash.put("age", age);
								haksaHash.put("name", name);
								haksaHash.put("subject", part);
								haksaHash.put("object", "관리자");
								haksaList.set(i, haksaHash);
								System.out.println("정보가 변경되었습니다.");
							}else {
								continue;
							}
						}
					}
				}
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				int number = input.nextInt();
				if(number==1) {
					continue;
				}else {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}
		}
	  }
	}

}
