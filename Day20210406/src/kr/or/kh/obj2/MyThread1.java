package kr.or.kh.obj2;

//상속으로 사용하는 thread
//ThreadTest1, ThreadTest2와 
public class MyThread1 extends Thread {

	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.print(currentThread().getName());
			try {
				sleep(10);
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


