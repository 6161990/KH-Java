package kr.or.kh;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time =(int)(Math.random()*4)+9; //8에서 11시 사이의 정수
		System.out.println("[오전 근무 리스트]");
		System.out.println("[현재시간:"+time+"시]");
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default : 
			System.out.println("외근을 나갑니다.");
		}
	}
	//break가 없으면 전부다 연결되는 특성을 이용한 경우도 있음

}
