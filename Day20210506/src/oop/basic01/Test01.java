package oop.basic01;

public class Test01 {
	
	//학생의 정보를 담아보자
	public static void main(String[] args) {
		String name="아이유";
		int age =29;
		char gender='여';
		
		String name1="서강준";
		int age1 =34;
		char gender1='남';
		
		String name2="박서준";
		int age2 =35;
		char gender2='남';
		
		String name3="김세정";
		int age3 =25;
		char gender3='여';
		
		System.out.println("아이유의 정보");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println("=======");
		
		System.out.println("서강준의 정보");
		System.out.println(name1);
		System.out.println(age1);
		System.out.println(gender1);
		
		System.out.println("=======");
		
		Student iu = new Student();
		iu.name="아이유";
		iu.age=29;
		iu.gender='여';
		System.out.println(iu.name+"님의 정보");
		System.out.println(iu.age +","+ iu.gender);
		
		Student seokangjun = new Student();
		seokangjun.name="서강준";
		seokangjun.age=34;
		seokangjun.gender='남';
		System.out.println(seokangjun.name+"님의 정보");
		System.out.println(seokangjun.age+","+seokangjun.gender);
	
	}
	
}
