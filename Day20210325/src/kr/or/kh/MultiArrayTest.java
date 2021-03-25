package kr.or.kh;

import java.util.Scanner;

public class MultiArrayTest {

	public static void main(String[] args) {
		//다차원배열
		int[][] khArray = new int[2][2];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<khArray.length; i++) {
			for(int j=0; j<khArray[i].length; j++) {
				System.out.println("숫자입력:");
				khArray[i][j]=input.nextInt();
			}
		}
		
		
		for(int i=0; i<khArray.length; i++) {
			for(int j=0; j<khArray[i].length; j++) {
			System.out.println(khArray[i][j]);
			}
		}
		
//		khArray[0][1]=20;
//		khArray[0][1]=20;
//		khArray[1][0]=40;
//		khArray[1][1]=40;
		System.out.println(khArray[0][0]);
		System.out.println(khArray[0][1]);
		System.out.println(khArray[1][0]);
		System.out.println(khArray[1][1]);
		
	}

}
