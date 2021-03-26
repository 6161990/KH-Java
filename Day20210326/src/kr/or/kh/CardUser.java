package kr.or.kh;

public class CardUser {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.kind="SPADE";
		card1.number=4;
		
		//Card 클래스에서 초기화되었음 
//		Card.width=100;
//		Card.height=250; 
		
		System.out.println(card1.kind+":"+card1.number);
		System.out.println(Card.width+":"+Card.height);
	}

}
