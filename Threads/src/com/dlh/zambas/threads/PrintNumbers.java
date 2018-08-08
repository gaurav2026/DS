package com.dlh.zambas.threads;

import java.util.ArrayList;

public class PrintNumbers{

	public static void main(String[] args) throws InterruptedException {
		NumberPojo pojo= new NumberPojo();
		ArrayList<Integer>  list = new ArrayList<Integer>();
		for(int i=0;i<11;i++){
			list.add(i);
		}
		NumberPojo.setList(list);
		
		Runnable oddNumbers = new OddNumbers(list);
		Thread oddNumbersThread = new Thread(oddNumbers);
		
		Runnable evenNumbers = new EvenNumbers(list);
		Thread evenNumbersThread = new Thread(evenNumbers);
		
		oddNumbersThread.start();
		oddNumbersThread.join();
		evenNumbersThread.start();
		
		System.out.println(NumberPojo.getList());
	}

}
