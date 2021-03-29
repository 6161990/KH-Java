package kr.or.kh;

public class Overloding {
	//같은 클래스에서 다양하게 구현하는 것은 overloading
	//다른 클래스에서 상속으로 다양하게 구현하는 것은 overriding
	
	//오버로딩 : 모델이 같은 메소드, 다른 리액션
	//기준
	long add(int a, long b) {
		return a+b;
	}
	
	//오버로딩1 성립. 파라미터 타입이 다르다. 
	long add(long a, int b) {
		return a+b;
	}
	
	//오버로딩 2 성립. 파라미터가 다르다.
	int add(int[] a) {  //int [] a = {10, 20, 30} 를 컴파일러가 생성
		int result =0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	
	
	
	//오버로딩 아니다. 파라미터의 갯수 or 타입이 달라야 성립. 리턴 타입은 관련없다. 
//	long add(int a, int b) {
//		return (long)(a+b);
//	}
//	
	
	//오버로딩이 아니다. 파라미터의 갯수, 타입이 달라야 성립. 매개변수 이름 바뀐다고 오버로딩 아님.
//	int add(int x, int b) {
//		return x+y;
//	}
//	
	public static void main(String[] args) {
		Overloding test = new Overloding();
		long result1 = test.add(10,20L);
		System.out.println(result1);
		long result2 = test.add(10L,10);
		System.out.println(result2);
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		int result3 = test.add(arr);
		System.out.println(result3);
		
		
		/*Overloding test = new Overloding();
		long result1= test.add(10,20L);
		System.out.println(result1);
		long result2= test.add(5L,6);
		System.out.println(result2);*/
		
	

	}

}
