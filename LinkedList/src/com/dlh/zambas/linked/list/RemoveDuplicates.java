package com.dlh.zambas.linked.list;

public class RemoveDuplicates {

	public Node removeDuplicates(Node A){
		Node currentNode = A;
		Node nextNode = A;
		
		if(null==A){
			throw new IllegalArgumentException("Size must be greater than zero");
		}
		
		while(null!=currentNode.getNext()){
			 if(currentNode.getData() == currentNode.getNext().getData()){
				 nextNode = currentNode.getNext().getNext();
				 currentNode.setNext(null);
				 currentNode.setNext(nextNode);
			 }else{
				 currentNode = currentNode.getNext();
			 }
		}
		
		while(null!=A){
			System.out.print(A.getData()+" ");
			A = A.getNext();
		}
		return A;
	}
	
	public Node removeAllDuplicateEntries(Node A){
		Node currentNode = A;
		Node nextNode = A;
		int data = Integer.MIN_VALUE;
		
		if(null==A){
			throw new IllegalArgumentException("Size must be greater than zero");
		}else{
			data = A.getData();
		}
		
		while(null!=currentNode && null!=currentNode.getNext()){
			currentNode = currentNode.getNext();
			if(data == currentNode.getNext().getData()){
				if(null!=currentNode.getNext().getNext()){
					nextNode = currentNode.getNext().getNext();
					data = currentNode.getNext().getData();
					currentNode.getNext().setNext(null);
					currentNode.setNext(null);
					currentNode = nextNode;
				}else{
					currentNode.getNext().setNext(null);
					currentNode.setNext(null);
				}
			}else{
				data = currentNode.getData();
			//	currentNode = currentNode.getNext();
			}
		}
		System.out.println();
		while(null!=A){
			System.out.print(A.getData()+" ");
			A = A.getNext();
		}
		return A;
		
	}
	
	
}
