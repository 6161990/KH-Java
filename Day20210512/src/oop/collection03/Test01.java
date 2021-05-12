package oop.collection03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class Test01 {
	
	public static void main(String[] args) {
		//set 이용해서 lotto 번호 뽑기
		//번호는 1~45까지 6개를 뽑아보기 
		Set<Integer> lotto = new TreeSet<>();

		Random r = new Random();
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
	
	}

}
