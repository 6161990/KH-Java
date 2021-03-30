package kr.or.kh.obj4;

public class Car {
	//포함관계
	protected Engine engine;
	protected Door door;
	
	public Car() {
		super();
		this.engine = new Engine();
		this.door = new Door();
	}
	
	public Car(Engine engine, Door door) {
		super();
		this.engine = engine;
		this.door = door;
	}
	
	@Override
	public String toString() {
		return "Car [engine=" + engine.kind + ", door=" + door.window + "]";
	}
	
	/*public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.toString());
		
		
		Engine engine = new Engine("삼성엔진");
		Door door = new Door(4);
		Car car2 = new Car(engine, door);
		
		
		// 다음은 위 세 줄과 같다. 
		//Car car2 = new Car(new Engine("삼성엔진"), new Door(4));  
		
		System.out.println(car2.toString());
	}*/
	

}
