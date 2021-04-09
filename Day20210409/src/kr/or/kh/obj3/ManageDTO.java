package kr.or.kh.obj3;

import java.io.Serializable;

public class ManageDTO implements Serializable  {
	private String age;
	private String name;
	private String part;
	private String object;
	
	
	public ManageDTO() {
		super();
	}
	
	
	public ManageDTO(String age, String name, String part, String object) {
		super();
		this.age = age;
		this.name = name;
		this.part = part;
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
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "ManageDTO [age=" + age + ", name=" + name + ", part=" + part + ", object=" + object + "]";
	}
	
	
	
}
