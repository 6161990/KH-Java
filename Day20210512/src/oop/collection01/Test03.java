package oop.collection01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> lottoList = new ArrayList<>();
		for(int i=1; i<=45; i++) {
			lottoList.add(i);
		}
		
		
		//비복원추출: 중복값이 나올 수 없도록 한번 추첨한 번호는 제거
		for(int i=0; i<6; i++) {
			int index = random.nextInt(lottoList.size())+0;
			int num =lottoList.get(index);
			lottoList.remove(index);
			System.out.println(num);
		}
	}

}
