package question3;

public class SetMenu{
	 String name;
	 Menu sandwith;
	 Menu drink;
	
	
	
	public SetMenu(String name, Menu sandwith, Menu drink) {
		super();
		this.name = name;
		this.sandwith = sandwith;
		this.drink = drink;
	}



	public void display() {
		System.out.println("실행결과");
		System.out.println(this.name);
		System.out.println("------");
		sandwith.display();
		drink.display();
		System.out.println("------");
		
		int price = (int)((sandwith.price + drink.price) * 0.8);
		System.out.println("세트가격: "+ price);

	}
	
}
