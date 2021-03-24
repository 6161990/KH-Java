package kr.or.kh;

public class CharOperatorExample {

	public static void main(String[] args) {
		//타입 변환
		char c1 = 'A'+1;
		char c2 = 'A';
		//char c3 = c2 + 1; char 타입이 산술 연산 될 경우 int 타입으로 변환됨. c3의 형변환은 int임. error
		char c3 = (char) (c2+1); 
		int c3_1 = c2 +1; 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("B= "+c3_1);
	}

}
