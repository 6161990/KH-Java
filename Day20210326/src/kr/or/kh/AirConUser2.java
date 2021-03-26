package kr.or.kh;

public class AirConUser2 {

	public static void main(String[] args) {
		
		AirCon airCon1 = new AirCon();
		//변수사용
		airCon1.color="White";
		airCon1.temp=10;
		airCon1.price=10000;
		
		//메소드사용
		airCon1.tempUp();
		System.out.println(airCon1.temp+":"+airCon1.color+":"+airCon1.price+"원");
			
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println(airCon1.temp+":"+airCon1.color+":"+airCon1.price+"원");
		
		AirCon airCon2 = new AirCon();
		//인스턴스 멤버 변수는 객체가 생성될 때 객체별로 초기화됨. 
		//초기화하지 않으면 기본값으로 초기화 -> 함수에서는 int i; 를 그대로 출력할 때 에러남. 클래스와 함수에서의 변수 차이(멤버변수와 지역변수의차이)
		System.out.println(airCon2.temp+":"+airCon2.color+":"+airCon2.price+"원");
	
	}

}
