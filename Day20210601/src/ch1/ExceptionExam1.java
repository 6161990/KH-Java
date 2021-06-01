package ch1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam1 {
	public static void main(String[] args) {
		Scanner sc = null;
		FileReader fr = null;
		try {
			fr = new FileReader("ExceptionExam1.java");
			sc = new Scanner(fr);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}finally {
			sc.close();
			try {
				fr.close();
			}catch (IOException e) {
				System.out.println("I/O 오류가 발생했습니다.");
			}
		}
	}

}
