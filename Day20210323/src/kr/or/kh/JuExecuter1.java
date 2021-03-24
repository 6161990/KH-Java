package kr.or.kh;

public class JuExecuter1 {

	public static void main(String[] args) {
		//args의 0번째를 charAt으로 변환해 가져와라(한문자를 찾아와라, "더블콤마를" '싱글콤마'로 바꾸는 것을 포함)
		char ju = args[0].charAt(0); // [0] 번째 arg : 주문여부
		if(ju == 'y' || ju =='Y') {
			System.out.println("어서오십시오. 주문선택해주세요.");
			System.out.println("메뉴1. 자장면 2. 짬뽕 2.탕수육");
			int menu = Integer.parseInt(args[1]); // [1]번째 arg : 메뉴
			if(menu ==1) {
				System.out.println("자장면 하나 맞죠?");
				System.out.println("곱배기하세요?");
				char gob = args[2].charAt(0); // [2]번째 arg : 짜장면 곱배기 유무
				if(gob =='y' || gob == 'Y') {
					System.out.println("여기 곱배기하나");
				}else {
					System.out.println("아뇨 걍 주세요");
				}
			}else if(menu ==2) {
				System.out.println("예 짬뽕이요");
				System.out.println("곱배기 하세요?");
				char gob = args[2].charAt(0); // [2]번째 arg : 짬뽕 곱배기 유무
				if(gob == 'y' || gob == 'Y') {
					System.out.println("예 곱배기로 주세요");
				}else {
					System.out.println("아뇨 대신 국물만 좀 더 주세요");
				}
			}else if(menu ==3) {
				System.out.println("탕수육 소짜, 대짜 뭘로드려요?");
				int tang = Integer.parseInt(args[2]); //[2]번째 arg : 탕수육 소,대 선택
				if (tang ==1){
					System.out.println("큰거요");
				} else if (tang==2) {
					System.out.println("혼자먹어요 작은거요");
				}
			}else {
				System.out.println("메뉴 중 선택해주세요");
			}
		}else {
			System.out.println("다음에 또 오십시오");
		}
	}

}
