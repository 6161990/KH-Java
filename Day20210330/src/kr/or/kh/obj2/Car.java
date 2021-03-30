package kr.or.kh.obj2;

//Has-a 관계 (소유, 포함의 관계)
public class Car {
	public Engine engine;
	public Door[] door;
	
	public Car() {
		super();
		engine = new Engine();
		door = new Door[5];
		door[0] = new Door();
		door[1] = new Door();
		door[2] = new Door();
		door[3] = new Door();
		door[4] = new Door();
		
		
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", door=" + door + "]";
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(car.engine.kind);
		System.out.println(car.door[3].window);
		
		
		System.out.println("=====");
		//엔진과 문 갯수를 바꾸고 싶을 때
		car.engine.kind="아우디엔진";
		car.door[0].window=1;
		car.door[1].window=2;
		car.door[2].window=3;
		car.door[3].window=4;
		car.door[4].window=5;
		System.out.println(car.engine.kind);
		System.out.println(car.door[0].window);
		System.out.println(car.door[1].window);
		System.out.println(car.door[2].window);
		System.out.println(car.door[3].window);
		System.out.println(car.door[4].window);
		
	}
	

}
