package question;

public class Q004 {
	
	public static void main(String[] args) {
		int[][] array = {
				{1,8,12,17,20},
				{2,5,11,13,18},
				{4,6,9,19,21}
		};
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
