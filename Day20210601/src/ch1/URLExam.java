package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExam {
	public static void main(String[] args) {
		URL u = null;
		try {
			u = new URL("https://6161990src.tistory.com/");
		}catch (MalformedURLException e) {
			System.out.println("URL이 틀립니다.");
			System.exit(0);
		}
		try (
			InputStream in = u.openStream();
			InputStreamReader is = new InputStreamReader(in); 
		){
			BufferedReader br = new BufferedReader(is);
			String s;
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}catch(IOException e) {
			System.out.println("IO 오류가 발생했습니다");
		}
	}

}
