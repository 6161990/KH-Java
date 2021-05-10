package oop.poly;

public class Galaxy extends Phone{
	
	String bixbi;

	public Galaxy(String color, int serialNum, String name, String company) {
		super(color, serialNum, name, company);
	}

	public Galaxy() {}

	@Override
	public void call() {
		System.out.println("Galaxy call 어플로 전화를 합니다.");		
	}

	@Override
	public void sms() {
		System.out.println("Space 어플로 문자를 보냅니다.");
	}
	
	public void camera() {
		System.out.println("Galaxy 20배줌으로 사진을 찍습니다.");
	}
	
	public void Hellobixbi(String bixbiName) {
		System.out.println("당신의 친구 "+ bixbiName +"입니다.");
		setBixbi(bixbiName);
	}
	public void setBixbi(String bixbiName) {
		this.bixbi = bixbiName;
	}
	
	public String getBixbi() {
		return bixbi;
	}

	

	public void phoneInfo() {
		System.out.println("아이폰 정보: "+ getColor() +", "+ getSerialNum()+ ", "+getName()+ ", "+getCompany()+ ", "+this.bixbi);
	}
}
