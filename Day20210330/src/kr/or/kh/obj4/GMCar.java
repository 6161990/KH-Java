package kr.or.kh.obj4;

public class GMCar extends Car {
	protected String carName;

	public GMCar() {
		super();
	}

	public GMCar(Engine engine, Door door, String carName) {
		super(engine, door);
		this.carName = carName;
	}

	@Override
	public String toString() {
		return super.toString()+ " + GMCar [carName=" + carName + "]";
	}
	
	/*public static void main(String[] args) {
		Engine engine = new Engine("대우엔진");
		Door door = new Door(5);
		GMCar gmc = new GMCar(engine, door, "스파크");
		System.out.println(gmc);
	}*/
	
	
	

}
