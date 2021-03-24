package kr.or.kh;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int) (Math.random()*20)+81; //101= 81이상 100이하를 하려는데 매스 랜덤은 0~19.9999이다. 따라서 +! 해주고 정수로 형변환한다. 
		System.out.println("점수:"+score);
		String grade="";
		if(score>=90) {
			if(score>=90) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B";
			}
		}
		System.out.println("학점: "+grade);
	}

}
