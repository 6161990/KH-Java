package kr.or.kh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest1 {

	public static void main(String[] args) {
		FileWriter fileW = null;
		BufferedWriter buW = null;
		try {
			fileW = new FileWriter("C:\\KH\\bufferedWriter.txt"); //생성기능있음
			buW = new BufferedWriter(fileW,4); //4byte 공간 만들어줌 
			buW.write('A');		
			buW.write('B');		
			buW.write('C');		
			buW.write('D');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
