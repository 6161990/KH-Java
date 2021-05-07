package oop.inherit;

public class Iphone extends Phone{
	
	private String siri;

	public Iphone() {}
	
	public Iphone(String version, String color, int price, String siri) {
		super(version,color,price);
//		super.setVersion(version);
//		super.setColor(color);
//		super.setPrice(price);
		this.siri=siri;
	}

	@Override
	public void camera() {
		System.out.println("아이폰 12의 광각 카메라로 사진을 찍습니다.");
	}
	public void airDrop() {
		System.out.println("파일을 주고 받습니다.");
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
