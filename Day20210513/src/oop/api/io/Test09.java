package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {

	public static void main(String[] args) throws IOException {
		
		File origin = new File("kh","origin.kh");
		FileInputStream in = new FileInputStream(origin);
		
		File copy = new File("kh", "copy.kh");
		FileOutputStream out = new FileOutputStream(copy);
		
		byte[] buffer = new byte[20];
		
		//1회
		while(true) {
			int size = in.read(buffer);
			if(size==-1)break;
			out.write(buffer,0,size);
			
		}
		
		in.close();
		
	}

}
