package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test10 {

	public static void main(String[] args) throws IOException {
		File origin = new File("kh","origin.kh");
		FileInputStream in = new FileInputStream(origin);
		
		File copy = new File("kh", "copy.kh");
		FileOutputStream out = new FileOutputStream(copy);
		
		byte[] buffer = new byte[10];
		
		long total = origin.length();
		long count = 0L;
		
		Format f =new DecimalFormat("0.00");
		
		//1회
		while(true) {
			int size = in.read(buffer);
			if(size==-1)break;
			out.write(buffer,0,size);
			
			count+=size;
			double percent= count*100.0/total;
			System.out.println("loding.. "+f.format(percent)+"%");
			System.out.println("총" +total+"중  "+count+"byte이동");
		}
		
		in.close();
		
	}

}
