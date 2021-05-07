package oop.inherit;

public class Galaxy extends Phone{
	
	private String bixbi;
	
	public Galaxy() {}
	
	public Galaxy(String version, String color, int price) {
		super(version,color,price);
//		super.setVersion(version);
//		super.setColor(color);
//		super.setPrice(price);
	}
	
	public Galaxy(String version, String color, int price, String bixbi) {
		super(version,color,price);
		this.bixbi=bixbi;
	}

	@Override
	public void camera() {
		System.out.println("갤럭시S21의 20배줌으로 사진을 찍습니다.");
	}
	//녹음기능
	public void record() {
		System.out.println("통화내용을 녹음합니다.");
	}
	
	public String getVersion() {
		return super.getVersion();
	}

	public void setVersion(String version) {
		super.setVersion(version);
	}

	public String getColor() {
		return super.getColor();
	}

	public void setColor(String color) {
		super.setColor(color);
	}

	public int getPrice() {
		return super.getPrice();
	}

	public void setPrice(int price) {
		super.setPrice(price);
	}
	
	
}
