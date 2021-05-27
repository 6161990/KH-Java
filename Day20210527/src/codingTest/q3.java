package codingTest;

import java.util.HashMap;


public class q3 {

	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("국어", 90); 
		score.put("수학", 80); 
		score.put("영어", 70); 
		
		for(String sPrint : score.keySet()) {
			System.out.println(sPrint +": "+score.get(sPrint)+" 점");
		}
		
		
	}

}
