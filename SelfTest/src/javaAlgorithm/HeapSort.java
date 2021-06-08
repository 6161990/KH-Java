package javaAlgorithm;

public class HeapSort {
	
	private int SIZE; //힙의 사이즈
	private int heapArr[];
	
	public HeapSort() {
		SIZE=0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE; // insert하면 heap의 사이즈 늘려줌 맨끝에 i위치시킴(size값과 동일, while을 돌면서 i위치가 청해지는 것임)
		//while((i!=1)&&(input > heapArr[i/2])) { //max heap
		while( ( i != 1 ) && ( input < heapArr[i/2])){ //min heap 작은 값이 위에 큰값이 아래  //삽입된 값이 부모보다 작다면 삽입 값을 위로 올려
			heapArr[i] = heapArr[i/2]; //부모(=heapArri/2)를 아랫칸으로 옮기고, 
			i = i/2; // 그 부모의 부모값을 기준값 i로 (while의 i값 변경됨 또 순환)
		} // 삽입값이 부모 값보다 크면 (OR 부모값이 없으면, i=SIZE=1이면)
		heapArr[i]=input; //삽입값 그때 위치로.
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		int parent, child;
		int data, temp;
		data = heapArr[1]; //Max,Min이든 가장 맨 위 루트를 꺼냄
		
		temp = heapArr[SIZE]; //맨 끝 값을 temp에(min heap이라면 가장 큰 값을 temp에) 
		SIZE -=1;  //삭제니까 사이즈 줄여주기
		parent=1; child =2; 
		
		while(child <= SIZE) {
			//if((child < SIZE) && (heapArr[child]< heapArr[child+1])) { //max heap
			if((child < SIZE) && (heapArr[child] > heapArr[child+1])) { //min heap //형제 노드 중 더 작은 값을 선택
				child++;
			}
			//if(temp>= heapArr[child]) break; //max heap
			if(temp <= heapArr[child]) break; //min heap //temp가 child의 부모가 되면 while빠져나옴
			heapArr[parent] = heapArr[child]; //아직 temp가 child보다 크면 그 부모와 비교위해 child와 parent자리바꿈
			parent=child; //비교 기준 바꾸기
			child *= 2; // 그 밑의 child들 
		}
		heapArr[parent] = temp; //while문 빠져나왔을 때의 temp값을 parent갑승로 
		return data;
	}
	
	public void printHeap() {
		//System.out.printf("\n Max Heap :");
		System.out.printf("\n Min Heap :");
		for(int i=1; i<=SIZE; i++) {
			System.out.printf("[%d] ", heapArr[i]);
		}
	}
	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSize();
		for(int i=1; i<=n; i++) {
			data=h.deleteHeap();
			System.out.printf("\n 출력 [%d]", data);
		}
	}

}
