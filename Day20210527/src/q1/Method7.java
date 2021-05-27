package q1;

public class Method7 {
	static void power(double m, int n) {
		double a = 1.0;
		for(int i=1; i<=n; i++) {
			a *= m;
		}
		System.out.println(m+"의 "+n+"승 = "+a);
	}
	
	public static void main(String[] args) {
		power(2.0,5);
		power(3.2,5);
	}

}
