package kr.or.kh.obj2;
//프로토콜을 메소드로 구조해놓은 프로그램

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
// HaksaFunction 함수클래스를  Haksa 클래스로 변경.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		Haksa haksaObj = new Haksa();  // HaksaFunction 함수클래스를  Haksa 클래스로 변경.
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
		if(cnt==1) {// 등록의 시작
			haksaObj.register();  //학사 프로그램의 기능 클래스.등록 (register)
			 if(cnt==4) {
				continue;
			}
		}// 등록의 끝 !
		else if(cnt==2) { //찾기의 시작
			haksaObj.search(); //학사 프로그램의 기능 클래스 . 찾기 (search)
			System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
			int number = input.nextInt();
			if(number == 1) {
				continue;
			}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			}
	    }// 찾기의 끝
		else if(cnt==3) { //삭제의 시작 
			haksaObj.delete();
			System.out.println("계속하시려면 1, 종료하세려면 0을 입력하세요.");
			int number = input.nextInt();
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}//삭제의 끝
		else if(cnt==4) { //전체 출력의 시작
			haksaObj.list();
			System.out.println("계속 등록 1, 종료하시려면 0을 입력해주세요");
			int number = input.nextInt();
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}// 전체출력의 끝
		else if(cnt==0) {  // 프로그램 종료의 시작
			System.out.println("프로그램종료");
			System.exit(0);
		}//프로그램 종료의 끝
		else if(cnt==5) { //수정의 시작
			String commit = haksaObj.update();
				if(commit.equals("no")|| commit.equals("NO")) {
					continue;
				}
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				int number = input.nextInt();
				if(number==1) {
					continue;
				}else {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}//수정의 끝
		}
	  }
	}


