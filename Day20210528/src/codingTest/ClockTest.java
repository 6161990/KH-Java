package codingTest;

public class ClockTest {

	public static void main(String[] args) {
		Clock clock = new Clock("10:30");
		clock.showTime();
		
		AlarmClock alarmClock = new AlarmClock("14:30");
		alarmClock.showTime();
		alarmClock.setAlarm("14:00");
		alarmClock.Alarm();
		alarmClock.setAlarm("14:30");
		alarmClock.Alarm();
	}

}
