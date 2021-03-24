package kr.or.kh;

public class WhileTest1 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<5) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 5까지의 합은 "+sum+"입니다.");
	}

}
