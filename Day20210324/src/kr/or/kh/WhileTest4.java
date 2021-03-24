package kr.or.kh;

public class WhileTest4 {

	public static void main(String[] args) {
		int number=0;
		char c='A';
		aaa: while(true) {
		     while(true) {
		    	 number++;
		    	 System.out.print(c++ +"");
		    	 if(number%5==0) {
		    		 break;
		    	 }
		    	 if(number==26) {
		    		 break aaa;
		    	 }
		     }//안쪽	
		     System.out.println();
		}//바깥쪽 반복
		}

}
