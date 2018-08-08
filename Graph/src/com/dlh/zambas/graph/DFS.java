package com.dlh.zambas.graph;

import java.util.Iterator;

public class DFS {

	public static void addEdge(Graph graph, int src, int dest) {
		graph.adjListArray[src].add(dest);
	}

	public static void dfs(Graph graph, int vertex) {
		boolean visited[] = new boolean[graph.vertex];
		dfsUtil(graph, vertex, visited);
	}

	private static void dfsUtil(Graph graph, int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print(vertex+ " ");
		Iterator<Integer> it = graph.adjListArray[vertex].listIterator();
		while(it.hasNext()){
			vertex = it.next();
			if(!visited[vertex]){
				dfsUtil(graph, vertex, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		 Graph g = new Graph(4);
		 
	        addEdge(g,0, 1);
	        addEdge(g,0, 2);
	        addEdge(g,1, 2);
	        addEdge(g,2, 0);
	        addEdge(g,2, 3);
	        addEdge(g,3, 3);
	 
	        System.out.println("Following is Depth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        dfs(g,2);
	}
}
