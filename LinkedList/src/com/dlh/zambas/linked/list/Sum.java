package com.dlh.zambas.linked.list;

public class Sum {

	public Node sum(Node list1, Node list2) {
		list1 = reverseList(list1);
		list2 = reverseList(list2);
		return add(list1, list2);
	}

	private Node add(Node list1, Node list2) {
		LLOperations ll = new LLOperations();
		int sum = 0;
		int carry = 0;
		while (null != list1 && null != list2) {
			sum = carry + list1.getData() + list2.getData();
			carry = sum / 10;
			sum %= 10;
			ll.insertAtEnd(sum);
			list1 = list1.getNext();
			list2 = list2.getNext();
		}
		return ll.getStart();
	}

	private Node reverseList(Node node) {
		Node currentNode = node;
		Node previousNode = null;
		Node nextNode = null;

		while (null != currentNode) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

	public Node reverseList(Node node, int num) {
		Node currentNode = node;
		Node previousNode = null;
		Node nextNode = null;
		int counter = 0;
		while (counter < num && null != currentNode) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
			counter++;
		}
		if (null != nextNode) {
			node.setNext(reverseList(nextNode, num));
		}

		return previousNode;

	}

	public void reverseBetween(Node A, int B, int C) {
		
		Node head = A;
		Node currentNode = A;
		Node previousNode = head;
		Node nextNode = null;
		Node saveHead = A;
		int counter = 1;
		while (null != head) {
			if (counter == B - 1) {
				saveHead = head;
			}
			if (counter == B) {
				currentNode = head;
			}
			if (counter == C) {
				previousNode = head.getNext();
				break;
			}
			head = head.getNext();
			counter++;
		}
		head = A;
		counter = B;
		while (counter <= C) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
			counter++;
		}
		if (B > 1) {
			saveHead.setNext(previousNode);
			previousNode = head;
		}
		while(null!=previousNode){
			System.out.print(previousNode.getData()+ " ");
			previousNode = previousNode.getNext();
		}
	}
	
	

}
