package Hero;

public class Hero {
	private String name;
	private int hp;
	
	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name+"는 "+sec+"초에 앉았다.");
		System.out.println("HP가 "+sec+"포인트추가");
	}

	public int getHp() {
		return hp;
	}
	
}
