package kr.or.kh;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
			FileInputStream fi = null; //1바이트에서 
			InputStreamReader isr = null; //2 바이트로 : 한글도 읽어올 수 있음
			BufferedReader  bfr = null; //빠르게 성능 업 
			/*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("입력하숑");
			input.readLine();*/  //Scanner 말고 성능 좋게 이용하는 키보드 입력기능 
	  try {
			fi = new FileInputStream("c:\\kh\\bufferedReader.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			String str = null;
			while((str = bfr.readLine())!=null) { //라인 별로 끝까지 읽어오는 기능 
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				isr.close();
				bfr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
