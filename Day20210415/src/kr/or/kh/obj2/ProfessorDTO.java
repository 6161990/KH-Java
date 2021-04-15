package kr.or.kh.obj2;

import java.io.Serializable;

public class ProfessorDTO implements Serializable {

	private int no;
	public String age;
	public String name;
	public String subject;
	public ProfessorDTO() {
		super();
	}
	public ProfessorDTO(int no, String age, String name, String subject) {
		super();
		this.no = no;
		this.age = age;
		this.name = name;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject() {
		System.out.println("담당과목 : ");
    	subject = Register.input.next();
    	if(subject==null || subject=="") {
			System.out.println("에러");
		}
	}
	@Override
	public String toString() {
		return "ProfessorDTO [no=" + no + ", age=" + age + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
}
