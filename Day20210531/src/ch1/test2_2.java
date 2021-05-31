package ch1;

import java.util.Scanner;

public class test2_2 {

	
	public void shift(){
		Scanner sc=new Scanner(System.in);
		System.out.printf("행갯수 입력");
		int line = sc.nextInt();
		System.out.printf("열갯수 입력");
		int row= sc.nextInt();
		
		int outputArray[][]=new int[row][line];
		for(int i=0;i<line; i++){
		  for(int j=0; j<row; j++){
				 outputArray[j][i]=sc.nextInt();
		  }  
		}
		print(outputArray);
	}
	
	
	public void print(int [][] outputArray){
		 System.out.println("치환");
		 for(int array[] : outputArray){
		    for(int i:array){
		       System.out.print(i+ " ");
		    }
		    System.out.print("\n");
		 }
	}
		        
		       
	public static void main(String[] args) {
		new test2_2().shift(); 
	}
		    
}
