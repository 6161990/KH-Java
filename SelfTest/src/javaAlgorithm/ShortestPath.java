package javaAlgorithm;

class MyGraph{
    private int count;   //노드 수           
    private int[][] vertexMatrix;  // matrix로 그래프 표시
    private int[] distance;        // 특정 노드에 대한 각 노드의 최단 거리
    private boolean[] visited;     // 이미 선택되었는지
    private static int UNLIMIT = 999999999;  // 초기값 
    
    public MyGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
        distance = new int[count];
        visited = new boolean[count];
         
    }
    public void addEdges(int from, int to, int weight){
    	vertexMatrix[from][to] = weight;
    	vertexMatrix[to][from] = weight;
    }
 
    public void calcShotestPath(int from){ //어디서부터 출발하는지 기준 노드 from
         
        for(int i=0;i<count;i++){
            distance[i] = UNLIMIT; //처음은 초기값
        }
        
        visited[from] = true;  
        distance[from] = 0; //자기자신과의 거리는 0
        //연결노드 distance갱신
        for(int i= 0; i<count; i++){
            if(visited[from] && vertexMatrix[from][i] !=0){ //from 으로부터 가까운 애들 vertexMatrix[from][i]
                distance[i] = vertexMatrix[from][i];
            }
        }
         
        for(int k =0; k<count-1; k++){ //from은 처음 선택했으니까 count에서 -1빼고

            int min=UNLIMIT;
            int minIndex= -1;
            
            for(int i = 0; i< count ;i++){
                if(!visited[i] && distance[i]!=UNLIMIT){ //거쳐가는 노드로 선택된 적이 없으면서 //가장 가까운
                    if(distance[i] < min ){
                        min = distance[i];
                        minIndex = i;
                    }
                }
            }
            
            visited[minIndex] = true;
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


public class ShortestPath {

	public static void main(String[] args) {
		MyGraph graph = new MyGraph(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);

		graph.calcShotestPath(0);
		graph.showDistance(0);

	}
}

