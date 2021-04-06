package kr.or.kh.obj3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\kh\\todolist.txt"); //읽혀지긴 하는데
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int var_read = 0;
		try {
			while((var_read=fin.read())!=-1) {
				System.out.print((char)var_read); //한글은 깨진다 2byte씩 읽어야한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
