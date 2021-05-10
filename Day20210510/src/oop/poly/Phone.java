package oop.poly;

public abstract class Phone {
	//폰은 추상클래스로 만들고
	//기능은 call sms camera 만드는데 call,sms는 추상 메소드로 
	//Iphone 과 Galaxy를 각각 만들어서 phone을 상속받고
	//Iphone과 Galaxy 각각 원하는 추가기능 한개씩 더 만들기 
	// run 클래스에서 실행하기 부모타입의 참조변수로 각각 메소드 실행
	// 다운캐스팅을 이용해 부모타입으로 자식의 기능실행
	private String color;
	private int serialNum;
	private String name;
	private String company;
	
	public Phone(String color, int serialNum, String name, String company) {
		this.color = color;
		this.serialNum = serialNum;
		this.name = name;
		this.company = company;
	}
	
	public Phone() {}

	public abstract void call();
	public abstract void sms();
	public void camera() {
		System.out.println("기본 카메라로 사진을 찍습니다.");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum=serialNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	
}
