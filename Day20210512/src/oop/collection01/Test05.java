package oop.collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		List<String> peopleList = new ArrayList<>();
		peopleList.add("엄태구");
		peopleList.add("전지현");
		peopleList.add("최우식");
		peopleList.add("휘인");
		peopleList.add("차정원");
		
		Collections.shuffle(peopleList);
		for(int i=0; i<2; i++) {
			System.out.println(peopleList.get(i));
		}
		//또는
		List<String> winner=peopleList.subList(0,2);
		System.out.println(winner);
		
		
		
	}	

}
