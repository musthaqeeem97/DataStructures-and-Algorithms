package graph;


public class GraphUsingAdjacencyMatrix {

	
	private int[][]adjacencyMatrix;
	private int vertices;
	private int edges;
	
	public GraphUsingAdjacencyMatrix(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adjacencyMatrix = new int[nodes][nodes];
		
	}
	
	public void addEdges(int u , int v) {
		
		adjacencyMatrix[u][v]=1;
		adjacencyMatrix[v][u]=1;
		edges++;
	}
	public void removeEdges(int u, int v) {
		adjacencyMatrix[u][v] = 0;
		adjacencyMatrix[v][u] = 0;
		edges--;
	}
    public void display() {
		
    	for (int i = 0; i <  vertices; i++) {
    		System.out.print(i+": ");
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjacencyMatrix[i][j]+" ");
			}
			System.out.println();
		}
    	
	}
	public static void main(String[] args) {
		
		GraphUsingAdjacencyMatrix graph = new GraphUsingAdjacencyMatrix(4);
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(3, 0);
		graph.display();
	}
	
}
