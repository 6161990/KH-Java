package thread;

class MultiThread extends Thread{
	String str;
	int time;
	
	MultiThread(String s, int t){
		str = s;
		time = t;
	}
	
	@Override //Thread클래스 run()메소드 오버라이드
	public void run() {
		for(int i=0; i<5; i++) {//멀티스레드 처리
			System.out.println("No. "+i+" : "+str);
			try { //인수로 전달된 시간장치
				Thread.sleep(time);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadExam {

	public static void main(String[] args) {
		MultiThread a = new MultiThread("A",500);
		MultiThread b = new MultiThread("\tB",700);
		MultiThread c = new MultiThread("\t\tC",1100);
		
		a.start();
		b.start();
		c.start();
	
	}

}
