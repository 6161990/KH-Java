package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
	
	public static void main(String[] args) throws IOException {
		//실제로 용량이 큰 파일들도 잘 복사가 될까?
		File origin = new File("C:/","test.mp3");
		FileInputStream in = new FileInputStream(origin);
		
		File copy = new File("C:/", "copy.mp3");
		FileOutputStream out = new FileOutputStream(copy);
		
		long count =origin.getFreeSpace();
		long total = origin.getTotalSpace();
		while(true) {
			int n =in.read();
			if(n==Test05.EOF)break;
			out.write(n);
			count++;
			System.out.println("총"+total+"중"+count+"byte 이동완료");
		}

	
		in.close();
		out.close();
		
	}

}
