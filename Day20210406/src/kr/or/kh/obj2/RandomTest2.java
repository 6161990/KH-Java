package kr.or.kh.obj2;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		Random random1 = new Random(5);
		Random random2 = new Random(5);
		
		for(int i=0; i<3; i++) {
			System.out.println("random1의 난수 값:"+random1.nextInt());
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.println("random2의 난수값:"+ random2.nextInt());
		}
	}
	
		
	 	/* 
	 	random1의 난수 값:-1157408321
		random1의 난수 값:758500184
		random1의 난수 값:379066948
		
		
		random2의 난수값:-1157408321
		random2의 난수값:758500184
		random2의 난수값:379066948*/

}
