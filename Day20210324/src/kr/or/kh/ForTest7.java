package kr.or.kh;

public class ForTest7 {

	public static void main(String[] args) {
		aaa:for(char c='A'; c<='C'; c++) {
			for(int x=1; x<=3; x++) {
				if(x==2) continue; //가장 가까운 반복문으로 되돌아감 
				if(c=='B') continue aaa;
				System.out.println("c="+c+",x="+x);
			}
		}
		System.out.println("================");
		
//		bbb:for(char a='A'; a<='C'; a++) {
//			for(int z=1; z<=3; z++) {
//				if(z==2) continue bbb; //ABC 각 1만 출력
		      //if(a == 'B');  //얘가 있으나 없으나 결과 똑같음
//				System.out.println("a="+a+", z="+z);
//			}
//		}
		
		//다 끝내는 continue를 내부 for 마지막에 넣으면 어차피 빠져나올타이밍이라 영향이 없다. 
		bbb:for(char a='A'; a<='C'; a++) {
			for(int z=1; z<=3; z++) {
				if(z == 2) continue ; //ABC 각 1만 출력
				if(a=='B') continue ;
				System.out.println("a="+a+", z="+z);
			}
		}
		
	}

}
