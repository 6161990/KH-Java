package q1;

public class Method4 {
	static void square(int n) {
		System.out.println("결과:"+ n*n);
	}

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			square(i);
		}
	}

}
