package kr.or.kh2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("c:\\kh\\random.txt","rw"); //r리드 w라이터 : 읽고쓰기가 가능하게 해라 
			System.out.println("시작 파일 포인터 "+raf.getFilePointer());
			raf.writeInt(75); // 'K'
			raf.writeBoolean(false);
			raf.writeChar('A'); // 'A'
			raf.writeLong(100); // 'd'
			System.out.println("데이러 출력 파일 포인터 " + raf.getFilePointer());
			raf.seek(0);
			System.out.println("int 값 출력 : "+raf.readInt());
			System.out.println("Boolean 값 출력 : "+raf.readBoolean());
			raf.skipBytes(2); //2byte 넘겨라 
			//System.out.println("Char 값 출력 : "+raf.readChar());
			System.out.println("Long 값 출력 : "+raf.readLong());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
