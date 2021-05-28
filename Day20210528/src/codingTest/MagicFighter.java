package codingTest;

public class MagicFighter extends Fighter{
	int mp;

	public MagicFighter() {
		super();
		super.name="마법사";
		this.mp = 20;
	}
	
	void Attack() {
		System.out.println(name+" 공격!");
		System.out.println("적에게 "+(atk+mp)+"데미지");
	} 
	
	
}
