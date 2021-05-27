package codingTest;

import java.util.ArrayList;

public class q1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("사과");
		array.add("오렌지");
		array.add("바나나");
		array.add("포도");
		
		array.remove(0);
		array.remove("포도");
		
		for(String fruit: array) {
			System.out.println(fruit);
		}
	}

}
