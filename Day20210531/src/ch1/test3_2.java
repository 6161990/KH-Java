package ch1;

public class test3_2 {
	
	 public static void main(String[] args) {
		 for(int i=5; i>=0; i--) {
				for(int j=0; j<6-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<=i*2; k++) {
					System.out.print(k);
				}
				
				System.out.println();
			}
	 }
}
