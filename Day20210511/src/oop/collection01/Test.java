package oop.collection01;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//저장소마다 저장형태가 다르다!
		//TreeSet: 오름차순 저장(ex. 출석부, 전화번호부)
		//ArrayList: 추가한 순서 그대로 저장(ex:코로나명부, 댓글)
		TreeSet ts = new TreeSet();
		ts.add("전지현");
		ts.add("차정원");
		ts.add("엄태구");
		ts.add("휘인");
		ts.add("김민우");
		ts.add("이상이");
		ts.add("최우식");

		ArrayList al = new ArrayList();
		al.add("최우식");
		al.add("휘인");
		al.add("전지현");
		al.add("차정원");
		al.add("엄태구");
		System.out.println(ts);
		System.out.println(al);
	}

}
