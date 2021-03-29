package kr.or.kh;

public class ConstructorTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person(30);
		Person person3 = new Person("ji");
		Person person4 = new Person("jiyoon", 27);
		
		System.out.println(person1.age+":"+person1.name+":"+person1.height+":"+person1.weight);
		System.out.println(person2.age+":"+person2.name+":"+person2.height+":"+person2.weight);
		System.out.println(person3.age+":"+person3.name+":"+person3.height+":"+person3.weight);
		System.out.println(person4.age+":"+person4.name+":"+person4.height+":"+person3.weight);

	}

}
