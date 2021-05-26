package Hero;

public class HeroMain {

	public static void main(String[] args) {
		Hero hero1 = new Hero("김윤지", 100);
		hero1.sit(5);
		System.out.println(hero1.getHp());
	}

}
