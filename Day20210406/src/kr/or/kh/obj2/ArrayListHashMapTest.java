package kr.or.kh.obj2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapTest {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Integer>> haksaList = new ArrayList<HashMap<String, Integer>>();
		HashMap<String, Integer> haksaHash = new HashMap<String, Integer>();
		haksaHash.put("id", 2456);
		haksaList.add(haksaHash);
		System.out.println(haksaList.get(0));
	}

}
