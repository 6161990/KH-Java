package kr.or.kh.obj2;


//인터페이스로 구현하는 thread
//MyThread2Main와 
public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.print(Thread.currentThread().getName()); 
			//인터페이스로 구현시 Thread 클래스 안의 currentThread 가져와야 한다. 
			try {
				Thread.sleep(10);
				for(int j=1; j<=i; j++) {
					System.out.print("$");
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
