package kr.or.kh;

public class ArrayTest9 {

	public static void main(String[] args) {
		int[][] recArray =new int[5][5]; //현재 모든 방(25)은 0으로 채워져있다.
		
		//1 찍는 반복문
		for(int i=0; i<recArray.length; i++) {
			for(int j=0; j<recArray[i].length; j++ ) {
					//앞 가로 1다섯개 //가로 마지막 줄 //앞 세로 1다섯개 //세로 마지막 줄
				if( i==0 ||  i==recArray.length-1 || j==0 || j==recArray[i].length-1) { 
					recArray[i][j]=1;
				}
			}
		}
		
		//모양 내는 반복문
		for(int i=0; i<recArray.length; i++) {
			for(int j=0; j<recArray[i].length; j++) {
				System.out.print(recArray[i][j]+"");
			}
			System.out.println();
		}
	}

}
//11111   : if( i==0 ) 0행일 떄 , recArray[i][j]=1;
//10001
//10001
//10001
//11111
