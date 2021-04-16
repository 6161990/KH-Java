package kr.or.kh.instance;

import java.io.Serializable;

public class StudentDTO implements Serializable { //Data Transfer Object
	
	private int no;
	public String age;
	public String name;
	public String studentNum;

	public StudentDTO() {
		super();
	}
	public StudentDTO(int no, String age, String name, String studentNum) {
		super();
		this.no = no;
		this.age = age;
		this.name = name;
		this.studentNum = studentNum;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAge() {
		return age;
	}
	public void setAge() {
		System.out.println("나이 : ");
    	age = Register.input.next();
    	if(age==null || age=="") {
			System.out.println("에러");
		}
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("이름 : ");
    	name = Register.input.next();
    	if(name==null || name=="") {
			System.out.println("에러");
		}
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum() {
		System.out.println("학번 : ");
    	studentNum = Register.input.next();
    	if(studentNum==null || studentNum=="") {
			System.out.println("에러");
		}
	}
	@Override
	public String toString() {
		return "StudentDTO [no=" + no + ", age=" + age + ", name=" + name + ", studentNum=" + studentNum + "]";
	}
	
	
}
