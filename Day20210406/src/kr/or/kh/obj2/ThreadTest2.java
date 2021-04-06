package kr.or.kh.obj2;

//상속으로 사용하는 thread
//MyThread1와 
public class ThreadTest2 {
	
	//멀티 쓰레드 

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1("쓰레드 1이다.");
		myThread1.start();
		MyThread1 myThread2 = new MyThread1("쓰레드 2이다.");
		myThread2.start();
	}

}
