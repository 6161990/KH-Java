package oop.abstract02;

public class buzz extends Doll{

	public buzz(String name, int price, String factory) {
		super(name, price, factory);
	}

	@Override
	public void saying() {
		System.out.println("Hi-! nice to meet Woody, i'm Buzz");
	}

	@Override
	public void acting() {
		System.out.println("I'm astronaut, i can fly space");
	}

	
}
