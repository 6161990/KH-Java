package kr.or.kh;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		FileOutputStream fileOutputS = null;
		OutputStreamWriter outWriter = null;
		BufferedWriter buffW = null;
		
		try {
			fileOutputS = new FileOutputStream("c:\\kh\\outputStream.txt");
			outWriter = new OutputStreamWriter(fileOutputS);
			buffW = new BufferedWriter(outWriter);
			buffW.write("아웃풋 스트림 라이터 테스트");
			buffW.newLine();
			buffW.write("윤지짱 화이또 데쓰네!!!");
			buffW.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
