package kr.or.kh.obj3;

import java.io.Serializable;

//외부에있는 서버 컴퓨터에 내보낼때 객체를 담아서 파일에 담는다= 직렬화 Serializable
public class StudentDTO implements Serializable {

	private String age;
	private String name;
	private String studentNum;
	private String object;
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(String age, String name, String studentNum, String object) {
		super();
		this.age = age;
		this.name = name;
		this.studentNum = studentNum;
		this.object = object;
	}
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "StudentDTO [age=" + age + ", name=" + name + ", studentNum=" + studentNum + ", object=" + object + "]";
	}
	
	
	
	
	
}
