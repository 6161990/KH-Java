package selftest.kh;

public class test7 {
	public static void main(String[] args) {
		String[] arr = {"사과","딸기","수박"};
		String[] copy= new String[3];
		
		System.out.println("===카피전=====");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]); //모두 null
		}
		
	
		System.arraycopy(arr, 0, copy, 0, arr.length);
						//(뭐를, 어디서부터, 어디로, 어디부터, 어디까지)
		System.out.println("====원본====");
		for(int i=0; i<arr.length; i++) { 
			System.out.println(arr[i]);
		}
		
		System.out.println("===복사본=====");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]);
		}
		
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = arr1.clone();
		
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
