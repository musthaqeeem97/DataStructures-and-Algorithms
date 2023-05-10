package graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GraphUsingAdjacencyList {

	private LinkedList<Integer> [] adjacencyLists;
	private int vertices;
	private int edges;
	
	
	public GraphUsingAdjacencyList(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adjacencyLists = new LinkedList[nodes];
		
		for (int i = 0; i < adjacencyLists.length; i++) {
			this.adjacencyLists[i] = new LinkedList<>();
		} 
	}
	
	public void addEdges(int u, int v) {
		adjacencyLists[u].add(v);
		adjacencyLists[v].add(u);
		edges++;
		
	}
	public void bfs(int searchElement) {
		
		boolean visited[] = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<>();
		
		visited[searchElement] = true;
		queue.offer(searchElement);
		
		while(!queue.isEmpty()) {
			int vertice = queue.poll();
			System.out.print(vertice +" ");
			
			for (Integer adjacentVertice : adjacencyLists[vertice]) {
				if (!visited[adjacentVertice]) {
					visited[adjacentVertice] = true;
					queue.offer(adjacentVertice);
				}
			}
			
		}
	}
	public void dfs(int searchELement) {
		
		boolean visited[] = new boolean[vertices];
		
		Stack<Integer> stack = new Stack<>();
		visited[searchELement] = true;
		stack.push(searchELement);
		
		while (!stack.isEmpty()) {
	     
			int vertice = stack.pop();
			System.out.print(vertice+" ");
			for (Integer adjacentVertice : adjacencyLists[vertice]) {
				if (!visited[adjacentVertice]) {
					visited[adjacentVertice] = true;
					stack.push(adjacentVertice);
				}
			}
		}
		
		
	}
	
	public void removeVertice(Integer verticeToRemove) {
		
		for (int i = 0; i < vertices; i++) {
			if(adjacencyLists[i]!=null) {
				adjacencyLists[i].removeIf(vertice->vertice==verticeToRemove);
			}
		}
		adjacencyLists[verticeToRemove]= null;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("vertices: "+ vertices + " edges: " + edges + "\n");
		
		for (int i = 0; i < vertices; i++) {
			
			if (adjacencyLists[i]!=null) {
				sb.append(i+": ");
				for (Integer adjacentVertice : adjacencyLists[i]) {
					sb.append(adjacentVertice + " ");
			}
		}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public boolean hasCycle() {
		
		boolean isVisited[] = new boolean[vertices];
		
		for (int i = 0; i < vertices; i++) {
			if (!isVisited[i] &&  hasCycleDFS(i,isVisited,-1 )) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasCycleDFS(int v, boolean[] isVisited , int parent) {
		
		isVisited[v] = true;
		
		for (int  neighbor: adjacencyLists[v]) {
			if (!isVisited[neighbor]) {
				if (hasCycleDFS(neighbor, isVisited, v)) {
					return true;
				}
			}
			
			//if a neighbor node is visited and is not the parent node then there must be a cycle
			else if(neighbor!=parent){
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		GraphUsingAdjacencyList graph = new GraphUsingAdjacencyList(5);
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(2, 4);
		graph.addEdges(4, 0);
		graph.bfs(0);
		System.out.println();
		graph.dfs(0);
		System.out.println();
		System.out.println(graph);
		
		System.out.println(graph.hasCycle());
	}
	
	
	
}
