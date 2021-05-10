package oop.api;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("끝말잇기를 해보세요.");
		String first = scan.next();
		String second;
		
		while(true) {
		if(first.length()==3) {
            System.out.println(first+" 꿍꿍따 ");
            second=scan.next();
            if(first.charAt(2)==second.charAt(0)) {
               first=second;
            }else {
               break;
            }
		}
	}
	}
}
