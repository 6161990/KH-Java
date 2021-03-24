package kr.or.kh;

public class CompareOperatorExample2 {
 
	public static void main(String[] args) {
		int v2 =1; 
		double v3 = 1.0;
		System.out.println(v2==v3);
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); //에러 부동소수점 오류
		System.out.println((float)v4==v5); //해결 1
		System.out.println((int)(v4*10)==(int)(v5*10)); //해결방법 2
	
	
	}

}
