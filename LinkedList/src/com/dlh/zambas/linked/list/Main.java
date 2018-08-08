package com.dlh.zambas.linked.list;

public class Main {
	public static void main(String[] args) {
		LLOperations ll = new LLOperations();
		ll.insertAtEnd(11);
		ll.insertAtEnd(1);
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(2);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(4);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);
		ll.insertAtEnd(5);

		Node list1 = ll.getStart();

		LLOperations l = new LLOperations();
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(4);
		l.insertAtEnd(5);
		l.insertAtEnd(6);

		//new RemoveDuplicates().removeDuplicates(list1);
		new RemoveDuplicates().removeAllDuplicateEntries(list1);
	}
}
