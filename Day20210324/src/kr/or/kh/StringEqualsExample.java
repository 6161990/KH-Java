package kr.or.kh;

public class StringEqualsExample {
 
	public static void main(String[] args) {
		//문자열 타입의 비교
		//자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록되어있다. 변수 strVar1,2 가 동일한 String 객체의 번지값을 가지고 있는 이유.
		String strVar1= "제니";
		String strVar2= "제니";
		String strVar3= new String("제니");	//그러나 객체 생성 연산자인 new 로 생성한 인스턴스는 새로운 String 객체의 번지값을 가지고 있다.
	
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);
		System.out.println();
		
		//동일한 스트링 객체이건 다른 스트링 객체이건 상관없이 스트링 객체의 문자열만을 비교하고 싶다면 
		//==대신에 equals()메소드를 사용해야한다.
		//equals 메소드는 원본 문자열과 매개값으로 주어진 비교 문자열이 동일한지 비교해 t/f리턴한다.
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}
 