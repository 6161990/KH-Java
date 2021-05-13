package oop.api.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) throws IOException {
		//목표 : 1byte 입력을 여러개 묶어서 처리
		//여러개를 한번에 가져오면 빠르지만
		//몇개씩 가져올지는 어떻게 정할까?(버퍼크기설정)
		
		//ex:버퍼의 크기를 5로 설정하고 진행해보자
		
		//준비물 : 파일, 스트림, 버퍼
		File file = new File("kh","single2.kh");
		FileInputStream in = new FileInputStream(file);
		
		byte[] buffer = new byte[5];
		//buffer에 입력가능한 모든 데이터를 순서대로 채워라
		while(true) {
			int n = in.read(buffer);
			if(n==-1)break;
			System.out.println("n= "+ n);
			System.out.println(Arrays.toString(buffer));
			}
		in.close();
	}

}
