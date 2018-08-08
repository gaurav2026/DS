package com.dlh.zambas.threads;

public class ProducerConsumerMain {
	public static void main(String[] args) throws InterruptedException {
		Message message = new Message("New message");

		Consumer consumer = new Consumer(message);
		Producer producer = new Producer(message);

		Thread p1 = new Thread(producer, "Producer1");
		Thread p2 = new Thread(producer, "Producer2");

		p1.start();
		p2.start();
		
		Thread.sleep(2000);

		Thread c1 = new Thread(consumer, "Consumer");
		c1.start();

		
	}
}
