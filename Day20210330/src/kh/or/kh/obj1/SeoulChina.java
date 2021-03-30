package kh.or.kh.obj1;

public class SeoulChina extends China {
	
	protected int jangban;

	
	public SeoulChina() {
		super();
	}


	public SeoulChina(int jazzang, int jambong, int tang, int jangban) {
		super(jazzang, jambong, tang);
		this.jangban = jangban;
	}




	public int getJangban() {
		return jangban;
	}


	public void setJangban(int jangban) {
		this.jangban = jangban;
	}


	@Override
	public String toString() {
		return super.toString()+ " SeoulChina plus [쟁반짜장가격=" + jangban + "]";
	}
	
	

}
