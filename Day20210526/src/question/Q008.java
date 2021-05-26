package question;

import java.util.Scanner;

public class Q008 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하십시오:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<n; j++) {
				if(i%2==0) {
					if(!(j%2==0)) {
						System.out.print("■ ");
					}else {
						System.out.print("□ ");
					}
				}else {
					if(j%2==0) {
						System.out.print("■ ");
					}else {
						System.out.print("□ ");
					}
				}
				
			}
			System.out.println();
			
		}
		
	}


}
