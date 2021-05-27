package codingTest;

import java.util.HashSet;

public class q2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("오렌지");
		set.add("바나나");
		set.add("포도");
		
		
		set.remove("오렌지");
		
		System.out.println(set);
		System.out.println(set.contains("바나나"));
		System.out.println(set.contains("오렌지"));
		
	}

}
