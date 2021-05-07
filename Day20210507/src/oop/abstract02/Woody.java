package oop.abstract02;

public class Woody extends Doll{
	private String name;
	private int price;
	private String factory;
	
	public Woody(String name, int price, String factory) {
		super(name, price, factory);
	}

	@Override
	public void saying() {
		System.out.println("안녕 난 우디라고 ㅎㅐ");
	}

	@Override
	public void acting() {
		System.out.println("나는 말을 타는 카우보이");
	}

	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public int getPrice() {
		return price; //super안함
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFactory() {
		return super.getFactory();
	}

	public void setFactory(String factory) {
		super.setFactory(factory);
	}

	public void print() { //가격은 super안함
		System.out.println(getName()+", "+this.getPrice()+", "+getFactory());
	}

	@Override
	public String toString() {
		return "Woody [name=" + name + ", price=" + price + ", factory=" + factory + "]";
	}

}
