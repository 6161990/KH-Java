package selftest.kh;

public class test5 {
	public static void main(String[] args) {
		
		int count=0;
		int fiveSum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%10==5 || i/10==5) { // 1의 자리수가 5인값(몫) || 10의 자리수가 5인 값 (나머지)
				System.out.println(i);
				count++;
				fiveSum+=i;
			}
			
		}
		System.out.println("5가 포함된 갯수는 "+count+" 개입니다.");
		System.out.println("총합계는"+fiveSum+" 입니다.");
	}

}
