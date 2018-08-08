package com.dlh.zambas.linked.list;

public class MergeSortedList {
	Node start = null;
	Node end = null;
	public void mergeTwoLists(Node A, Node B) {
		Node newList = null;
		Node startA = A;
		Node startB = B;

		while (null != startA && null != startB) {
			if (startA.getData() >= startB.getData()) {
				insertAtEnd(startB.getData());
				// newList = ll.getStart();
				startB = startB.getNext();
			} else {
				insertAtEnd(startA.getData());
				// newList = ll.getStart();
				startA = startA.getNext();
			}
		}

		while (null != startA) {
			insertAtEnd(startA.getData());
			// newList = ll.getStart();
			startA = startA.getNext();
		}

		while (null != startB) {
			insertAtEnd(startB.getData());
			// newList = ll.getStart();
			startB = startB.getNext();
		}
		newList = start;
		while (null != newList) {
			System.out.print(newList.getData() + " ");
			newList = newList.getNext();
		}

	}

	private void insertAtEnd(int val) {
		Node nptr = new Node(val, null);
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setNext(nptr);
			end = nptr;
		}
	}
}
