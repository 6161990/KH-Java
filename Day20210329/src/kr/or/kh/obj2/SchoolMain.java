package kr.or.kh.obj2;

import java.util.Scanner;

public class SchoolMain {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WomanSchool ws = new WomanSchool();
		ManSchool ms = new ManSchool();
		ManGongupSchool mgs = new ManGongupSchool();
		WomanSangupSchool wss = new WomanSangupSchool();
		
		while(true) {
			System.out.println("1.남중 2. 여중 3. 남공업고 4. 여상업고");
			int number = input.nextInt();
			if(number==1) {
				System.out.println("국어입력");
				int kor = input.nextInt();
				System.out.println("영어입력");
				int eng = input.nextInt();
				System.out.println("수학입력");
				int math = input.nextInt();
				System.out.println("기술입력");
				int gisul = input.nextInt();
				
				ms.setKor(kor);
				ms.setEng(eng);
				ms.setMath(math);
				ms.setGisul(gisul);
				
				System.out.println(ms.toString());
				
			}else if(number==2) {
				System.out.println("국어입력");
				int kor = input.nextInt();
				System.out.println("영어입력");
				int eng = input.nextInt();
				System.out.println("수학입력");
				int math = input.nextInt();
				System.out.println("가정입력");
				int gajong = input.nextInt();
				
				ws.setKor(kor);
				ws.setEng(eng);
				ws.setMath(math);
				ws.setGajong(gajong);
				
				System.out.println(ws.toString());
				
			}else if(number==3) {
				System.out.println("국어입력");
				int kor = input.nextInt();
				System.out.println("영어입력");
				int eng = input.nextInt();
				System.out.println("수학입력");
				int math = input.nextInt();
				System.out.println("기술입력");
				int gisul = input.nextInt();
				System.out.println("공업입력");
				int gongup = input.nextInt();
				
				mgs.setKor(kor);
				mgs.setEng(eng);
				mgs.setMath(math);
				mgs.setGisul(gisul);
				mgs.setGongup(gongup);
				
				System.out.println(mgs.toString());
				
			}else if(number==4) {
				System.out.println("국어입력");
				int kor = input.nextInt();
				System.out.println("영어입력");
				int eng = input.nextInt();
				System.out.println("수학입력");
				int math = input.nextInt();
				System.out.println("가정입력");
				int gajong = input.nextInt();
				System.out.println("상업입력");
				int sangup = input.nextInt();
				
				wss.setKor(kor);
				wss.setEng(eng);
				wss.setMath(math);
				wss.setGajong(gajong);
				wss.setSangup(sangup);
				
				System.out.println(wss.toString());
				
			}else {
				System.out.println("1,2,3,4 번중에 입력하세요");
			}
		}
	}

}
