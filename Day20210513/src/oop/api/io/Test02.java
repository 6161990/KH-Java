package oop.api.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		File file2 = new File("C:\\testF");
		
		//디렉토리는 존재하나요?
		System.out.println(file2.exists());
		
		//크기가 없거나 내장된 기본 크기를가진다.
		System.out.println(file2.length());
		
		//이게 directory 인가요?
		System.out.println(file2.isDirectory());
		
		//이게 file인가요?
		System.out.println(file2.isFile());
		
		String[] names = file2.list();
				
		for(String name : names) {
			System.out.println("name : "+name);
		}
		//파일이 이미 있으면 이어서 작성
		try {
			FileWriter fileWriter = new FileWriter("test",true);
			
			//글 적기 메소드
			fileWriter.write("오늘 저녁은 엄빠랑 화심순두부");
			
			//스트림에 보내는 메소드
			fileWriter.flush(); //한방에 올리기위해 버퍼에 갇혀있다가 flush를 호출하면 파일에 올라감
			
			//스트림닫기
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
