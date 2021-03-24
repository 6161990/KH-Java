package kr.or.kh;

public class ForTest5 {

	public static void main(String[] args) {
		for(int outer=1; outer<=3; outer++) {  //밖 반복문(x축)
			for(int inner=1; inner<=3; inner++) { //안 반복문(y축)
				System.out.println("outer="+outer+",inner="+inner);
			}
		}
	
	}
		

}
