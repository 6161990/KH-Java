package kr.or.kh;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {

	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
			fi = new FileInputStream("c:\\kh\\address.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			String str = null;
			while((str = bfr.readLine())!=null) {
				st = new StringTokenizer(str,",");
				System.out.println("이름: "+st.nextToken()+",  주소: "+st.nextToken()+",  전화번호: "+st.nextToken());		
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
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
