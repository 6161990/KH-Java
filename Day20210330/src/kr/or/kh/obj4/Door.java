package kr.or.kh.obj4;

public class Door {
	int window;

	public Door() {
		super();
	}

	public Door(int window) {
		super();
		this.window = window;
	}

	@Override
	public String toString() {
		return super.toString() + " + Door [window=" + window + "]";
	}



}
