package kr.or.kh.obj2;

//Has-a 관계 (소유, 포함의 관계)
public class Door {
	
	public int window;

	public Door() {
		super();
		window=4;
	}

	@Override
	public String toString() {
		return "Door [window=" + window + "]";
	}
	
	

}
