package kr.or.kh;

public class Card {
	//인스턴스변수 (객체) : 동적 공간
	String kind; //무늬
	int number; //숫자
	
	//클래스변수(static변수) => 카드의 높이와 넓이는 정해져있으니까 불변. 따로 메모리에 저장. 정적공간에.
	static int width; //폭
	static int height; //넓이
	static {
		width = 100;
		height=250;
	}

	public static void main(String[] args) {
		Card card1 = new Card();
		//인스턴스로 접근, heap 메모리에 저장.
		card1.kind="SPADE";
		card1.number=4;
		
		
		//설계도의 이름으로 접근, 한번에 생성된 정해진 메모리에 저장.
		//main 진입점도 static. 그래서 클래스안에 진입점이 있는거니까 
		//다이렉트로 Card에서 호출 가능. 
		width=100; //클래스없이 바로 호출가능. 
		Card.height=250;
		
		System.out.println(card1.kind+":"+card1.number);
		System.out.println(Card.width+":"+Card.height);
	}
}
