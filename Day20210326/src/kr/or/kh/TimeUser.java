package kr.or.kh;

public class TimeUser {

	public static void main(String[] args) {
		Time time = new Time();
		time.hour=7;
		time.minute=25;
		time.second=30;
		System.out.println(time.hour+":"+time.minute+":"+time.second);
	}

}
