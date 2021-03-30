package kr.or.kh.obj9;

public class AirCon {
	String kind;

	public AirCon() {
		super();
	}

	
	public AirCon(String kind) {
		super();
		this.kind = kind;
	}

	@Override
	public String toString() {
		return super.toString() + " + AirCon [ariCon=" + kind + "]";
	}

}
