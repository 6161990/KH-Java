package Exception;

public class Exam {
	
    static void Loop() throws ArrayIndexOutOfBoundsException {
		int[] arr = {10,20,30};
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
