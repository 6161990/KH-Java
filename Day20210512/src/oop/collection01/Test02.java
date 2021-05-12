package oop.collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> lottoList = new ArrayList<>();
	
		//for문으로
		for(int i=0; i<6; i++) {
			int num = random.nextInt(45/*개수*/)+1 /*부터*/;
			if(!(lottoList.contains(num))) {
				lottoList.add(num);
			}else {
				i--;
			}
		}
		
		//while문으로 //비복원추출: 중복값이 나올 수 없도록 한번 추첨한 번호는 제거
		while(lottoList.size()<6) {
			int num = random.nextInt(45/*개수*/)+1 /*부터*/;
			if(!(lottoList.contains(num))) {
				lottoList.add(num);
			}else {
				
			}
		}
		
		//오름차순
		Collections.sort(lottoList);
		System.out.println(lottoList);
	


						
		
		
		
	}

}
