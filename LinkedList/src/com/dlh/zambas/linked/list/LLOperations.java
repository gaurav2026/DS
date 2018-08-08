package com.dlh.zambas.linked.list;

public class LLOperations {

	protected Node start = null;
	protected Node end = null;

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public Node getEnd() {
		return end;
	}

	public void setEnd(Node end) {
		this.end = end;
	}

	/* Function to insert an element at end */
	public void insertAtEnd(int val) {
		Node nptr = new Node(val, null);
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setNext(nptr);
			end = nptr;
		}
	}

	public int getSize(Node node) {
		int counter = 0;
		while (null != node.getNext()) {
			counter++;
			node = node.getNext();
		}
		return ++counter;

	}

	public void printAll(Node node) {
		while (null != node) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}

	public Node removeDuplicates(Node node) {
		Node prev = node;
		Node curr = node;
		Node next_next = null;
		while (null != curr.getNext()) {
			if (curr.getData() == curr.getNext().getData()) {
				next_next = curr.getNext().getNext();
				curr.setNext(null);
			} else {
				
			}
		}
		return prev;
	}

}
