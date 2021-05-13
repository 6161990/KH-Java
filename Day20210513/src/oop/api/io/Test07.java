package oop.api.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) throws IOException {
		//목표는 1byte 출력을 여러개 묶어서 처리해보자
		//byte -> byte[]
		
		
		//준비
		File file = new File("kh","single2.kh");
		FileOutputStream out = new FileOutputStream(file);
		
		byte[] data = new byte[] {104,101,108,108,111};
		
		out.write(data); //data 배열의 내용을 출력해라
		out.write(data,0,3);
		out.close();
	}

}
