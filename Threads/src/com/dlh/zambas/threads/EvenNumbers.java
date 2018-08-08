package com.dlh.zambas.threads;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers implements Runnable {

	private ArrayList<Integer> list  = null;

	public EvenNumbers(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		// printOdd();
		removeEven();
	}

	private void removeEven() {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			int value = iterator.next();
			if(value%2==0){
				iterator.remove();
			}
			System.out.println(list);
		}
		
		
	}

	private void printOdd() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.print("Even " + i + " ");

		}
	}

}
