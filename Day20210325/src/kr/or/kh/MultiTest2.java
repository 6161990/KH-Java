package kr.or.kh;

public class MultiTest2 {

	public static void main(String[] args) {
		//다차원가능성이있따? 우선 선언해놓고 나중에 작업하면서 다차원 할 수 있음
		//행은 미리 정해놓고 열은 추후 조정가능, 자바에만 있는 독특한 문법.
		int[][] khArray = new int[2][]; //열은 나중에 작업하면서 추가할 수 있다.
	
		khArray[0]=new int[2]; //1행에는 2칸 = 행과열 하나씩
		khArray[1]=new int[1]; //2행에는 1칸 = 행만 하나 
		
		System.out.println("숫자 입력: ");
		khArray[0][0]=10;
		khArray[0][1]=20;
		khArray[1][0]=30;  //세개 끝.
		
		System.out.println(khArray[0][0]);
		System.out.println(khArray[0][1]);
		System.out.println(khArray[1][0]);
	}

}
