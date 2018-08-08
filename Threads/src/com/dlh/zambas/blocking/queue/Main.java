package com.dlh.zambas.blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	
	public static void main(String[] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}
}
