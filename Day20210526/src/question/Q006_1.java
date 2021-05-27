package question;

import java.util.Scanner;

public class Q006_1 {

	public static void main(String[] args) {
		  System.out.print("숫자입력:");
	      int n = (new Scanner(System.in)).nextInt();
	      int sum = 1;
	      for(int i=1; i<=n; i++) {
	    	  sum *= i;
	      }
	      System.out.println(n+"!="+sum);
	}

}
