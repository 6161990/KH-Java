package selftest.kh;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		
		if(input >= 90) {
			if(input >=95) {
				System.out.println("A+학점입니다.");
			}else {
				System.out.println("A학점입니다.");
			}
		} else if(input >= 80){
			if(input >=85) {
				System.out.println("B+학점입니다.");
			}else {
				System.out.println("B학점입니다.");
			}
		} else if(input >= 70) {
			if(input >=75) {
				System.out.println("C+학점입니다.");
			}else {
				System.out.println("C학점입니다.");
			}
		}else {
			System.out.println("F학점입니다.");
		}
		
	}

}
