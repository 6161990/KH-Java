package ch1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam2 {
	public static void main(String[] args) {
	    Scanner sc = null;
	    FileReader fr = null;
	    try {
	      throw new FileNotFoundException();
	    } catch (FileNotFoundException e) {
	      System.out.println("파일을 찾을 수 없습니다");
	    } finally {
	      if (sc != null) {
	        sc.close();
	      }
	      try {
	        if (fr != null) {
	          fr.close();
	        }
	      } catch (IOException e) {
	        System.out.println("I/O오류가 발생했습니다");
	      }
	    }
	  }

}
