package kr.or.kh;

public class ForTest3 { 

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String exp="";
		
		for(int i=num; i>=1; i--) {
			sum+=i;
			exp+=(i==num)?""+i : "+"+i;
		} 
		System.out.println(exp+"="+sum);
		
	
	}
	

}
