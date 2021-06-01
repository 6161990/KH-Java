package ch1;

public class test4 {
	public static void main(String[] args) {
		int num=11;
		for(int i=0; i<6; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=i; j<num; j++) {
				System.out.print(j);
			}
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			System.out.println();
			num--;
		}
	}
	

}
