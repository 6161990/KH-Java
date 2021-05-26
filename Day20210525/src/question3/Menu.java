package question3;

public class Menu {
	 String name;
	 int price;
	
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void display() {
		System.out.println(name+" : "+price+"원");
	}
	
	
}
