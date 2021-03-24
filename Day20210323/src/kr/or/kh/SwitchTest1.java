package kr.or.kh;

public class SwitchTest1 {

	public static void main(String[] args) {
		String job = args[0];
		int salary = 0;
		switch(job) {
		case "사원" :
			salary = 2000000;
			System.out.println("case 사원 :break없음");
		//	break;		// switch의 끝을 빠져나간다. 
		case "대리" :
			salary = 3000000;
			System.out.println("case 대리 :break없음");
		//	break;    //break가 없으면 밑에 있는 명령어가 모두 수행됨
		case "과장" :
			salary = 4000000;
			System.out.println("case 과장 :break없음");
		//	break;
		case "부장" :
			salary = 5000000;
			System.out.println("case 부장 :break없음");
		//	break;
		default :
			System.out.println("default :break없음");
			System.out.println("직급을 잘못입력했습니다.");
		}
		System.out.println(job+"님의 봉급은"+ salary+"만원 입니다.");
	
		
	}

}
