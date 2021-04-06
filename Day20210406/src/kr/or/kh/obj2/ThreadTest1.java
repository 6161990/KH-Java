package kr.or.kh.obj2;

//상속으로 사용하는 thread
//MyThread1와
public class ThreadTest1 {

	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1("yoonThread");
		myThread.start();
	}

}
