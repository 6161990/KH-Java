package oop.api.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
		//목표: kh 라는 폴더 안에 single.kh 라는 이름의 파일을 만들고 원하는 내용을
		//byte단위로 출력
		//준비물은 파일 객체와 출력통로
		File file = new File("kh","single.kh");
		
		FileOutputStream out = new FileOutputStream(file);
		
		//프로그램 ------ out ------> file------->[single.kh]
		
		out.write(65); //out으로 65라는 byte 데이터를 출력하라 
		out.write('B');
		out.write(67);
		
		out.close();
	}

}
