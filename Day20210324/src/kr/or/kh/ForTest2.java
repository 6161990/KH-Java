package kr.or.kh;

public class ForTest2 {

	public static void main(String[] args) {
		int sum=0;
		String exp=""; 
		
		for(int i=0; i<=5; i++) {
			sum+=i;
			exp+=(i==0)?""+i:"+"+i; //exp에 복합대입연산자 +=를 이용해 0~5까지 true를 계속 누적시킨다.
			
		}
		System.out.println(exp+"="+sum);
	}

}
 