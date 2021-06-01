package ch1;

public class test33 {

	public static void main(String[] args) {
		
		int[] array = new int[11];
		
		for(int i=0; i<array.length; i++) {
			array[i]=i;
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<array.length; j++) {
				if( j < i || j > ( array.length-i-1) ) {
					System.out.print(' ');
				}else {
					System.out.print(array[j]);
				}
			}
			System.out.println();
		}
	}

}
