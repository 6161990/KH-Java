package kr.or.kh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		String msg = "ByteArrayOutputStreamTest";
		ByteArrayOutputStream bao = null;		
		try {
			bao = new ByteArrayOutputStream();
			bao.write(msg.getBytes()); //getBytes는 배열로 바꾸는 것. string을 배열로 바꿈
			System.out.println("bao= "+bao);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bao.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
