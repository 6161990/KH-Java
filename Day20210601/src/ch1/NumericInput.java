package ch1;

import java.util.Scanner;

public class NumericInput {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("가격을 입력하세요");
		int price = sin.nextInt();
		System.out.println("부가세를 입력하세요");
		double taxRate = sin.nextDouble();
		System.out.println("부가세포함"+price*(1+taxRate)+"원");
	}

}
