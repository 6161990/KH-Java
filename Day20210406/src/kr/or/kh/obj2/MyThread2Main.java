package kr.or.kh.obj2;

//인터페이스로 구현하는 thread
//MyThread2 클래스와
public class MyThread2Main {

	public static void main(String[] args) {
		MyThread2 myThread1 = new MyThread2();
		Thread my1 = new Thread(myThread1,"myThread1");
		my1.start();
		MyThread2 myThread2 = new MyThread2();
		Thread my2 = new Thread(myThread2,"myThread2");
		my2.start();
	}

}
