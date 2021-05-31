package ch1;

import java.util.Scanner;

public class test2_3 {

	public void rowCols() {
		Scanner sc = new Scanner(System.in);
		System.out.println("행 개수 입력");
		int rows = sc.nextInt();
		System.out.println("열 개수 입력");
		int columns = sc.nextInt();
		
		int[][] array = new int[rows][columns];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				array[j][i]=sc.nextInt();
			}
		}
		print(array);
	}
	
	public void print(int[][] array) {
		for(int[] a : array) {
			for(int arr : a) {
				System.out.print(arr+" ");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		new test2_3().rowCols();
	}
}
