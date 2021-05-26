package question3;

public class MenuMain {
	public static void main(String[] args) {
		Menu sandwitch = new Menu("햄버거", 1500);
		Menu drink = new Menu("콜라", 1500);
		SetMenu burgerSet = new SetMenu("햄버거세트",sandwitch,drink);
		burgerSet.display();
	}
}
