package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q4 {
	public static void main(String[] args) {
		
	  try {	
		FileReader file = new FileReader(args[0]); // city\\city.txt 
		BufferedReader buff = new BufferedReader(file);
		FileWriter writer = new FileWriter(args[1]); // city\\city2.txt
		String text;
		while((text=buff.readLine())!=null) {
			System.out.println(text);
			writer.write(text);
			writer.write("\r\n");
		}
		file.close();
		writer.close();
	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
	}

}
