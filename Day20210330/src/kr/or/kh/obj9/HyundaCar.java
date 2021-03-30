package kr.or.kh.obj9;

public class HyundaCar extends Car{
	protected String carName;

	
	public HyundaCar() {
		super();
	}

	public HyundaCar(Engine engine, Radio radio, Door door, AirCon airCon, String CarName) {
		super(engine, radio, door, airCon);
		this.carName= carName;
	}



	@Override
	public String toString() {
		return super.toString()+ " + HyundaCar [carName=" + carName + "]";
	}
	
	
	

}
