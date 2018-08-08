package com.dlh.zambas.threads;

public class Consumer implements Runnable{
	
	private Message message;
	
	public Consumer(Message message){
		this.message = message;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			synchronized(message){
				System.out.println("Notify threads");
				message.setMessage(message.getMessage() + " notifier work done");
				//message.notify();
				message.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
