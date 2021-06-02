package thread;

class Multiplication{
	int dn;
	int time;
	
	Multiplication(int d, int t){
		dn=d;
		time=t;
	}
	void start() {
		for(int i=1; i<=9; i++) {
			System.out.print(dn*i);
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				System.out.println("오류");
			}
			System.out.println();
		}
	}
}

public class MultiplicationExam {

	public static void main(String[] args) {
		Multiplication a = new Multiplication(5,500);
		Multiplication b = new Multiplication(6,700);
		Multiplication c = new Multiplication(7,1100);
		
		a.start();
		b.start();
		c.start();
	}

}
