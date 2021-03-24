package kr.or.kh;

public class ConditionalOperatorExample {
 
	public static void main(String[] args) {
		//삼항연산자
//		int score = 95;
//		char grade = (score>90)?'A': 'B'; 
//		System.out.println(grade);
		
		int score = 95;
		String grade = (score>=95)? "A+" :((score>90)? "A": "B");
		System.out.println(score+ "점은 "+ grade+" 등급입니다.");
		
		
	}

}
