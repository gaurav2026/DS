package com.dlh.zambas.linked.list;

public class Loop {
	public Node detectCycle(Node a) {
		boolean isLoop = false;
	    Node slow = a;
	    Node fast = a;
	    int loopCount = 0;
	    while(null!=slow && null!=fast && null!=fast.getNext()){
	        slow = slow.getNext();
	        fast = fast.getNext().getNext();
	        
	        if(slow==fast){
	            loopCount = countLoopNodes(slow,fast);
	            isLoop = true;
	            break;
	        }
	    }
	    slow = a;
	    fast = a;
	    for(int i=0;i<loopCount;i++){
	    	slow = slow.getNext();
	    }
	    
	    while(slow!=fast){
	    	fast = fast.getNext();
	    }
	    if(isLoop)
	    	return fast;
	    else
	    	return null;
	}

	private int countLoopNodes(Node slow, Node fast) {
		int loopCount = 1;
		slow = slow.getNext();
		while(slow!=fast){
			slow = slow.getNext();
			loopCount++;
		}
		return loopCount;
	}
}
