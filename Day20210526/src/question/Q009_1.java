package question;

import java.util.Scanner;

public class Q009_1 {

	public static void main(String[] args) {
		   System.out.print("숫자입력:");
	       int n = (new Scanner(System.in)).nextInt();
	       for(int i=0; i<8; i++) {
	    	   for(int j=0; j<n; j++) {
	    		   int wk = i % 2;
	    		   if((j+wk) %2 ==0) {
	    			   System.out.print("□ ");
	                } else {
	                   System.out.print("■ ");
	                }
	    	   }
	    	   System.out.println();
	       }
	}

}
