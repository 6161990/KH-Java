package kr.or.kh;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
//		for(int m=2; m<=9; m++) { //밖 : x축
//			System.out.println("***"+m+"단***");
//			for(int n=1; n<=9; n++) { //안 : y축
//				System.out.println(m+"x"+n+"="+(m*n));
//			}
//			
//		}
	
		for(int dan=2; dan<=9; dan++) {		
			for(int count=1; count<=9; count++) {
				if((dan==count)) {
					System.out.println(dan+"x"+count+"="+(dan*count));
				}
				
			}
			
		}
	
	}
}
