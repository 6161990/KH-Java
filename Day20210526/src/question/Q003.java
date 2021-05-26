package question;

public class Q003 {
	
	public static void main(String[] args) {
		int [] a = { 1, 2, 3, 4, 5 };
		int [] b = { 6, 7, 8, 9, 10 };
		int [] c = new int[5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				c[i]=a[i]+b[i];
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
