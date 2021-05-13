package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04_1 {

	public static void main(String[] args) throws IOException {
		//byte 입력
		//목표는 kh 폴더 안에 있는 single.kh 파일에 있는 내용을 읽어서 콘솔에 출력해보자
		//준비물 : 파일 객체, 입력 통로
		File file = new File("kh","single.kh");
		FileInputStream in = new FileInputStream(file);
				
		//프로그램 <------in <------
		
		//-1이 입력되면 더 이상 남은 데이터가 없다는 뜻
		//-1과 같은 값들을 EOF 라고 부름. (End Of File)
		while(true) {
			int n =in.read();
			if(n==-1)break;
			System.out.println("n = " + n);
		}
		in.close();
	}

}
