package oop.collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		//collections 의 shuffle 기능을 이용해서 섞어보자
		List<Integer> lotto = new ArrayList<>();
		
		for(int i=1; i<=45; i++) {
			lotto.add(i);
		}
		System.out.println(lotto);
		
		Collections.shuffle(lotto);
		System.out.println(lotto);
		
		//0번 위치부터 6개를 분할하여 List로 만들어주자
		List<Integer> cut = lotto.subList(0,6);
		System.out.println(cut);
		//정렬
		Collections.sort(cut);
		System.out.println(cut);
		
		//0번 위치부터 7개 뽑아온다
		for(int i=0; i<6; i++) {
			System.out.print(lotto.get(i)+" ");
		}
	}

}
