package javaAlgorithm;

public class InsertionSort {
	
	public static void insertionSort(int[] arr, int count) {
		int i=0, j=0; //i,j 초기화
		int temp=0;   // temp 초기화
		
		for(i=1; i<count; i++) { //i가 1부터 8까지
			temp = arr[i]; //arr[1]번 값을 temp에 넣기
			j=i; //j=1
			while((j>0)&& arr[j-1] > temp) { //j가 0보다 크고 arr[0]이 arr[1]보다 크면
				arr[j]=arr[j-1]; //arr[0]에 있는 값을 arr[1]에 넣고,(큰 값이 뒤 인덱스로 오게끔 자리바꿈)
				j=j-1; //인덱스[j]에 0값을 대입
			}
			arr[j]=temp; //arr[1]번(더 작은 값)에 있던 값을 arr[0]에 넣기 (작은 값이 앞 인덱스로 오게끔 자리바꿈)
		
		System.out.println("반복 -"+i);
		printSort(arr,count);
		}
	}
	
	public static void printSort(int value[], int count) {
		int i=0;
		for(i=0; i<count; i++) {
			System.out.print(value[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {40,50,20,60,10,70,30,80};
		insertionSort(arr,8);
	}

}
