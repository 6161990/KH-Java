package kr.or.kh;

public class Person {
	public int age;
	public String name;
	public int height;
	public int weight;

	public Person()	{
		//초기화의 역할로 사용
		// 컴파일러가 알아서 초기화한다 String 은 null값으로 int 는 0
	}
	
	public Person(int age) {
		this.age = age;
		//매개변수로 넘어오지 않은 값은 컴파일러가 초기화 
//		name = null; 
//		height = 0;
//		weight = 0;
	}
	public Person (String name) {
		this.name = name;
		age = 0;
		height = 0;
		weight = 0;
	}
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
}
