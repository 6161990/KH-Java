package kr.or.kh;

public class AccuracyExample {

	public static void main(String[] args) {
		//부동소수점의 오류 
		//정확한 계산은 정수연산으로 변경 후 마지막에 double 형으로 받는다. 
//		int apple = 1;
//		double priceUnit =0.1;
//		int number =7;
//		double result = apple - number * priceUnit;
//		System.out.println("사과한개에서");
//		System.out.println("0.7 조각을 빼면");
//		System.out.println(result + "조각이 남는다."); //출결 0.299999999999993 조각이 남는다

		int apple = 1;
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number;
		double result = temp / 10.0;
		System.out.println("사과한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
	}

}
