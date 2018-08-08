package com.dlh.zambas.graph;

public class AdjacencyList {

	public void addEdge(Graph graph, int source, int destination) {
		/**
		 * source to destination
		 */
		graph.adjListArray[source].addFirst(destination);
		/**
		 * in case of undirected graph add from destination to source as well
		 */
		graph.adjListArray[destination].addFirst(source);
	}

	public void printPath(Graph graph) {
		for (int i = 0; i < graph.vertex; i++) {
			System.out.println("adjacency list of vertex " + i);
			System.out.print("head ");
			for (Integer k : graph.adjListArray[i]) {
				System.out.print(" -- > " + k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		AdjacencyList adjacencyList = new AdjacencyList();
		adjacencyList.addEdge(graph, 0, 1);
		adjacencyList.addEdge(graph, 0, 4);
		adjacencyList.addEdge(graph, 1, 2);
		adjacencyList.addEdge(graph, 1, 3);
		adjacencyList.addEdge(graph, 1, 4);
		adjacencyList.addEdge(graph, 2, 3);
		adjacencyList.addEdge(graph, 3, 4);

		adjacencyList.printPath(graph);
	}
}
