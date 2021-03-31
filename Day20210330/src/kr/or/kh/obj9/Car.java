package kr.or.kh.obj9;

public class Car {
	protected Engine engine; //포함관계 
	protected Radio radio;
	protected Door door;
	protected AirCon airCon;
	
	
	public Car() {
		engine = new Engine();  //동적 공간으로 만들기 
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


	@Override  //Object에서 상속한 함수를 Car 클래스에서 재정의한 것. 
	public String toString() { 
		return "Car [engine=" + engine.kind + ", radio=" + radio.kind + ", door=" + door.window + ", airCon=" + airCon.kind + "]";
	
	  //Car car = new Car();
	  // car.engine.kind ="현대엔진"; 
		// 포함관계. 상속에서는 이렇게 하지 않는다. 
	}
	
	
	

}
