package oop.basic01;

public class Test04 {
	
	public static void main(String[] args) {
		GameCha cha1 = new GameCha("파워전사","궁수");
		cha1.setLevel(2);
		cha1.setMoney(1000);
		cha1.setEngage(30);
		cha1.print();
		
		
		GameCha cha2 = new GameCha("나는야콩콩이","도적",2,400);
		cha2.print();
		
		cha2.setEngage(100);
		cha2.print();
		
		GameCha cha3 = new GameCha("김배우","전사",6,17000);
		cha3.print();
		
		cha1.setEngage(30);
		cha1.print();
	}

}
