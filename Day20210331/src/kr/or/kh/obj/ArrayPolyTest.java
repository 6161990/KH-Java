package kr.or.kh.obj;

public class ArrayPolyTest {
//배열의 다형성 
	public static void main(String[] args) {
		Person[] pArray = new Person[3];
		
		pArray[0] = new Employee();
		pArray[1] = new Student();
		pArray[2] = new President();
		for(int i =0; i<pArray.length;i++) {
			pArray[i].showSleepStyle();
		}
		
		
	}

}
