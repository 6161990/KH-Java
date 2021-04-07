package kr.or.kh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest3 {

	public static void main(String[] args) {
		FileWriter fileW = null;
		BufferedWriter buW = null;
		
		try {
			fileW = new FileWriter("c:\\kh\\bufferedWriter3.txt");
			buW = new BufferedWriter(fileW,4); //버퍼에 4칸의 임시공간을 만듦.
			buW.write("여러 라인 출력 예제 1라인");
			buW.newLine(); //줄바꿔라
			buW.write("여러 라인 출력 예제 2라인");
			buW.newLine();
			buW.write("여러 라인 출력 예제 3라인");
			buW.newLine();
			buW.write("여러 라인 출력 예제 4라인");
			buW.newLine();
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
