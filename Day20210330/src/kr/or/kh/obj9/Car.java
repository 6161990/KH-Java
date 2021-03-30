package kr.or.kh.obj9;

public class Car {
	protected Engine engine;
	protected Radio radio;
	protected Door door;
	protected AirCon airCon;
	
	
	public Car() {
		engine = new Engine();
		radio = new Radio();
		door = new Door();
		airCon = new AirCon();
	}


	public Car(Engine engine, Radio radio, Door door, AirCon airCon) {
		super();
		this.engine = engine;
		this.radio = radio;
		this.door = door;
		this.airCon = airCon;
	}


	@Override
	public String toString() {
		return "Car [engine=" + engine.kind + ", radio=" + radio.kind + ", door=" + door.window + ", airCon=" + airCon.kind + "]";
	}
	
	
	

}
