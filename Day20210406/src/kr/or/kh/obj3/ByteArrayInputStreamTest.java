package kr.or.kh.obj3;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {

	public static void main(String[] args) {
		byte[] datas = new byte[] {10,20,30,40};
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readbyte = 0;
		while((var_readbyte =bai.read())!=-1) {
			System.out.print(var_readbyte+" ");
		}
	}

}
