package question;

public class Q005 {
	
	public static void main(String[] args) {
		int[] score = {45, 90, 75, 60, 80};
		int[] rank = {1, 4, 2, 3, 0};
		
		System.out.println("----출석 번호순----");
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번 : "+score[i]+" 점");
		}
		
		System.out.println("----득점순----");
		
		int test;
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[j]>score[i]) {
					rank[i]=score[j];
					score[j]=score[i];
					score[i] = rank[i];
				}
			}
			
		}
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"위 : "+score[i]+" 점");
		}
		
		
	}
}
