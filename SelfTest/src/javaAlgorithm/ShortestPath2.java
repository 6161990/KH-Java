package javaAlgorithm;

class MyGraph1{
	private int count;
	private int[][] vertexMatrix;
	private int[] distance;
	private boolean[] visited;
	private static int UNLIMIT = 99999999;
	
	public MyGraph1(int count) {
		this.count=count;
		vertexMatrix = new int[count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public void calcShortestPath1(int from) {
		
		for(int i=0; i<count; i++) {
			distance[i]=UNLIMIT;
		}
		
		visited[from] = true;
		distance[from] = 0; 
		
		for(int i=0; i<count; i++) {
			if(visited[from] && vertexMatrix[from][i] !=0) {
				distance[i] = vertexMatrix[from][i];
			}
			System.out.println(from+"과 "+i+"의 원래 거리는"+distance[i]);
		}
		
		for(int k=0; k<count-1; k++) {
			int min = UNLIMIT;
			int minIndex=-1;
			
			for(int i=0; i<count; i++) {
				if(!visited[i] && distance[i]!=UNLIMIT) {
					if(distance[i]<min) {
						min = distance[i];//원래의 거리를 최단 거리에 놓고 더 최단거리가 또 나오면 update
						minIndex=i;
					}
					
				}
		
			}
			visited[minIndex]=true;
			for(int i=0; i<count; i++){
                if(!visited[i] && vertexMatrix[minIndex][i]!=0){ //vertexMatrix[minIndex][i] : 거쳐가는 노드의 인접노드
                    if(distance[i]>distance[minIndex]+vertexMatrix[minIndex][i]){ //원래 가는 길보다 돌아가는 게 더 빠르면
                        distance[i] = distance[minIndex]+vertexMatrix[minIndex][i]; //돌아가는 길 선택
                    }
                }
            }
		}
		
	}
	public void showDistance(int from) {
    	
    	for(int i = 0; i<count; i++) {
    		
    		System.out.println(from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
    	}
    }
}	
public class ShortestPath2 {

	public static void main(String[] args) {
		MyGraph1 graph1 = new MyGraph1(6);
		graph1.addEdges(0, 1, 1);
		graph1.addEdges(0, 2, 4);
		graph1.addEdges(1, 2, 2);
		graph1.addEdges(2, 3, 1);
		graph1.addEdges(3, 4, 8);
		graph1.addEdges(3, 5, 3);
		graph1.addEdges(4, 5, 4);
		
		graph1.calcShortestPath1(0);
		graph1.showDistance(0);

	}

}
