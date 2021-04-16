package kr.or.kh.instance;

import java.io.Serializable;

public class ManageDTO implements Serializable{
	
	private int no;
	public String age;
	public String name;
	public String part;
	public ManageDTO() {
		super();
	}
	public ManageDTO(int no, String age, String name, String part) {
		super();
		this.no = no;
		this.age = age;
		this.name = name;
		this.part = part;
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
	public String getPart() {
		return part;
	}
	public void setPart() {
		System.out.println("담당부서 : ");
    	part = Register.input.next();
    	if(part==null || part=="") {
			System.out.println("에러");
		}
	}
	@Override
	public String toString() {
		return "ManageDTO [no=" + no + ", age=" + age + ", name=" + name + ", part=" + part + "]";
	}

}
