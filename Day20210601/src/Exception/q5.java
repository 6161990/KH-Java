package Exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class q5 {
	public static void main(String[] args) {
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream("city\\city.txt"));
			BufferedReader buff = new BufferedReader(reader);
			
			String text;
			Map<String, String> map = new HashMap<String, String>();
			
			while((text = buff.readLine()) != null) {
				String[] value = text.split(" ");
				map.put(value[0], value[1]);
			}
			reader.close();
			
			for(Map.Entry<String, String> e : map.entrySet()) {
				System.out.println(e.getKey()+" : "+e.getValue());
			}
			String place = map.get("SEOUL");
			if(place != null) {
				System.out.println("SEOUL=>"+place);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
