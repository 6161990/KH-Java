package ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
	
	 public void shift(){ // 1. 행을 기준으로 수열 n개씩 3번 받고 shiftToArray로 넘김 
		Scanner scan = new Scanner(System.in);
		System.out.printf("임의의 수열 입력 (공백구분): ");
		int[] first = shiftToArray(scan.nextLine());
		System.out.printf("임의의 수열 입력 (공백구분): ");
		int[] second = shiftToArray(scan.nextLine());
		System.out.printf("임의의 수열 입력 (공백구분): ");
		int[] third = shiftToArray(scan.nextLine());
		System.out.println("치환완료");
		print(shiftToNewArray(first,second,third));
	 }
	 
	 
	public int[] shiftToArray(String inputJason) { //2. shift()에서 넘겨준 String값을 "1 2 3"
		String jason [] = inputJason.split(" ",0); // 공백 단위로 쪼개서 "1" "2" "3" 각각 하나씩 String 배열에 넣고
		int numbers [] = new int[jason.length]; //int형 배열 numbers[] 에
		for (int i = 0; i < jason.length; i++){
			numbers[i]= Integer.parseInt(jason[i]); //int로 parsing해서 넣는다
		}
		return numbers;  ///반환된 int형 배열
	}
			        
	
	public int[][] shiftToNewArray(int[] array1, int[] array2, int[] array3) { //int로 치환완료된 애들을 (각각 123,456,789)
		 int[][] returnArray = new int[array1.length][3]; //새로운 2차원 배열에
		 for (int i = 0; i < array1.length; i++) { 
			returnArray[i][0] = array1[i]; // array1, 2, 3에서 맨 첫번째 애들 각각 1,4,7 부터 뽑아
			returnArray[i][1] = array2[i]; // 새로운 2차월 배열 0번째부터 넣는다. 
			returnArray[i][2] = array3[i];
		 }
		 return returnArray;
	}
			       
	public void print(int [][] outputArray){
		for (int array [] : outputArray){
			for(int i : array){
			  System.out.print(i + " ");
		    }
		 System.out.print("\n");
		}
	 } 

	public static void main(String[] args) { 
		  new test2().shift(); 
	}
	        

}
