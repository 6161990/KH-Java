package oop.inherit;

public class Phone {
	
		private String version;
		private String color;
		private int price;
	
		
		public Phone() {}
		
		public Phone(String version, String color, int price) {
			this.version = version;
			this.color = color;
			this.price = price;
		}

		//통화기능
		public void call() {
			System.out.println("전화를 합니다");
		}
		
		//카메라기능
		public void camera() {
			System.out.println("사진을 찍습니다");
		}
		
		//문자기능
		public void sms() {
			System.out.println("문자를 주고 받습니다. ");
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		
}
