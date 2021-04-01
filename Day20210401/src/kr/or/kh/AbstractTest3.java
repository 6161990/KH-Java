package kr.or.kh;

abstract class Vehicle {
	abstract void move();
}

class Car extends Vehicle{

	@Override
	void move() {
		System.out.println("도로를 누빈다.");
	}
	
}

class Plane extends Vehicle{

	@Override
	void move() {
		System.out.println("하늘을 누빈다");
	}
	
}

class Ship extends Vehicle{

	@Override
	void move() {
		System.out.println("강을 거닐지요");
	}
	
	
}


public class AbstractTest3 {
	
	public static void main(String[] args) {
		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		
		VehicleUse vUse = new VehicleUse();
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(ship);
		vUse.getMoveStyle(plane);
		
	}
	

}
