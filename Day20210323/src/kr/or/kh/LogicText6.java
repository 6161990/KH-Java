package kr.or.kh;

public class LogicText6 {

	public static void main(String[] args) {
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		
		int total = 0; 
		total = kor + eng + math;
		
		if(total >= 180) {
			if(kor < 40 || eng < 40 || math < 40) {
				System.out.println("과락입니다.");
			} else {
				System.out.println("통과하셨습니다.");
			}	
		}else {
			System.out.println("총점이 부족합니다");
		}
	}

}
