package kr.or.kh3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://github.com/6161990/TIL"); //https는 s: 시큐리티, 보안이 들어감
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			String str = "";	
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
