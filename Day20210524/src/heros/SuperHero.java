package heros;

public class SuperHero extends Hero {
	
	
	@Override
	public void run() {
		System.out.println("Super Hero's 도망");
	}
	public void fly() {
		System.out.println("날아라");
	}
	public void land() {
		System.out.println("착지");
	}
	

}
