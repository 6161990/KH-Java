package kr.or.kh.obj2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList array1 = new ArrayList();
		array1.add('A'); //add를 할 때 공간이 생기는 것.
		array1.add(1.0);
		array1.add(4);
		array1.add(false);
		array1.add("B");
		array1.remove(2);
		// 다양한 타입들이 다 들어가있을 수 있음
		//그래서 미리 타입을 지정 제네릭타입
		ArrayList<String> array2 = new ArrayList<String>();
		
		/*for(int i=0;i<array1.size();i++) {
			char str = (char) array1.get(i);
			System.out.println(str);
		}*/
		
		
		
		
		
	}

}
