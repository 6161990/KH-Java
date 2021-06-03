package selftest.kh;

public class Quetions1 {

	public static void main(String[] args) {
		// [문제 1] 
		int eleven = 11;
		System.out.println(eleven);
		
		// [문제 2] 
		double three = 3;
		System.out.println(three);
		float fThree = (float) three;
		System.out.println(fThree);
		
		// [문제 3] 
		System.out.println(123+456+789);
		System.out.println();
		
		// [문제 4]
		for(int i=1; i<11; i++) {
			if(i==3) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		// [문제 5]
		int[] arr = {1,2,3,4,5};
		
		  for(int i=0; i< arr.length; i++) {  
			  System.out.println(arr[i]);
		  }
		 System.out.println();
		 
		 
		 // [문제 6]
		 String todayIs = "맑음";
		 if(todayIs.equals("맑음")) {
			 System.out.println('O');
		 } else {
			 System.out.println('X');
		 }
		 
	}

}
