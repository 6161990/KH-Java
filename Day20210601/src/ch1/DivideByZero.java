package ch1;

public class DivideByZero {

	public static void main(String[] args) {
		int a=10, ans1=0, ans2=0;
		
		try {
			ans1 = div(a,0);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눔!");
		} finally {
			System.out.println("ans1="+ans1);
		}
		
		try {
			ans2 = div(a,1);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눔!");
		} finally {
			System.out.println("ans2="+ans2);
		}
	}
	static int div(int x, int y) throws ArithmeticException {
		return x/y;
	}

}
