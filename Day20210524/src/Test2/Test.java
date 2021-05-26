package Test2;

public class Test {
	private String name;
	private int age;
	
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "내 이름은 " + name + "입니다. \n내 나이는 "+ age + "입니다.";
	}
	
	

}
