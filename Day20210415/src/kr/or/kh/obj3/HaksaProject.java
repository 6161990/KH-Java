package kr.or.kh.obj3;
import java.util.Scanner;


public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Register registerObj= new Register();
		Search searchObj=new Search();
		Delete deleteObj = new Delete();
		List listObj=new List();
		Update updateObj= new Update();
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
			if(cnt < 0 || cnt > 5) {
				System.out.println("에러");
			}
	    	 	
			if(cnt==1) {
				registerObj.register();
			}//등록
			
			else if(cnt==2) { //찾기
				searchObj.search();
				System.out.println("계속하시려면 1, 종료하시려면 0을 입력하세요.");
				int number = input.nextInt();
				if(number <0 || number>5) {
					System.out.println("에러");
				}
				if(number==1) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
			}//찾기
			
			else if(cnt==3) {//삭제
				deleteObj.delete();
					System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
					int number = input.nextInt();
					if(number<0 ||number>1) {
						System.out.println("에러");
					}
					if(number == 1) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						System.exit(0);
					}
			}//삭제
	
			else if(cnt==4) {//전체출력
				listObj.list();
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				int number = input.nextInt();
				if(number<0 ||number>1) {
					System.out.println("에러");
				}
				if(number == 1) {
					continue;
				}else {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}//전체출력
			else if(cnt==0) {//종료
				System.out.println("프로그램 종료");
				System.exit(0);
			}//종료
			else if(cnt==5) {//수정
				String result=updateObj.update();
				if(result.equals(result)) {
					continue;
				}
			}//수정
			
		}
	
	}

}
