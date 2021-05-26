package question;

public class Hero {
	public String name;
	public int hp;
	
	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
	public static void main(String[] args) {
		Hero h1 = new Hero("김윤지",100);
		System.out.println(h1);
	}
}
