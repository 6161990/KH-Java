package kr.or.kh.obj2;

import java.io.Serializable;

public class ProfessorDTO implements Serializable {
	private String age;
	private String name;
	private String subject;
	private String object;
	
	
	public ProfessorDTO() {
		super();
	}
	
	public ProfessorDTO(String age, String name, String subject, String object) {
		super();
		this.age = age;
		this.name = name;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "ProfessorDTO [age=" + age + ", name=" + name + ", subject=" + subject + ", object=" + object + "]";
	}
	
	

}
