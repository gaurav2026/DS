package com.dlh.zambas.blocking.queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(10);
				Message message = new Message(""+i);
				queue.put(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		Message message = new Message("Exit");
		try {
			queue.put(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
