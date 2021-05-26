package question3;

public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;

	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	public Student(String name) {
		this(name,0,0,0);
	}
	
	public void show() {
		System.out.println("이름: "+name+" 국어: "+kor+"점, 수학:"+mat+"점, 영어:"+eng+"점");
	}
	
	
}
