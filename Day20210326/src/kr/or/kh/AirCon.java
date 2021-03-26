package kr.or.kh;

public class AirCon {
	//에어컨의 설계도
	//설계를 할 때 필요한 특성들을 멤버변수로 만든다 .
	
	//변수정의
	//속성 담당 (특성)
	String company; //제조사
	String color; //색깔
	int price; //가격
	int size; //에어콘 크기
	int temp; //에어컨 온도
	
	//메소드정의
	//기능 담당 (행위)
	public void powerOn() {
		System.out.println("전원켰다.");
	}
	public void powerOff() {
		System.out.println("전원껐다.");
	}
	public void tempUp() {
		temp++;
	}
	public void tempDown(){
		temp--;
	}
	public static void main(String[] args) {
		//변수
		AirCon airCon = new AirCon();
		airCon.company="삼성";
		airCon.color="흰색";
		airCon.price=100000;
		airCon.size=10;
		airCon.temp=0;
		System.out.println(airCon.company+":"+airCon.color+":"+airCon.price+":"+airCon.size+":"+airCon.temp);
		System.out.println("=====================");
		
		//함수
		airCon.tempUp();
		System.out.println(airCon.temp);
		airCon.tempDown();
		System.out.println(airCon.temp);
		//System.out.println(airCon.powerOn()); 멤버변수가 아니라 변수로써 출력할 수 없다.
		
		airCon.powerOn();
		airCon.powerOff();
	
	}

}
