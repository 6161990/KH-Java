package kr.or.kh;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter테스트 입니다.";
		try {
			fw = new FileWriter("c:\\kh\\fileWriter.txt",true);
			fw.write(msg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
