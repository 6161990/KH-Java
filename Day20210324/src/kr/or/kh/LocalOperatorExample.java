package kr.or.kh;
 
public class LocalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		if((charCode>=65)&(charCode<=90)) { //& 한개는 기계적 비교 , 앞에 피연산자가 틀리던 맞던 둘다 평가함 &&가 더 효율적
			System.out.println("대문자이군요.");
		}
		if((charCode>=97)&&(charCode<=122)) { //&& 두개는 생각비교 false임
			System.out.println("소문자이군요.");
		}
		if(!(charCode<48)&&!(charCode<=122)) { 
			System.out.println("0~9숫자이군요");
		} 
		
		int value=6;
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수군요"); //기계적비교, 피연산자 모두 평가
		}
		if((value%2==0)||(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
	}

}
