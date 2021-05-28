package codingTest;

public class AlarmClock extends Clock{
	String alarmTime;
	
	public AlarmClock(String time) {
		super(time);
	}

	void Alarm() {
		if(time.equals(alarmTime)) {
			System.out.println("일어나라 일어나 제발~~~~~");
		}else {
			System.out.println("아직 알람이 울릴 시간이 아닙니다.");
		}
	}

	public String getAlarmTime() {
		return alarmTime;
	}

	public void setAlarm(String time) {
		this.alarmTime = time;
	}

}
