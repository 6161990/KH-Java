package kr.or.kh.obj2;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("중국");
		array.add("한국");
		array.add("미국");
		array.add("북한");
		System.out.println("ArrayList에 요소 추가하고 출력");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println();
		System.out.println();
		array.remove(0);
		array.remove("미국");
		System.out.println("ArrayList에서 요소제거 후 클릭");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}
