package com.dlh.zambas.linked.list;

public class LinkedList1 {
	Node head;  // head of list
	 
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Given a reference (pointer to pointer) to the head of a list
       and a position, deletes the node at the given position */
    void deleteNode(int n)
    {
        if(head == null)
        	return;
        Node curr = head;
        Node prev = null;
        
        if(n==0 && head.next!=null){
        	curr = curr.next;
        	head = null;
        	head = curr;
        	return;
        }
        
        for(int i=0;i<n;i++){
        	prev = curr;
        	curr = curr.next;
        }
        
        if(null!=curr.next){
        	prev.next = curr.next;
        }
        else
        	prev.next = null;
    }
 
    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
 
    /* Drier program to test above functions. Ideally this function
       should be in a separate user class.  It is kept here to keep
       code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
        LinkedList1 llist = new LinkedList1();
 
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
 
        llist.deleteNode(4);  // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion ");
        llist.printList();
    }
}
