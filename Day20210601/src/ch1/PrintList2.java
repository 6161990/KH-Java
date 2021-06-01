package ch1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintList2 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader(args[0]);
				Scanner sin = new Scanner(fr);){
		   while (sin.hasNext()) {
			   String s = sin.nextLine();
			   System.out.println(s);
		   }
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		} catch(IOException e) {
			System.out.println("IO 오류가 발생했습니다");
		}
				
	}

}
