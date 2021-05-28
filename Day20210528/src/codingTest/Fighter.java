package codingTest;

public class Fighter {
	String name;
	int atk;
	
	public Fighter() {
		this.name = "전사";
		this.atk = 10;
	}
	
	void Attack() {
		System.out.println(name+" 공격!");
		System.out.println("적에게 "+atk+"데미지");
	}
	
}
