package kr.or.kh;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//변수의 선언
		String[] kh; //타입 첫글자가 대문자면 S 초기화값은 null
		kh = new String[3];
		for(int i=0; i<kh.length; i++) {
			System.out.println(kh[0]); //null
			//System.out.println("kh문자열입력");
			//kh[i]=input.next();
		}
//		int[] arg1; //더 선호
//		int arg2[];
//		
//		arg1= new int[3]; //new는 '동적 공간'
//		arg1[0] = 10;
//		arg1[1] = 20;
//		arg1[2] = 30;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("숫자입력: ");
//			arg1[i]= input.nextInt();
//		}
//		System.out.println(arg1[0]); 
//		System.out.println(arg1[1]); 
//		System.out.println(arg1[2]);
		
		
//		System.out.println(arg1[0]); //10
//		System.out.println(arg1[1]); //20
//		System.out.println(arg1[2]); //30
//		System.out.println(arg1); //[I@531be3c5
//		System.out.println(arg1.length); //3
//		System.out.println(Arrays.toString(arg1)); //[10, 20, 30]
	}

}
