package kr.or.kh;

public class InputDataCheckNanExample1 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		if(Double.isNaN(val)) {  // true 또는 false값이 나옴
			System.out.println("NaN이 입력되어 처리될 수 없음");
			val = 0.0;  //NaN 상태의 val을 바꿔줌
		}
		currentBalance += val; //currentBalance = currentBalance +  val
		System.out.println(currentBalance); //val을 바꿔주었기 때문에 원래의 10000.0;이 잘나옴
	}

}
