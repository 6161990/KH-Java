package codingTest;

public class Clock {
	String time;

	public Clock(String time) {
		this.time = time;
	}
	
	void showTime() {
		System.out.println("지금은"+time+"입니다.");
	}
}
