package kr.or.kh;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("구구단입력하세요");
		int danNumber = input.nextInt();
		if(danNumber>=2 && danNumber<=9) {
			int num=1;
			int result=0;
			while(num<=9) {
				result = danNumber * num;
				System.out.println(danNumber+"*"+num+"="+result);
				num++;
			}
		}else {
			System.out.println("단 값 오류");
		}
	}

}
