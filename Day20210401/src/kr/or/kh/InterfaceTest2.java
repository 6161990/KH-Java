package kr.or.kh;

abstract class Vehicle1{
	public void move() {
		System.out.println("움직인다");
	} 
}

interface Flyable{
	public abstract void fly();
	public abstract void speed(int x);
}

class Interface2Impl extends Vehicle1 implements Flyable{

	@Override
	public void fly() {
		System.out.println("I can Fly");
	}

	@Override
	public void speed(int x) {
		System.out.println(x+"km/h 의 속도로, I can Fly");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		Interface2Impl in2Impl = new Interface2Impl();
		in2Impl.fly();
		in2Impl.speed(200);

	}

}
