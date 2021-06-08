package javaAlgorithm;

public class UndirectedGraph {
	
	private int count; //노드가 몇개
	private int[][] vertexMatrix; 
	
	public UndirectedGraph(int count) {//노드 몇개짜리 그래프냐
		this.count=count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdges(int from, int to, int weight) { //간선의 유무 , 정보를 넣기 위해 
		vertexMatrix[from][to] = weight; //다이렉트 그래프면 from ,to 값이 같지 않음
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
	

