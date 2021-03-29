package kr.or.kh;

public class Card {
	//인스턴스 변수 
	String kind;
	int number;
	
	//생성자함수 초기화  
	//객체가 생성이 될 때, 디폴트 생성자는 컴파일러가 자동으로 초기값으로 만들어준다. 
	public Card() {
		kind = null;
		number=0;
	}
	
	
	//static 함수 초기화
	static int width;
	static int height;
	static {
		width = 100;
		height= 250;
	}
	
	//초기화와 대입은 다르다 
	public static void main(String[] args) {
		Card card = new Card(); 
		//앞 Card는 class Card로 , 뒤 new Card는 Card()생성자로 why? 공간을 만들고 값을 넣는 것을 한꺼번에 하기 위해
		//앞 Card class는 공간만들기(초기화) 뒤 new Card는 값 대입하기.
		
		System.out.println(card.kind+":"+card.number+":"+card.width+":"+card.height);
	}
	
}
