package com.dlh.zambas.linked.list;

import java.util.LinkedList;

public class Swap {

	public static void swap(LinkedList<Integer> l1, int m, int n) {
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < l1.size(); i++) {
			if(i==m-1){
				temp1 = l1.get(i);
			}
			
			if(i==l1.size()-n){
				temp2 = l1.get(i);
			}
		}
		
		l1.set(m-1, temp2);
		l1.set(l1.size()-n, temp1);
		
		System.out.println(l1);
	}
}
