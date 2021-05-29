package weather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;



public class weather {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("weather\\data.csv"))) {
			String msg;
			ArrayList<String[]> tempList = new ArrayList<String[]>();
			while(( msg = br.readLine())!= null) {
				String msgs[] = msg.split(",");
				tempList.add(msgs);
			}
			TemperatureComparator tc = new TemperatureComparator();
			Collections.sort(tempList,tc);
			for(String msgs[] :tempList){
                System.out.println(msgs[1] + "," + msgs[2] + "," + msgs[3] + "," + msgs[0]);
            }
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

