package ch1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 숫자를 입력하세요");
		int repeatNum = sc.nextInt();
		for(int i=0; i<repeatNum; i++) {
			System.out.println((i+1)+"> Hello World!");
		}
	}

}
