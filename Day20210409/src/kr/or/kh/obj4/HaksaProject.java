package kr.or.kh.obj4;

//프로토콜을 기준으로 함수 만들기 
//static제거해서 인스턴스 메소드로 변경하기
//HaksaClass만들기 HaksaFunction메소드를 전부 옮기기 , HaksaFunction필요없음  제거 
//Register,Search,Delete,List,Update 객체 만들기 , HaksaClass 필요없음 제거
//HaksaProject 내에서 Haksa 인스턴스 제거, 그 자리에 만든 5개의 객체들 생성
//학생, 교수, 관리자 클래스 따로 생성 
//입력받는 Scanner input 전부 예외 처리 예외클래스 8개 생성
//[Register],[Search],[Delete],[List],[Update] 의 메소드들 Haksa클래스에 넘겨 상속
//상속관계였던 Haksa와 다른 클래스들 관계 전환 -> 클래스 안에 Haksa 포함관계 인스턴스 생성-> 참조변수로 메소드, 변수 호출 변경
//추상클래스 만들기. 강제 메서드 선언해놓고 구현클래스에서 오버라이드.
public class HaksaProject {

	public static void main(String[] args) {
	
		
		//객체들
		Register registerObj = new Register();
		Search searchObj = new Search();
		Delete deleteObj = new Delete();
		List listObj = new List();
		Update updateObj = new Update();
		
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
		int cnt=1;
		int number=0;
		try {
			cnt = Haksa.input.nextInt();
			if (cnt < 0 || cnt > 5) {
				throw new HaksaMenuException("메뉴 중에 선택하세요");
			} 
		} catch (HaksaMenuException e){
			e.printStackTrace();
			continue;
		}
		
		if(cnt==1) {
			registerObj.register();

			if(cnt==4) {
				continue;
			}
		
		}else if(cnt==2) {
			searchObj.search();

		System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
		
		try {
			number = Haksa.input.nextInt();
			if( number < 0 || number > 1) {
				throw new HaksaMenuException("음수이거나 1이상의 숫자이면 에러입니다.");
			}
		} catch (HaksaMenuException e) {
			e.printStackTrace();
			continue;
		}
		
		if(number == 1) {
			continue;
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		}else if(cnt==3) {
			deleteObj.delete();
			System.out.println("계속하시려면 1, 종료하세려면 0을 입력하세요.");
			try {
				number = Haksa.input.nextInt();
				if( number < 0 || number > 1) {
					throw new HaksaMenuException("음수이거나 1이상의 숫자이면 에러입니다.");
				}
			} catch (HaksaMenuException e) {
				e.printStackTrace();
				continue;
			}
			if(number==1) {
				continue;
			}else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}else if(cnt==4) {
			listObj.list();
			System.out.println("계속 등록 1, 종료하시려면 0을 입력해주세요");
			try {
				number = Haksa.input.nextInt();
				if( number < 0 || number > 1) {
					throw new HaksaMenuException("음수이거나 1이상의 숫자이면 에러입니다.");
				}
			} catch (HaksaMenuException e) {
				e.printStackTrace();
				continue;
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
				updateObj.update();
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				try {
					number = Haksa.input.nextInt();
					if( number < 0 || number > 1) {
						throw new HaksaMenuException("음수이거나 1이상의 숫자이면 에러입니다.");
					}
				} catch (HaksaMenuException e) {
					e.printStackTrace();
					continue;
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


