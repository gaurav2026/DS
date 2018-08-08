package com.dlh.zambas.graph;

import java.util.LinkedList;

public class Graph {
	int vertex;
	LinkedList<Integer> adjListArray[];
	
	Graph(int vertex){
		this.vertex = vertex;
		adjListArray = new LinkedList[vertex];
		
		for(int i=0;i<vertex;i++){
			adjListArray[i] = new LinkedList<Integer>();
		}
	}
	
	
}
