package oop.basic01;

public class People {
	
	private String name;
	private String phone;
	private String job;
	private double height;
	private char gender;
	
	public People() {
		super();
	}
	
	public People(String name, String phone, String job, double height, char gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.job = job;
		this.height = height;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<0) {return;}
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		switch(gender) {
		case '남' :
			this.gender = gender;
			break;
		case '여' :
			this.gender = gender;
			break;
		case 'N' :
			this.gender = gender;
			break;
		default :
			System.out.println("성별을 입력하세요");
		}

	}
	
	public void print() {
		System.out.println(name+ "님의 개인 정보 : " + phone + ", " + job + ", " + height + ", " +gender);
	}
	
	public void print(double plusH) {
		System.out.println(name+ "님의 개인 정보 : " + phone + ", " + job + ", " + (height+plusH) + ", " +gender);
	}

}
