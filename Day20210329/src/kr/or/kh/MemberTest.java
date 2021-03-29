package kr.or.kh;

public class MemberTest {
	//Member에서 만들었던 생성자, 변수,메소드 자동으로 만들기 
	
	private String name;
	private int height;
	private int weight;
	private String nation;
	
	public MemberTest(String name, int height, int weight, String nation) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.nation = nation;
	}

	public MemberTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "MemberTest [name=" + name + ", height=" + height + ", weight=" + weight + ", nation=" + nation + "]";
	}



}
