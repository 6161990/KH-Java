package kr.or.kh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		FileInputStream fi = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fo = new FileOutputStream("c:\\kh\\dataFile.txt"); //아웃풋은 생성기능 있음 파일 만듦.
			fi = new FileInputStream("c:\\kh\\dataFile.txt");
			dos = new DataOutputStream(fo);
			dis = new DataInputStream(fi);
			
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("dataStreamTest");
			System.out.println(dis.readUnsignedShort()); //2바이트의 입력데이터를 읽기, 0~65535범위의 int값을 return 합니다. 
			dis.skip(1); //현재 읽고 있는 위치에서 지정된 숫자만큼 건너뛴다.
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				fo.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
