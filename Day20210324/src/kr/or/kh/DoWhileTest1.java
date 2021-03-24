package kr.or.kh;

public class DoWhileTest1 {

	public static void main(String[] args) {
		int i=0;
		
		while(i>=1) {
			System.out.println("반복문영역");
		}
		do {
			System.out.println("Dowhile");
		}while(i>=1); //조건이 true이건 false이건 상관없이 
	}

}
