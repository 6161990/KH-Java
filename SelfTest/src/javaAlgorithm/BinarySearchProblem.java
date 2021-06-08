package javaAlgorithm;

public class BinarySearchProblem {

	public static void main(String[] args) {
		int[] numbers= {12,34,45,56,67,77,89,95,103};
		
		int target = 34;
		int left = 0;
		int right = numbers.length-1;
		int mid = (left+right)/2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			if(target == temp) {
				find = true;
				break;
			}else if(target < temp) {
				right = mid - 1; //비교하는 범위가 점점 좁아지게
			}else {
				left = mid + 1; //비교하는 범위가 점점 좁아지게
			}
			
			mid = (left+right)/2;
			temp = numbers[mid];
		}
		
		if(find == true) {
			mid++;
			System.out.println("찾는 수는 "+mid+"번째에 있습니다.");
		}else {
			System.out.println("찾는 수가 없습니다.");
		}
	}

}
