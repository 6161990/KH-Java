package thread;

class SingleThread {
	String str;
	int time;


	SingleThread(String s, int t){
		str = s;
		time = t;
	}
	
	void start() {
		for(int i=0; i<5; i++) {
			System.out.println("No. "+i+" : "+str);
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class SingleThreadExam {

	public static void main(String[] args) {
		SingleThread a = new SingleThread("A",500);
		SingleThread b = new SingleThread("\tB",100);
		SingleThread c = new SingleThread("\t\tC",100);
		a.start();
		b.start();
		c.start();
	}

}
