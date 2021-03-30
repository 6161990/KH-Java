package kr.or.kh.obj9;

public class GMCar extends Car{
	
	protected String carName;

	
	public GMCar() {
		super();
	}


	public GMCar(Engine engine, Radio radio, Door door, AirCon airCon, String carName) {
		super(engine, radio, door, airCon);
		this.carName=carName;
	}


	@Override
	public String toString() {
		return super.toString()+ " + GMCar [carName=" + carName + "]";
	}
	
	

	
}
