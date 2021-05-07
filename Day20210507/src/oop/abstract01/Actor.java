package oop.abstract01;

public abstract class Actor {
	private String name;
	private String title;
	private String myeongDaeSa;
	
	public abstract void say();
	public abstract void tears();
	public abstract void action();
	
	public Actor() {}
	
	public Actor(String name, String title, String myeongDaeSa) {
		super();
		this.name = name;
		this.title = title;
		this.myeongDaeSa = myeongDaeSa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMyeongDaeSa() {
		return myeongDaeSa;
	}
	public void setMyeongDaeSa(String myeongDaeSa) {
		this.myeongDaeSa = myeongDaeSa;
	}
	
}
