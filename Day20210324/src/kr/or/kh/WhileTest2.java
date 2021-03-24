package kr.or.kh;

public class WhileTest2 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(true) {
			sum+=i; //sum=sum+i
			i++;
			if(i==5) break;
		}
		System.out.println("1부터 5까지의 합="+sum);
	}

}
