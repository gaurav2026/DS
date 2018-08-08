package com.dlh.zambas.linked.list;

public class Intersection {

	public void findIntersection(Node A, Node B) {
		
		Node intersectionNode = null;
		Node currentA = A;
		Node currentB = B;
		int sizeA = 0, sizeB = 0;
		while(null!=A){
			sizeA++;
			A = A.getNext();
		}
		
		while(null!=B){
			sizeB++;
			B = B.getNext();
		}
		
		int diff = 0;
		int counter = 0;
		
		if(sizeA>sizeB){
			diff = sizeA-sizeB;
			while(counter<diff){
				currentA = currentA.getNext();
				counter++;
			}
			
		}
		if(sizeB>sizeA){
			diff = sizeB-sizeA;
			while(counter<diff){
				currentB = currentB.getNext();
				counter++;
			}
		}
		
		while(null!=currentA && null!=currentB){
			if(currentA.getData() == currentB.getData()){
				intersectionNode = currentA;
				break;
			}
			currentA = currentA.getNext();
			currentB = currentB.getNext();
		}
		
		while(null!=intersectionNode){
			System.out.print(intersectionNode.getData()+ " ");
			intersectionNode = intersectionNode.getNext();
		}

	}
}
