package kr.or.kh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo = null; //파일 아웃풋 스트림은 파일이 없을 시, 파일을 생성해 출력시킨다.
		String msg = "FileOutputStreamTestkkkkyj";  // 메세지 내용
		byte[] byteArray = msg.getBytes(); //문자열(2byte)을 배열로 1byte로 쪼개서 배열방에 넣고, getBytes는 배열로 바꾸는 것. string을 배열로 바꿈 
		try {
			fo = new FileOutputStream("c:\\kh\\fileoutput.txt",true);
			fo.write(byteArray); //byte로 된 것을 fo안에 넣는다. 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
