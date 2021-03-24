package kr.or.kh;

public class ForTest6 {

	public static void main(String[] args) {
//		int num=0;
//		
//		for(int x=1; x<=5; x++) {
//			for (int y=1; y<=x; y++) {
//				System.out.print(++num + "\t");
//			}
//			System.out.println();
//		}
//		num=0;
//		for(int x=1; x<=5; x++) {
//			for(int y=1; y<=(6-x); y++) {  //x가 커질수록 y가 작아짐
//			   System.out.print(++num +"\t");
//			}
//			System.out.println();
//		}
		
		
		int num = 0;
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(++num + "\t");
			}
			System.out.println();
		}
		num = 0;
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=(6-i); j++) {
				System.out.print(++num + "\t");
			}
			System.out.println();
		}
	}

}
