package kr.or.kh.obj9;

public class Radio {
	String kind;

	
	public Radio() {
		super();
	}
	
	public Radio(String kind) {
		super();
		this.kind = kind;
	}


	@Override
	public String toString() {
		return super.toString() + " + Radio [radio=" + kind + "]";
	}

	
}
