package weather;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class TemperatureComparator implements Comparator<String[]>{

	@Override
	public int compare(String[] s1, String[] s2) {
		int maxTemp1 = (int)(Double.parseDouble(s1[1])*10);
		int maxTemp2 = (int)(Double.parseDouble(s2[1])*10);
         
		if(maxTemp1 < maxTemp2) {
			return 1;
		}else if(maxTemp1 > maxTemp2) {
			return -1;
		}else {
			int minTemp1 = (int)(Double.parseDouble(s1[2])*10);
			int minTemp2 = (int)(Double.parseDouble(s2[2])*10);
			
			if(minTemp1 < minTemp2) {
				return 1;
			}else if (minTemp1 > minTemp2) {
				return -1;
			}else {
				int avgTemp1 = (int)(Double.parseDouble(s1[3])*10);
				int avgTemp2 = (int)(Double.parseDouble(s2[3])*10);
				if(avgTemp1 < avgTemp2) {
					return 1;
				}else if(avgTemp1 > avgTemp2) {
					return -1;
				}else {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
					try {
						Date date1 = sdf.parse(s1[0]);
						Date date2 = sdf.parse(s2[0]);
						if(date1.before(date2)) {
							return -1;
						}else if(date2.before(date1)) {
							return 1;
						}else {
							return 0;
						}
					}catch (ParseException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return 0;
	}
}
