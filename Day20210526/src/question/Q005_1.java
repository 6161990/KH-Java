package question;

public class Q005_1 {

	public static void main(String[] args) {
		int[] score = {45, 90, 75, 60, 80};
		int[] rank = {1, 4, 2, 3, 0};
		
		System.out.println("----출석 번호순----");
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번 : "+score[i]+" 점");
		}
		
		System.out.println("----득점순----");
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"위 "+score[rank[i]]+"점");
		}
	}

}
