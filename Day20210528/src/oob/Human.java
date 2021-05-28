package oob;

public class Human {
	String name;
	int age;
	int weight;
	int height;
	
	public Human(String name, int age, int weight, int height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	void talk() {
		System.out.println("제 이름은 " + this.name + "입니다.");
		System.out.println("나이는 " + this.age + "입니다.");
		System.out.println("무게는 "+this.weight+"kg입니다");
		System.out.println("키는 "+this.height+"cm 입니다.");
	}
	
	void eat() {
		System.out.println("오늘 아침은 맥모닝을 먹었습니다.");
		this.weight++;
		System.out.println("무게가 "+this.weight+"kg로 증가하였습니다.");
	}
	
	
}
