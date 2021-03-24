package kr.or.kh;

public class LogicTest4 {

	public static void main(String[] args) {
		String id = args[0]; // 메인 진입점 직접처리
		String pw = args[1];
		if(!id.equals("Yoonji_Sarang")) { //대소문자구별됨
			System.out.println("등록되어있지 않은 아이디입니당!");
		}else if(!pw.equals("user11")) {
			System.out.println("비밀번호를 확인하세요.");
		}else {
			System.out.println("kh 오신것을 환영합니다.");
		}
	}

}
