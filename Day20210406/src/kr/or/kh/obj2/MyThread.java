package kr.or.kh.obj2;

//상속으로 사용하는 thread
public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		System.out.println("실행프로그램");
	}
	
	/*
	 * jvm이 호출해주는 메서드
	 * @Override
	public void start() {
		run();
	}*/

	public static void main(String[] args) {
		MyThread myThread = new MyThread("첫번째 프로그램");
		myThread.start(); //start 메소드가 없는데 어디서 호출? 부모!
	}

}
