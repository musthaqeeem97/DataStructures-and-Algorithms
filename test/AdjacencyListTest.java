package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import graph.GraphUsingAdjacencyList;

public class AdjacencyListTest {

   LinkedList<Integer>[] adjacencyList ;
   int vertices;
   int edges;
   
   public AdjacencyListTest(int nodes) {
	
	   this.vertices = nodes;
	   this.edges = 0;
	   this.adjacencyList = new LinkedList[nodes];
	   
	   for (int i = 0; i < adjacencyList.length; i++) {
		
		   this.adjacencyList[i] = new LinkedList<>();
	}
	
   }   
   public void addEdges(Integer u, Integer v) {
	   adjacencyList[u].add(v);
	   adjacencyList[v].add(u);
	   edges++;
   }
   
   public void bfs(int s) {
	   
	   boolean isVisited[] = new boolean[vertices];
	   Queue<Integer> queue = new LinkedList<>();
	   
	   isVisited[s]=true;
	   
	   queue.offer(s);
	   
	   while(!queue.isEmpty()) {
		   int u = queue.poll();
		   System.out.print(u+" ");
		   
		   for (Integer v : adjacencyList[u]) {
			
			   if (!isVisited[v]) {
				isVisited[v] = true;
				queue.offer(v);
			}
		}
	   }
   }
   
   public void dfs(int s) {
	   
	   boolean isVisited[] = new boolean[vertices];
	   Stack<Integer> stack = new Stack<>();
	   
	   stack.push(s);
	   
	   while (!stack.isEmpty()) {
		   
		 int u = stack.pop();
		 if (!isVisited[u]) {
			
			isVisited[u] = true;
			System.out.print(u+" ");
			
			for (Integer v : adjacencyList[u]) {
				if (!isVisited[v]) {
					stack.push(v);	
				}
			}
		}	   
	  }
   }
   
   @Override
	public String toString() {
		
	   StringBuilder sb = new StringBuilder();
	   
	   for (int i = 0; i < adjacencyList.length; i++) {
		   
		   if (adjacencyList[i]!=null) {
			   sb.append(i+": ");
			   for (Integer v : adjacencyList[i]) {
				   sb.append(v + " ");
			
			   }
		   }	   
		   sb.append("\n");
	   }
	   	return sb.toString();
	}
   
public void removeVertice(Integer verticeToRemove) {

// remove the vertex and all its edges from the list
for (int i = 0; i < vertices; i++) {
    if (adjacencyList[i] != null) {
        adjacencyList[i].removeIf(vertice -> vertice == verticeToRemove);
    }
}

// remove the list for the vertex
adjacencyList[verticeToRemove] = null;
}
	public static void main(String[] args) {
		AdjacencyListTest graph = new AdjacencyListTest(5);
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(3, 0);
		graph.addEdges(2, 4);
		graph.bfs(0);
		System.out.println();
		graph.dfs(0);
		System.out.println();
		System.out.println(graph);
		
		graph.removeVertice(0);
		System.out.println();
		System.out.println(graph);
		
	}
	
   
}
