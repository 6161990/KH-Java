package kr.or.kh.obj;

//배열의 다형성

public class ArrayPolyTest {
 
	public static void main(String[] args) {
		//부모 Person, 자식 Employee,Student,President
		
		Person[] pArray = new Person[3];
		
		pArray[0] = new Employee(); //Employee가 재정의한 메소드가 출력
		pArray[1] = new Student();  //Employee가 재정의한 메소드가 출력
		pArray[2] = new President(); //Employee가 재정의한 메소드가 출력
		for(int i =0; i<pArray.length;i++) {
			pArray[i].showSleepStyle();
		}
		
		
	}

}
