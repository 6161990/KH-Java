package oop.abstract02;

public abstract class Doll {
	
	//인형들의 대사, 동작, 향기가 나는 메소드
	//그중의 2개는 abstract 1개는 final
	//우디랑 버즈 클래스 만들기
	
	private String name;
	private int price;
	private String factory;
	
	
	
	public Doll(String name, int price, String factory) {
		this.name = name;
		this.price = price;
		this.factory = factory;
	}
	public abstract void saying();
	public abstract void acting();
	public final void perfuming() {
		
		System.out.println("라벤ㄷ ㅏ 향기 뿜뿜!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	@Override
	public String toString() {
		return "Doll [name=" + name + ", price=" + price + ", factory=" + factory + "]";
	}
	
	
	
}
