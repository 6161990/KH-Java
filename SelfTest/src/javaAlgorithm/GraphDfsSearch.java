package javaAlgorithm;

import java.util.Stack;

public class GraphDfsSearch {
	
	int count;
	boolean[] visited; //방문했냐 방문안했냐 노드 수만큼의 배열이 필요
	Stack<Integer> stack;
	int[][] matrix;
	
	public GraphDfsSearch(int count) {
		this.count=count;
		visited = new boolean[count];	//count만큼 visited배열 생성
		stack = new Stack<Integer>();  //stack은 jdk가 사이즈 알아서 늘려줌
	}
	
	public void dfsTraversal() {
		stack.push(0);
		visited[0]=true;
		
		while(stack.isEmpty()==false) {
			int node = stack.pop();
			System.out.print(node+" ");
			
			for(int j=0; j<count; j++) {
				if(matrix[node][j] !=0 && visited[j] == false) { //연결이 되어있꼬, visited(stack)에 넣은 적이 없고
					stack.push(j);
					visited[j]=true;
				}
			}
		}
	}

	
	public static void main(String[] args) {

		//다이렉트 그래프면 addEdges를 두번 줘야하는데 Un다이렉트는 한번만 주면된다. 방향이 없으니 한번만 줘도 연결된 것. 반으로 딱 접히니까.
		int count=8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		GraphDfsSearch dfs = new GraphDfsSearch(count);
		dfs.matrix = graph.getMatrix();
		dfs.dfsTraversal();
	}

}
