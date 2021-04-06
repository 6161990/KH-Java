package kr.or.kh.obj3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream1 {
//여러 개 파일을 한꺼번에 묶어서 가져오는 데 벡터 배열을 이용할 수 있고 이넘래이션으로 속도를 향상시킨다.
	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		FileInputStream fin3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		
		try {
			fin1 = new FileInputStream("c:\\kh\\test1.txt");
			fin2 = new FileInputStream("c:\\kh\\test2.txt");
			fin3 = new FileInputStream("c:\\kh\\test3.txt");
			Vector v = new Vector(); //배열 
			v.add(fin1); //0
			v.add(fin2); //1
			v.add(fin3); //2 번지 
			Enumeration fins = v.elements(); //Enumeration인터페이스: 접근속도 향상 
			si1 = new SequenceInputStream(fins); //연속적으로 읽어오기 위해 
			int var_readbyte =-1;
			
			while((var_readbyte=si1.read())!=-1) {
				System.out.print((char)var_readbyte);
			} 
			System.out.println();
			fin1 =new FileInputStream("c:\\kh\\test1.txt");
			fin2 = new FileInputStream("c:\\kh\\test2.txt");
			si2 = new SequenceInputStream(fin1, fin2);
			var_readbyte =-1;
			while((var_readbyte=si2.read())!=-1) {
				System.out.print((char)var_readbyte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				si1.close();
				si2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		


		
	}

}
