package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static final int EOF = -1;
	
	public static void main(String[] args) throws IOException {
		//복사 프로그램을 만들어보자!
		//준비물 : 입력파일 객체, 입력 스트림 객체, 출력파일객체, 출력 스트림 객체
		File origin = new File("kh","origin.kh");
		FileInputStream in = new FileInputStream(origin);
		
		File copy = new File("kh", "copy.kh");
		FileOutputStream out = new FileOutputStream(copy);
		
		//[origin.kh]---->origin----> in ---->[프로그램]---->out--->copy--->[copy.kh]
		
		//1글자만 복사
		//in을 통해서 1byte를 read
		//out을 통해서 1byte를 write
		//EOF 를 만나면 반복을 멈춰라 (복사를 멈춰라)
		while(true) {
			int n =in.read();
			if(n==EOF)break;
			out.write(n);
		}


	
		//통로닫기
		in.close();
		out.close();
		
	}

}
