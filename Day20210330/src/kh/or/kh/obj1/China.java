package kh.or.kh.obj1;

public class China {
	protected int jazzang;
	protected int jambong;
	protected int tang;
	
	public China() {
		super();
	}
	
	
	public China(int jazzang, int jambong, int tang) {
		super();
		this.jazzang = jazzang;
		this.jambong = jambong;
		this.tang = tang;
	}


	public int getJazzang() {
		return jazzang;
	}


	public void setJazzang(int jazzang) {
		this.jazzang = jazzang;
	}


	public int getJambong() {
		return jambong;
	}


	public void setJambong(int jambong) {
		this.jambong = jambong;
	}


	public int getTang() {
		return tang;
	}


	public void setTang(int tang) {
		this.tang = tang;
	}


	@Override
	public String toString() {
		return "China [짜장면 가격 =" + jazzang + ", 짬뽕가격=" + jambong + ", 탕수육가격=" + tang + "]";
	}

	
	

}
