package kr.or.kh.function;


//기존에 프로토콜을 if로 구조해놓은 프로그램 
//프로토콜을 기준으로 HaksaFunction클래스에 함수 만들기 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();

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
		if (cnt < 0 || cnt > 5) {
			System.out.println("음수이거나 5 이상이면 에러입니다. 메뉴 중에 선택하세요.");
		}
		if(cnt==1) {
			HaksaFunction.register(cnt, input, haksaList);

			if(cnt==4) {
				continue;
			}
		
		}else if(cnt==2) {
			HaksaFunction.search(cnt, input, haksaList);

		System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
		int number = input.nextInt();
		if( number < 0 || number > 1) {
			System.out.println("음수이거나 1이상이면 에러입니다.");
		}
		if(number == 1) {
			continue;
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		}else if(cnt==3) {
			HaksaFunction.delete(cnt, input, haksaList);
			System.out.println("계속하시려면 1, 종료하세려면 0을 입력하세요.");
			int number = input.nextInt();
			if( number < 0 || number > 1) {
				System.out.println("음수이거나 1이상이면 에러입니다.");
			}
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}else if(cnt==4) {
			HaksaFunction.list(haksaList);
			System.out.println("계속 등록 1, 종료하시려면 0을 입력해주세요");
			int number = input.nextInt();
			if( number < 0 || number > 1) {
				System.out.println("음수이거나 1이상이면 에러입니다.");
			}
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

			System.out.println();
		}else if(cnt==0) {
			System.out.println("프로그램종료");
			System.exit(0);
		}else if(cnt==5) {//수정 시작 
				HaksaFunction.update(input, haksaList);
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				int number = input.nextInt();
				if( number < 0 || number > 1) {
					System.out.println("음수이거나 1이상이면 에러입니다.");
				}
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


