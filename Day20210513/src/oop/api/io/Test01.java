package oop.api.io;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		//파일을 제어할 수 있는 객체 생성
		File a = new File("kh/hello.txt");
		File b = new File("kh","hello2.txt");
		File c = new File("yoonjizzang");
		//File r = new File("C:\\test01\\test.txt");
		File f = new File("C:\\testF");
		
		f.mkdir(); //폴더 생성 메소드 make directory
		
		File e1 = new File("C:\\testF\\createNew.txt");
		try {
			e1.createNewFile();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		//각종 명령을 이용해서 파일의 정보를 분석
		System.out.println(a.exists()); //해당 파일이 존재하는가
		System.out.println(b.exists());
		
		System.out.println(a.length());//파일의 크기 = 1byte
		System.out.println(a.getName()); //파일의 이름
		System.out.println(a.getPath()); //파일의 경로
		System.out.println(a.getAbsolutePath()); //파일의 경로(절대경로)
		System.out.println(a.lastModified()); //최종수정시각
		
		//시간 형식 적용
		Date d = new Date(a.lastModified());
		Format k = new SimpleDateFormat("y년 M월 d일 E요일,a H:mm:ss");
		System.out.println(k.format(d));
		
		//파일을 생성해보자 
		try {
			c.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			r.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

}
