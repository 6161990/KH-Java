package question;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q009 {

	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월dd일");
		Date date = myCalendar.getTime();
		System.out.println(sdf.format(date));
	}

}
