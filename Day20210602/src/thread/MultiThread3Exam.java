package thread;

class MultiThread3 implements Runnable{
	int time;
	
	MultiThread3(int t){
		time = t;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("No. "+i+" : "+ Thread.currentThread().getName());
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread3Exam {

	public static void main(String[] args) {
		MultiThread3 a = new MultiThread3(500);
		MultiThread3 b = new MultiThread3(700);
		MultiThread3 c = new MultiThread3(1100);
		
		Thread ta = new Thread(a);
		Thread tb = new Thread(b);
		Thread tc = new Thread(c);
		
		ta.setName("A");
		tb.setName("\t  B");
		tc.setName("\t\tC");
		ta.start();
		tb.start();
		tc.start();
	}

}
