package selftest.kh;

public class test6 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
		
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int a=0; a<i; a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		
		
	}

}
