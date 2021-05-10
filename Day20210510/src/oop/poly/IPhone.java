package oop.poly;

public class IPhone extends Phone{
	
	private String siri;
	
	public IPhone(String color, int serialNum, String name, String company) {
		super(color, serialNum, name, company);
	}

	public IPhone() {}

	@Override
	public void call() {
		System.out.println("IPhone call 어플로 전화를 합니다.");
	}

	@Override
	public void sms() {
		System.out.println("IMessage로 문자를 보냅니다.");
	}

	public void camera() {
		System.out.println("ICamera로 사진을 찍습니다.");
	}
	
	public void HeySiri(String siriName) {
		System.out.println("안녕하세요"+ siriName +"입니다.");
		setSiri(siriName);
	}
	
	public String getSiri() {
		return siri;
	}

	public void setSiri(String siriName) {
		this.siri = siriName;
	}

	public void phoneInfo() {
		System.out.println("아이폰 정보: "+ getColor() +", "+ getSerialNum()+", "+ getName()+ ", "+getCompany()+ ", "+this.siri);
	}
}
