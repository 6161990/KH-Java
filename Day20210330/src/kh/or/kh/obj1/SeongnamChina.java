package kh.or.kh.obj1;

public class SeongnamChina extends China {
	
	protected int samseonJambong;
	

	public SeongnamChina() {
		super();
	}


	public SeongnamChina(int jazzang, int jambong, int tang, int samseonJambong ) {
		super(jazzang, jambong, tang);
		this.samseonJambong = samseonJambong;
	}


	public int getSamseonJambong() {
		return samseonJambong;
	}


	public void setSamseonJambong(int samseonJambong) {
		this.samseonJambong = samseonJambong;
	}


	@Override
	public String toString() {
		return super.toString()+ " SeongnamChina plus [삼선짬뽕가격=" + samseonJambong + "]";
	}
	
	

}
